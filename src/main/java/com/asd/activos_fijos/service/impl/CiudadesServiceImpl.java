package com.asd.activos_fijos.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.asd.activos_fijos.commons.impl.GenericServiceImpl;
import com.asd.activos_fijos.dao.CiudadesDAO;
import com.asd.activos_fijos.dto.CiudadesDTO;
import com.asd.activos_fijos.entity.Ciudades;
import com.asd.activos_fijos.service.CiudadesService;
import com.asd.activos_fijos.utils.MHelpers;

@Service
public class CiudadesServiceImpl extends GenericServiceImpl<Ciudades, String> implements CiudadesService{

	@Autowired
	CiudadesDAO ciudadesDao;
	
	@Override
	public CrudRepository<Ciudades, String> getDao() {
		return ciudadesDao;
	}

	@Override
	public List<CiudadesDTO> findAll() {
		List<CiudadesDTO> listaCiudadesDto = new ArrayList<>();
		
		Iterable<Ciudades> ciudadesItr = this.ciudadesDao.findAll();
		
		for(Ciudades ciudad: ciudadesItr) {
			
			CiudadesDTO ciudadesDto = new CiudadesDTO();
			ciudadesDto = MHelpers.modelMapper().map(ciudad, CiudadesDTO.class);
			listaCiudadesDto.add(ciudadesDto);
		}
		
		return listaCiudadesDto;
	}

	@Override
	public CiudadesDTO findById(String id) {
		Optional<Ciudades> ciudades = this.ciudadesDao.findById(id);
		CiudadesDTO ciudadesDto = MHelpers.modelMapper().map(ciudades.get(), CiudadesDTO.class);
		
		return ciudadesDto;
	}

	@Override
	public CiudadesDTO save(CiudadesDTO ciudadesDto) {
		Ciudades ciudades = MHelpers.modelMapper().map(ciudadesDto, Ciudades.class);
		ciudades =  this.ciudadesDao.save(ciudades);
		ciudadesDto = MHelpers.modelMapper().map(ciudades, CiudadesDTO.class);
		
		return ciudadesDto;
	}

	@Override
	public void delete(CiudadesDTO ciudadesDto) {
		Ciudades ciudades = MHelpers.modelMapper().map(ciudadesDto, Ciudades.class);
		this.ciudadesDao.delete(ciudades);
	}

}
