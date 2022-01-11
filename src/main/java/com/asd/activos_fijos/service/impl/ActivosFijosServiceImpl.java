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
import com.asd.activos_fijos.exception.RequestException;
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
		
		if(!activosFijos.getAfFechaBaja().toString().isBlank() && !activosFijos.getAfFechaBaja().toString().isEmpty()) {
			if(activosFijos.getAfFechaCompra().after(activosFijos.getAfFechaBaja())) {
				throw new RequestException("400","Error: La fecha de compra no debe ser posterior a la fecha de baja");
			}
		}
		
		
		activosFijos =  this.activosFijosDao.save(activosFijos);
		activosFijosDto = MHelpers.modelMapper().map(activosFijos, ActivosFijosDTO.class);
		
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

	@Override
	public void validaDatos(ActivosFijosDTO activosFijosDto) {
		if(activosFijosDto.getAfCodigo().isEmpty() || activosFijosDto.getAfCodigo().isBlank()) {
			throw new RequestException("400","Error: Debe enviar el código de activo");
		}
		
		if(activosFijosDto.getAfNombre().isEmpty() || activosFijosDto.getAfNombre().isBlank()) {
			throw new RequestException("400","Error: Debe enviar el nombre de activo");
		}
		
		if(activosFijosDto.getAfDescripcion().isEmpty() || activosFijosDto.getAfDescripcion().isBlank()) {
			throw new RequestException("400","Error: Debe enviar la descripción de activo");
		}
		
		if(activosFijosDto.getAfTipoActivo().isEmpty() || activosFijosDto.getAfTipoActivo().isBlank()) {
			throw new RequestException("400","Error: Debe enviar el tipo de activo de activo");
		}
		
		if(activosFijosDto.getAfSerial().isEmpty() || activosFijosDto.getAfSerial().isBlank()) {
			throw new RequestException("400","Error: Debe enviar el serial de activo");
		}
		
		if(activosFijosDto.getAfNumeroInventario().isEmpty() || activosFijosDto.getAfNumeroInventario().isBlank()) {
			throw new RequestException("400","Error: Debe enviar el numero de inventario");
		}
		
		if(activosFijosDto.getAfPeso().isNaN() || activosFijosDto.getAfPeso().isNaN()) {
			throw new RequestException("400","Error: Debe enviar el peso de activo");
		}
		
		if(activosFijosDto.getAfAlto().isNaN() || activosFijosDto.getAfAlto().isNaN()) {
			throw new RequestException("400","Error: Debe enviar el alto de activo");
		}

		if(activosFijosDto.getAfAncho().isNaN() || activosFijosDto.getAfAncho().isNaN()) {
			throw new RequestException("400","Error: Debe enviar el ancho de activo");
		}
		
		if(activosFijosDto.getAfLargo().isNaN() || activosFijosDto.getAfLargo().isNaN()) {
			throw new RequestException("400","Error: Debe enviar el código de activo");
		}
		
		
	}

}
