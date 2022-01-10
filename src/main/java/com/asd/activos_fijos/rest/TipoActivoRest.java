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

import com.asd.activos_fijos.dto.TipoActivoDTO;
import com.asd.activos_fijos.service.TipoActivoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/tipoActivo")
public class TipoActivoRest {
	private static final Logger logger = LoggerFactory.getLogger(TipoActivoRest.class);
	
	@Autowired
	private TipoActivoService tipoActivoService;
	
	@GetMapping(value="/all")
	@ApiOperation(value = "TipoActivo", nickname = "Consultar todas las tipoActivo")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public List<TipoActivoDTO> getAll(){
		return tipoActivoService.findAll();
	}
	
	@GetMapping(value="/get/{id}")
	@ApiOperation(value = "TipoActivo", nickname = "Consultar ciudad por Id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<TipoActivoDTO> get(@PathVariable String id){
		
		return new ResponseEntity<TipoActivoDTO>(tipoActivoService.findByid(id), HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/save")
	@ApiOperation(value = "TipoActivo", nickname = "Creación ciudad")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<TipoActivoDTO> save(@RequestBody TipoActivoDTO tipoActivoDto) throws Exception {
		TipoActivoDTO obj = new TipoActivoDTO();
		
		try {
			obj = tipoActivoService.save(tipoActivoDto);
		}catch(DataIntegrityViolationException ex) {
			logger.error(ex.getMessage().toString());
			throw new Exception(ex.getCause().getCause().getMessage());
		}
		return new ResponseEntity<TipoActivoDTO>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<TipoActivoDTO> delete(@PathVariable String id){
		TipoActivoDTO tipoActivoDto = tipoActivoService.findByid(id);
		if(tipoActivoDto != null) {
			tipoActivoService.delete(tipoActivoDto);
		}else {
			return new ResponseEntity<TipoActivoDTO>(tipoActivoDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<TipoActivoDTO>(tipoActivoDto, HttpStatus.OK);
		
	}
}
