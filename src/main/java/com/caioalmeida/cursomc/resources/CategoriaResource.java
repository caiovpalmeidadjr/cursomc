package com.caioalmeida.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.caioalmeida.cursomc.domain.Categoria;

//criando controlador rest que vai responder pelo end point /categorias
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	//colocando o tipo de requisição, usando get para obter os dados
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
}
