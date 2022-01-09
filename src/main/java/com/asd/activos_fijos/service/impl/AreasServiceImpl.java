package com.asd.activos_fijos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.asd.activos_fijos.commons.impl.GenericServiceImpl;
import com.asd.activos_fijos.dao.AreasDAO;
import com.asd.activos_fijos.entity.Areas;
import com.asd.activos_fijos.service.AreasService;

public class AreasServiceImpl extends GenericServiceImpl<Areas, String> implements AreasService{

	@Autowired
	AreasDAO areasDao;
	
	@Override
	public CrudRepository<Areas, String> getDao() {
		return areasDao;
	}

}
