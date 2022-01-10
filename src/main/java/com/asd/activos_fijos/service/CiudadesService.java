package com.asd.activos_fijos.service;

import com.asd.activos_fijos.entity.Ciudades;

import java.util.List;

import com.asd.activos_fijos.commons.GenericService;
import com.asd.activos_fijos.dto.CiudadesDTO;

public interface CiudadesService extends GenericService<Ciudades, String>{
	List<CiudadesDTO> findAll();
	
	CiudadesDTO findById(String id);
	
	CiudadesDTO save(CiudadesDTO ciudadesDto);
	
	void delete(CiudadesDTO ciudadesDto);
}
