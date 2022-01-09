package com.asd.activos_fijos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.asd.activos_fijos.commons.impl.GenericServiceImpl;
import com.asd.activos_fijos.dao.ArticulosDAO;
import com.asd.activos_fijos.entity.Articulos;
import com.asd.activos_fijos.service.ArticulosService;

public class ArticulosServiceImpl extends GenericServiceImpl<Articulos, String> implements ArticulosService {

	@Autowired
	ArticulosDAO articulosDato;
	
	@Override
	public CrudRepository<Articulos, String> getDao() {
		return articulosDato;
	}



}
