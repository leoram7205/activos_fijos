package com.asd.activos_fijos.service;

import java.util.List;

import com.asd.activos_fijos.commons.GenericService;
import com.asd.activos_fijos.dto.PersonasDTO;
import com.asd.activos_fijos.entity.Personas;

public interface PersonasService extends GenericService<Personas, String>{
	List<PersonasDTO> findAll();
	
	PersonasDTO findByid(String id);
	
	PersonasDTO save(PersonasDTO personasDto);
	
	void delete(PersonasDTO personasDto);
}
