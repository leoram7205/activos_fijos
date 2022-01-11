package com.asd.activos_fijos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asd.activos_fijos.dto.AreasDTO;
import com.asd.activos_fijos.service.AreasService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@CrossOrigin({"*"})
@RequestMapping(value = "/areas")
public class AreasRest {
	
	@Autowired
	private AreasService areasService;
	
	@GetMapping(value="/all")
	@ApiOperation(value = "areas", nickname = "Consultar todas las área")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public List<AreasDTO> getAll(){
		return this.areasService.findAll();
	}
	
	@GetMapping(value="/get/{id}")
	@ApiOperation(value = "areas", nickname = "Consultar área por Id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<AreasDTO> get(@PathVariable String id){
		
		return new ResponseEntity<AreasDTO>(this.areasService.findByid(id), HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/save")
	@ApiOperation(value = "areas", nickname = "Creación área")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resultado Exisotso", response = ResponseEntity.class)})
	public ResponseEntity<AreasDTO> save(@RequestBody AreasDTO areasDto) {
		AreasDTO obj = new AreasDTO();
		
		obj = this.areasService.save(areasDto);
		return new ResponseEntity<AreasDTO>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<AreasDTO> delete(@PathVariable String id){
		AreasDTO areasDto = this.areasService.findByid(id);
		if(areasDto != null) {
			this.areasService.delete(id);
		}else {
			return new ResponseEntity<AreasDTO>(areasDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<AreasDTO>(areasDto, HttpStatus.OK);
		
	}
}
