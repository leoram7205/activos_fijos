package com.asd.activos_fijos.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
	public ActivosFijosDTO save(ActivosFijosDTO activosFijosDto) throws Exception {
		ActivosFijos activosFijos = MHelpers.modelMapper().map(activosFijosDto, ActivosFijos.class);
		
		try {
			if(!activosFijos.getAfFechaBaja().toString().isBlank() && !activosFijos.getAfFechaBaja().toString().isEmpty()) {
				if(activosFijos.getAfFechaCompra().after(activosFijos.getAfFechaBaja())) {
					throw new Exception("Error: La fecha de compra no debe ser posterior a la fecha de baja");
				}
			}
			activosFijos =  this.activosFijosDao.save(activosFijos);
			activosFijosDto = MHelpers.modelMapper().map(activosFijos, ActivosFijosDTO.class);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
		return activosFijosDto;
	}

	@Override
	public void delete(ActivosFijosDTO activosFijosDto) {
		ActivosFijos activosFijos = MHelpers.modelMapper().map(activosFijosDto, ActivosFijos.class);
		this.activosFijosDao.delete(activosFijos);
	}

	@Override
	public List<ActivosFijosDTO> findByAfTipoActivo(String tipoActivo) {
		List<ActivosFijosDTO> listaActivosFijosDto = new ArrayList<>();
		
		Iterable<ActivosFijos> activosFijosItr = this.activosFijosDao.findByAfTipoActivo(tipoActivo);
		
		for(ActivosFijos activoFijo: activosFijosItr) {
			
			ActivosFijosDTO activosFijosDto = new ActivosFijosDTO();
			activosFijosDto = MHelpers.modelMapper().map(activoFijo, ActivosFijosDTO.class);
			listaActivosFijosDto.add(activosFijosDto);
		}
		
		return listaActivosFijosDto;
	}

	@Override
	public List<ActivosFijosDTO> findByAfFechaCompra(String fechaCompra) throws Exception {
		List<ActivosFijosDTO> listaActivosFijosDto = new ArrayList<>();
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); 
		Date fecha;
		try {
			fecha = formato.parse(fechaCompra);
			Iterable<ActivosFijos> activosFijosItr = this.activosFijosDao.findByAfFechaCompra(fecha);
			
			for(ActivosFijos activoFijo: activosFijosItr) {
				
				ActivosFijosDTO activosFijosDto = new ActivosFijosDTO();
				activosFijosDto = MHelpers.modelMapper().map(activoFijo, ActivosFijosDTO.class);
				listaActivosFijosDto.add(activosFijosDto);
			}
		} catch (ParseException e) {
			throw new Exception(e.getMessage());
		}
		
		
		
		return listaActivosFijosDto;
	}

	@Override
	public ActivosFijosDTO findByAfSerial(String serial) {
		Optional<ActivosFijos> activosFijos = this.activosFijosDao.findByAfSerial(serial);
		ActivosFijosDTO activosFijosDto = MHelpers.modelMapper().map(activosFijos.get(), ActivosFijosDTO.class);
		
		return activosFijosDto;
	}

}
