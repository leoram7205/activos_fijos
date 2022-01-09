package com.asd.activos_fijos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.asd.activos_fijos.commons.impl.GenericServiceImpl;
import com.asd.activos_fijos.dao.CiudadesDAO;
import com.asd.activos_fijos.entity.Ciudades;
import com.asd.activos_fijos.service.CiudadesService;

public class CiudadesServiceImpl extends GenericServiceImpl<Ciudades, String> implements CiudadesService{

	@Autowired
	CiudadesDAO ciudadesDao;
	
	@Override
	public CrudRepository<Ciudades, String> getDao() {
		return ciudadesDao;
	}

}
