package com.asd.activos_fijos.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.asd.activos_fijos.commons.impl.GenericServiceImpl;
import com.asd.activos_fijos.dao.TipoActivoDAO;
import com.asd.activos_fijos.dto.TipoActivoDTO;
import com.asd.activos_fijos.entity.TipoActivo;
import com.asd.activos_fijos.service.TipoActivoService;
import com.asd.activos_fijos.utils.MHelpers;

@Service
public class TipoActivoServiceImpl extends GenericServiceImpl<TipoActivo, String> implements TipoActivoService{

	@Autowired
	TipoActivoDAO tipoActivoDao;
	
	@Override
	public List<TipoActivoDTO> findAll() {
		List<TipoActivoDTO> listaTipoActivoDto = new ArrayList<>();
		
		Iterable<TipoActivo> tipoActivoItr = this.tipoActivoDao.findAll();
		
		for(TipoActivo ciudad: tipoActivoItr) {
			
			TipoActivoDTO tipoActivoDto = new TipoActivoDTO();
			tipoActivoDto = MHelpers.modelMapper().map(ciudad, TipoActivoDTO.class);
			listaTipoActivoDto.add(tipoActivoDto);
		}
		
		return listaTipoActivoDto;
	}

	@Override
	public TipoActivoDTO findByid(String id) {
		Optional<TipoActivo> tipoActivo = this.tipoActivoDao.findById(id);
		TipoActivoDTO tipoActivoDto = MHelpers.modelMapper().map(tipoActivo.get(), TipoActivoDTO.class);
		
		return tipoActivoDto;
	}

	@Override
	public TipoActivoDTO save(TipoActivoDTO tipoActivoDto) {
		TipoActivo tipoActivo = MHelpers.modelMapper().map(tipoActivoDto, TipoActivo.class);
		tipoActivo =  this.tipoActivoDao.save(tipoActivo);
		tipoActivoDto = MHelpers.modelMapper().map(tipoActivo, TipoActivoDTO.class);
		
		return tipoActivoDto;
	}

	@Override
	public void delete(TipoActivoDTO tipoActivoDto) {
		TipoActivo tipoActivo = MHelpers.modelMapper().map(tipoActivoDto, TipoActivo.class);
		this.tipoActivoDao.delete(tipoActivo);
	}

	@Override
	public CrudRepository<TipoActivo, String> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
