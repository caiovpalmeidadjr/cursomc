package com.caioalmeida.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caioalmeida.cursomc.domain.Categoria;
import com.caioalmeida.cursomc.repositories.CategoriaRepository;
import com.caioalmeida.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired // instancia de um objeto preparado pelo spring
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {

		Optional<Categoria> obj = repo.findById(id);
		// lançando uma exception com uma mensagem e o nome da classe
		// o rest vai retornar essa exception , camada de recurso que vai receber essa
		// exception
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado ! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
