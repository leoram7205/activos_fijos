package com.asd.activos_fijos.service;

import java.util.List;

import com.asd.activos_fijos.dto.TipoActivoDTO;

public interface TipoActivoService {
	List<TipoActivoDTO> findAll();
	
	TipoActivoDTO findByid(String id);
	
	TipoActivoDTO save(TipoActivoDTO tipoActivoDto);
	
	void delete(TipoActivoDTO tipoActivoDto);
}
