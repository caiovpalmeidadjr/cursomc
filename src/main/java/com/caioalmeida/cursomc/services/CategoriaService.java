package com.caioalmeida.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caioalmeida.cursomc.domain.Categoria;
import com.caioalmeida.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	
	@Autowired //instancia de um objeto preparado pelo spring
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElse(null);
	}
}
