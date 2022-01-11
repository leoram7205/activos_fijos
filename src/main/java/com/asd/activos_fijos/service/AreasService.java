package com.asd.activos_fijos.service;

import java.util.List;

import com.asd.activos_fijos.commons.GenericService;
import com.asd.activos_fijos.dto.AreasDTO;
import com.asd.activos_fijos.entity.Areas;

public interface AreasService extends GenericService<Areas, String>{
	
	List<AreasDTO> findAll();
	
	AreasDTO findByid(String id);
	
	AreasDTO save(AreasDTO areasDto) ;
	
	void delete(AreasDTO areasDto);
	
}
