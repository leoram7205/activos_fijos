package com.asd.activos_fijos.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.asd.activos_fijos.commons.impl.GenericServiceImpl;
import com.asd.activos_fijos.dao.AreasDAO;
import com.asd.activos_fijos.dao.CiudadesDAO;
import com.asd.activos_fijos.dto.AreasDTO;
import com.asd.activos_fijos.entity.Areas;
import com.asd.activos_fijos.rest.AreasRest;
import com.asd.activos_fijos.service.AreasService;
import com.asd.activos_fijos.utils.MHelpers;

@Service
public class AreasServiceImpl extends GenericServiceImpl<Areas, String> implements AreasService{

	private static final Logger logger = LoggerFactory.getLogger(AreasRest.class);
	
	@Autowired
	AreasDAO areasDao;
	
	@Autowired
	CiudadesDAO ciudadesDao;
	
	@Override
	public CrudRepository<Areas, String> getDao() {
		return areasDao;
	}
	
	@Override
	public List<AreasDTO> findAll() {
		List<AreasDTO> listaAreasDto = new ArrayList<>();
		
		Iterable<Areas> areasItr = this.areasDao.findAll();
		
		for(Areas area: areasItr) {
			
			AreasDTO areasDto = new AreasDTO();
			areasDto = MHelpers.modelMapper().map(area, AreasDTO.class);
			listaAreasDto.add(areasDto);
		}
		
		return listaAreasDto;
	}

	@Override
	public AreasDTO findByid(String id) {
		Optional<Areas> areas = this.areasDao.findById(id);
		AreasDTO areasDto = MHelpers.modelMapper().map(areas.get(), AreasDTO.class);
		
		return areasDto;
	}

	@Override
	public AreasDTO save(AreasDTO areasDto) throws SQLException {
		Areas areas = MHelpers.modelMapper().map(areasDto, Areas.class);
		
		try {
			areas =  this.areasDao.save(areas);
			areasDto = MHelpers.modelMapper().map(areas, AreasDTO.class);
		}catch(DataIntegrityViolationException ex) {
			logger.error(ex.getCause().getLocalizedMessage());
			logger.error(ex.getCause().getMessage());
			throw new SQLException(ex.getCause().getMessage());
		}
		return areasDto;
	}

	@Override
	public void delete(AreasDTO areasDto) {
		Areas areas = MHelpers.modelMapper().map(areasDto, Areas.class);
		this.areasDao.delete(areas);
	}

}
