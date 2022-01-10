package com.asd.activos_fijos.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asd.activos_fijos.dto.PersonasDTO;
import com.asd.activos_fijos.service.PersonasService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/personas")
public class PersonasRest {
private static final Logger logger = LoggerFactory.getLogger(PersonasRest.class);
	
	@Autowired
	private PersonasService personasService;
	
	@GetMapping(value="/all")
	@ApiOperation(value = "Personas", nickname = "Consultar todas las personas")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public List<PersonasDTO> getAll(){
		return personasService.findAll();
	}
	
	@GetMapping(value="/get/{id}")
	@ApiOperation(value = "Personas", nickname = "Consultar ciudad por Id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<PersonasDTO> get(@PathVariable String id){
		
		return new ResponseEntity<PersonasDTO>(personasService.findByid(id), HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/save")
	@ApiOperation(value = "Personas", nickname = "Creación ciudad")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<PersonasDTO> save(@RequestBody PersonasDTO personasDto) throws Exception {
		PersonasDTO obj = new PersonasDTO();
		
		try {
			obj = personasService.save(personasDto);
		}catch(DataIntegrityViolationException ex) {
			logger.error(ex.getMessage().toString());
			throw new Exception(ex.getCause().getCause().getMessage());
		}
		return new ResponseEntity<PersonasDTO>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<PersonasDTO> delete(@PathVariable String id){
		PersonasDTO personasDto = personasService.findByid(id);
		if(personasDto != null) {
			personasService.delete(personasDto);
		}else {
			return new ResponseEntity<PersonasDTO>(personasDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<PersonasDTO>(personasDto, HttpStatus.OK);
		
	}
}
