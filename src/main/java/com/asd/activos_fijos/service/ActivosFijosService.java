package com.asd.activos_fijos.service;

import java.util.List;

import com.asd.activos_fijos.commons.GenericService;
import com.asd.activos_fijos.dto.ActivosFijosDTO;
import com.asd.activos_fijos.entity.ActivosFijos;

public interface ActivosFijosService extends GenericService<ActivosFijos, String>{
	
	List<ActivosFijosDTO> findAll();
	
	ActivosFijosDTO findByid(String id);
	
	List<ActivosFijosDTO> findByAfTipoActivo(String tipoActivo);
	
	List<ActivosFijosDTO> findByAfFechaCompra(String fechaCompra) throws Exception;
	
	ActivosFijosDTO findByAfSerial(String serial);
	
	ActivosFijosDTO save(ActivosFijosDTO activosFijosDto) throws Exception;
	
	void delete(ActivosFijosDTO activosFijosDto);
	
}
