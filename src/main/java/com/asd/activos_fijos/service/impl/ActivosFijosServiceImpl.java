package com.asd.activos_fijos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.asd.activos_fijos.commons.impl.GenericServiceImpl;
import com.asd.activos_fijos.dao.ActivosFijosDAO;
import com.asd.activos_fijos.entity.ActivosFijos;
import com.asd.activos_fijos.service.ActivosFijosService;

public class ActivosFijosServiceImpl extends GenericServiceImpl<ActivosFijos, String> implements ActivosFijosService{

	@Autowired
	ActivosFijosDAO activosFijosDao;
	
	@Override
	public CrudRepository<ActivosFijos, String> getDao() {
		return activosFijosDao;
	}

}
