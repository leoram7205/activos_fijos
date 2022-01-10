package com.asd.activos_fijos.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.asd.activos_fijos.commons.impl.GenericServiceImpl;
import com.asd.activos_fijos.dao.ActivosFijosDAO;
import com.asd.activos_fijos.dto.ActivosFijosDTO;
import com.asd.activos_fijos.entity.ActivosFijos;
import com.asd.activos_fijos.service.ActivosFijosService;
import com.asd.activos_fijos.utils.MHelpers;

@Service
public class ActivosFijosServiceImpl extends GenericServiceImpl<ActivosFijos, String> implements ActivosFijosService{

	@Autowired
	ActivosFijosDAO activosFijosDao;
	
	@Override
	public CrudRepository<ActivosFijos, String> getDao() {
		return activosFijosDao;
	}
	
	@Override
	public List<ActivosFijosDTO> findAll() {
		List<ActivosFijosDTO> listaActivosFijosDto = new ArrayList<>();
		
		Iterable<ActivosFijos> activosFijosItr = this.activosFijosDao.findAll();
		
		for(ActivosFijos activoFijo: activosFijosItr) {
			
			ActivosFijosDTO activosFijosDto = new ActivosFijosDTO();
			activosFijosDto = MHelpers.modelMapper().map(activoFijo, ActivosFijosDTO.class);
			listaActivosFijosDto.add(activosFijosDto);
		}
		
		return listaActivosFijosDto;
	}

	@Override
	public ActivosFijosDTO findByid(String id) {
		Optional<ActivosFijos> activoFijo = this.activosFijosDao.findById(id);
		ActivosFijosDTO activosFijosDto = MHelpers.modelMapper().map(activoFijo.get(), ActivosFijosDTO.class);
		
		return activosFijosDto;
	}

	@Override
	public ActivosFijosDTO save(ActivosFijosDTO activosFijosDto) {
		ActivosFijos activosFijos = MHelpers.modelMapper().map(activosFijosDto, ActivosFijos.class);
		activosFijos =  this.activosFijosDao.save(activosFijos);
		activosFijosDto = MHelpers.modelMapper().map(activosFijos, ActivosFijosDTO.class);
		
		return activosFijosDto;
	}

	@Override
	public void delete(ActivosFijosDTO activosFijosDto) {
		ActivosFijos activosFijos = MHelpers.modelMapper().map(activosFijosDto, ActivosFijos.class);
		this.activosFijosDao.delete(activosFijos);
	}

}
