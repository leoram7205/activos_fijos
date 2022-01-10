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

import com.asd.activos_fijos.dto.CiudadesDTO;
import com.asd.activos_fijos.service.CiudadesService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/ciudades")
public class CiudadesRest {

	private static final Logger logger = LoggerFactory.getLogger(CiudadesRest.class);
	
	@Autowired
	private CiudadesService ciudadesService;
	
	@GetMapping(value="/all")
	@ApiOperation(value = "Ciudades", nickname = "Consultar todas las ciudades")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public List<CiudadesDTO> getAll(){
		return ciudadesService.findAll();
	}
	
	@GetMapping(value="/get/{id}")
	@ApiOperation(value = "Ciudades", nickname = "Consultar ciudad por Id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<CiudadesDTO> get(@PathVariable String id){
		
		return new ResponseEntity<CiudadesDTO>(ciudadesService.findById(id), HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/save")
	@ApiOperation(value = "Ciudades", nickname = "Creación ciudad")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<CiudadesDTO> save(@RequestBody CiudadesDTO ciudadesDto) throws Exception {
		CiudadesDTO obj = new CiudadesDTO();
		
		try {
			obj = ciudadesService.save(ciudadesDto);
		}catch(DataIntegrityViolationException ex) {
			logger.error(ex.getMessage().toString());
			throw new Exception(ex.getCause().getCause().getMessage());
		}
		return new ResponseEntity<CiudadesDTO>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<CiudadesDTO> delete(@PathVariable String id){
		CiudadesDTO ciudadesDto = ciudadesService.findById(id);
		if(ciudadesDto != null) {
			ciudadesService.delete(id);
		}else {
			return new ResponseEntity<CiudadesDTO>(ciudadesDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<CiudadesDTO>(ciudadesDto, HttpStatus.OK);
		
	}
}
