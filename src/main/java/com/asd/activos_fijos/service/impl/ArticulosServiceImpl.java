package com.asd.activos_fijos.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.asd.activos_fijos.commons.impl.GenericServiceImpl;
import com.asd.activos_fijos.dao.ArticulosDAO;
import com.asd.activos_fijos.dto.ArticulosDTO;
import com.asd.activos_fijos.entity.Articulos;
import com.asd.activos_fijos.service.ArticulosService;
import com.asd.activos_fijos.utils.MHelpers;

@Service
public class ArticulosServiceImpl extends GenericServiceImpl<Articulos, String> implements ArticulosService {

	@Autowired
	ArticulosDAO articulosDao;
	
	@Override
	public CrudRepository<Articulos, String> getDao() {
		return articulosDao;
	}

	@Override
	public List<ArticulosDTO> findAll() {
		List<ArticulosDTO> listaArticulosDto = new ArrayList<>();
		
		Iterable<Articulos> articulosItr = this.articulosDao.findAll();
		
		for(Articulos articulo: articulosItr) {
			
			ArticulosDTO articulosDto = new ArticulosDTO();
			articulosDto = MHelpers.modelMapper().map(articulo, ArticulosDTO.class);
			listaArticulosDto.add(articulosDto);
		}
		
		return listaArticulosDto;
	}

	@Override
	public ArticulosDTO findByid(String id) {
		Optional<Articulos> articulos = this.articulosDao.findById(id);
		ArticulosDTO articulosDto = MHelpers.modelMapper().map(articulos.get(), ArticulosDTO.class);
		
		return articulosDto;
	}

	@Override
	public ArticulosDTO save(ArticulosDTO articulosDto) {
		Articulos articulos = MHelpers.modelMapper().map(articulosDto, Articulos.class);
		articulos =  this.articulosDao.save(articulos);
		articulosDto = MHelpers.modelMapper().map(articulos, ArticulosDTO.class);
		
		return articulosDto;
	}

	@Override
	public void delete(ArticulosDTO articulosDto) {
		Articulos articulos = MHelpers.modelMapper().map(articulosDto, Articulos.class);
		this.articulosDao.delete(articulos);
	}

}
