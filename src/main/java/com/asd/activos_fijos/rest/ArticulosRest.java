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

import com.asd.activos_fijos.dto.ArticulosDTO;
import com.asd.activos_fijos.service.ArticulosService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/articulos")
public class ArticulosRest {
	private static final Logger logger = LoggerFactory.getLogger(ArticulosRest.class);
	
	@Autowired
	ArticulosService articulosService;
	
	@GetMapping(value="/all")
	@ApiOperation(value = "Articulos", nickname = "Consultar todos los articulos")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public List<ArticulosDTO> getAll(){
		return articulosService.findAll();
	}
	
	@GetMapping(value="/get/{id}")
	@ApiOperation(value = "Articulos", nickname = "Consultar articulo por Id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<ArticulosDTO> get(@PathVariable String id){
		
		return new ResponseEntity<ArticulosDTO>(articulosService.findByid(id), HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/save")
	@ApiOperation(value = "Articulos", nickname = "Creación articulo")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<ArticulosDTO> save(@RequestBody ArticulosDTO articulosDto) throws Exception {
		ArticulosDTO obj = new ArticulosDTO();
		
		try {
			obj = articulosService.save(articulosDto);
		}catch(DataIntegrityViolationException ex) {
			logger.error(ex.getMessage().toString());
			throw new Exception(ex.getCause().getCause().getMessage());
		}
		return new ResponseEntity<ArticulosDTO>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<ArticulosDTO> delete(@PathVariable String id){
		ArticulosDTO articulosDto = articulosService.findByid(id);
		if(articulosDto != null) {
			articulosService.delete(id);
		}else {
			return new ResponseEntity<ArticulosDTO>(articulosDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<ArticulosDTO>(articulosDto, HttpStatus.OK);
		
	}
}
