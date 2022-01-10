package com.asd.activos_fijos.dao;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.asd.activos_fijos.entity.ActivosFijos;

public interface ActivosFijosDAO extends CrudRepository<ActivosFijos, String>{
	Iterable<ActivosFijos> findByAfTipoActivo(String tipoActivo);
	
	Iterable<ActivosFijos> findByAfFechaCompra(Date fechaCompra);
	
	Optional<ActivosFijos> findByAfSerial(String serial);
}
