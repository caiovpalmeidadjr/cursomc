package com.caioalmeida.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.caioalmeida.cursomc.domain.Categoria;
import com.caioalmeida.cursomc.services.CategoriaService;

//criando controlador rest que vai responder pelo end point /categorias
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	//colocando o tipo de requisição, usando get para obter os dados/ passando id
	//ResponseEntity<?> armazena varias informações de uma resposta HTTP para um tipo resp(Spring)
	@RequestMapping(value ="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = service.buscar(id);
		
		//Objeto complexo com codigo http de resposta, dessa forma a resposta ocorreu tudo bem, com o corpo o objeto buscado
		return ResponseEntity.ok().body(obj);
	}
}
