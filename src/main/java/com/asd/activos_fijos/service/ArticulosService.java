package com.asd.activos_fijos.service;

import java.util.List;

import com.asd.activos_fijos.commons.GenericService;
import com.asd.activos_fijos.dto.ArticulosDTO;
import com.asd.activos_fijos.entity.Articulos;

public interface ArticulosService extends GenericService<Articulos, String>{
	
	List<ArticulosDTO> findAll();
	
	ArticulosDTO findByid(String id);
	
	ArticulosDTO save(ArticulosDTO articulosDto);
	
	void delete(ArticulosDTO articulosDto);
}
