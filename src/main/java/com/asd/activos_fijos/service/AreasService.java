package com.asd.activos_fijos.service;

import java.sql.SQLException;
import java.util.List;

import com.asd.activos_fijos.commons.GenericService;
import com.asd.activos_fijos.dto.AreasDTO;
import com.asd.activos_fijos.entity.Areas;

public interface AreasService extends GenericService<Areas, String>{
	
	List<AreasDTO> findAll();
	
	AreasDTO findByid(String id);
	
	AreasDTO save(AreasDTO areasDto) throws SQLException;
	
	void delete(AreasDTO areasDto);
	
}
