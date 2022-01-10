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

import com.asd.activos_fijos.dto.ActivosFijosDTO;
import com.asd.activos_fijos.service.ActivosFijosService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/activosFijos")
public class ActivosFijosRest {
private static final Logger logger = LoggerFactory.getLogger(ActivosFijosRest.class);
	
	@Autowired
	private ActivosFijosService activosFijosService;
	
	@GetMapping(value="/all")
	@ApiOperation(value = "ActivosFijos", nickname = "Consultar todos los Activo Fijo")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public List<ActivosFijosDTO> getAll(){
		return activosFijosService.findAll();
	}
	
	@GetMapping(value="/get/{id}")
	@ApiOperation(value = "ActivosFijos", nickname = "Consultar Activo Fijo por Id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<ActivosFijosDTO> get(@PathVariable String id){
		
		return new ResponseEntity<ActivosFijosDTO>(activosFijosService.findByid(id), HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/save")
	@ApiOperation(value = "ActivosFijos", nickname = "Creación Activo Fijo")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<ActivosFijosDTO> save(@RequestBody ActivosFijosDTO activosFijosDto) throws Exception {
		ActivosFijosDTO obj = new ActivosFijosDTO();
		
		try {
			obj = activosFijosService.save(activosFijosDto);
		}catch(DataIntegrityViolationException ex) {
			logger.error(ex.getMessage().toString());
			throw new Exception(ex.getCause().getCause().getMessage());
		}
		return new ResponseEntity<ActivosFijosDTO>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<ActivosFijosDTO> delete(@PathVariable String id){
		ActivosFijosDTO activosFijosDto = activosFijosService.findByid(id);
		if(activosFijosDto != null) {
			activosFijosService.delete(activosFijosDto);
		}else {
			return new ResponseEntity<ActivosFijosDTO>(activosFijosDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<ActivosFijosDTO>(activosFijosDto, HttpStatus.OK);
		
	}
	
	@GetMapping(value="/findByTipoActivo/{tipoActivo}")
	@ApiOperation(value = "ActivosFijos", nickname = "Consultar Activo Fijo por Id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<List<ActivosFijosDTO>> findByTipoActivo(@PathVariable String tipoActivo){
		
		return new ResponseEntity<List<ActivosFijosDTO>>(activosFijosService.findByAfTipoActivo(tipoActivo), HttpStatus.OK);
		
	}
	
	@GetMapping(value="/findByFechaCompra/{fechaCompra}")
	@ApiOperation(value = "ActivosFijos", nickname = "Consultar Activo Fijo por Fecha Compra")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<List<ActivosFijosDTO>> findByFechaCompra(@PathVariable String fechaCompra) throws Exception{
		
		return new ResponseEntity<List<ActivosFijosDTO>>(activosFijosService.findByAfFechaCompra(fechaCompra), HttpStatus.OK);
		
	}
	
	@GetMapping(value="/findBySerial/{serial}")
	@ApiOperation(value = "ActivosFijos", nickname = "Consultar Activo Fijo por Serial")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<ActivosFijosDTO> findBySerial(@PathVariable String serial){
		
		return new ResponseEntity<ActivosFijosDTO>(activosFijosService.findByAfSerial(serial), HttpStatus.OK);
		
	}
}
