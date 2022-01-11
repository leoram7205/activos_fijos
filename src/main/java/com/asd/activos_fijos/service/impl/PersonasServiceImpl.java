package com.asd.activos_fijos.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.asd.activos_fijos.commons.impl.GenericServiceImpl;
import com.asd.activos_fijos.dao.PersonasDAO;
import com.asd.activos_fijos.dto.PersonasDTO;
import com.asd.activos_fijos.entity.Personas;
import com.asd.activos_fijos.service.PersonasService;
import com.asd.activos_fijos.utils.MHelpers;

@Service
public class PersonasServiceImpl extends GenericServiceImpl<Personas, String> implements PersonasService {

	@Autowired
	PersonasDAO personasDao;
	
	@Override
	public CrudRepository<Personas, String> getDao() {
		return null;
	}

	@Override
	public List<PersonasDTO> findAll() {
		List<PersonasDTO> listaPersonasDto = new ArrayList<>();
		
		Iterable<Personas> personasItr = this.personasDao.findAll();
		
		for(Personas ciudad: personasItr) {
			
			PersonasDTO personasDto = new PersonasDTO();
			personasDto = MHelpers.modelMapper().map(ciudad, PersonasDTO.class);
			listaPersonasDto.add(personasDto);
		}
		
		return listaPersonasDto;
	}

	@Override
	public PersonasDTO findByid(String id) {
		
		Optional<Personas> personas = this.personasDao.findById(id);
		PersonasDTO personasDto = MHelpers.modelMapper().map(personas.get(), PersonasDTO.class);
		
		return personasDto;
	}

	@Override
	public PersonasDTO save(PersonasDTO personasDto) {
		Personas personas = MHelpers.modelMapper().map(personasDto, Personas.class);
		personas =  this.personasDao.save(personas);
		personasDto = MHelpers.modelMapper().map(personas, PersonasDTO.class);
		
		return personasDto;
	}

	@Override
	public void delete(PersonasDTO personasDto) {
		Personas personas = MHelpers.modelMapper().map(personasDto, Personas.class);
		this.personasDao.delete(personas);
	}

}
