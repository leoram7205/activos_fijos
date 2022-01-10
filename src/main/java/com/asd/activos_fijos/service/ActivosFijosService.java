package com.asd.activos_fijos.service;

import java.util.List;

import com.asd.activos_fijos.commons.GenericService;
import com.asd.activos_fijos.dto.ActivosFijosDTO;
import com.asd.activos_fijos.entity.ActivosFijos;

public interface ActivosFijosService extends GenericService<ActivosFijos, String>{
	
	List<ActivosFijosDTO> findAll();
	
	ActivosFijosDTO findByid(String id);
	
//	List<ActivosFijosDTO> findByPlPeriodo(String periodo);
	
	ActivosFijosDTO save(ActivosFijosDTO activosFijosDto);
	
	void delete(ActivosFijosDTO activosFijosDto);
	
//	List<ActivosFijosDTO> findByPlEstado(String estado);
}
