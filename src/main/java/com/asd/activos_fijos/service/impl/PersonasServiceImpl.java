package com.asd.activos_fijos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.asd.activos_fijos.commons.impl.GenericServiceImpl;
import com.asd.activos_fijos.dao.PersonasDAO;
import com.asd.activos_fijos.entity.Personas;
import com.asd.activos_fijos.service.PersonasService;

public class PersonasServiceImpl extends GenericServiceImpl<Personas, String> implements PersonasService {

	@Autowired
	PersonasDAO personasDao;
	
	@Override
	public CrudRepository<Personas, String> getDao() {
		return null;
	}

}
