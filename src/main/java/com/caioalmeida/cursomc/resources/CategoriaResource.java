package com.caioalmeida.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//criando controlador rest que vai responder pelo end point /categorias
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	//colocando o tipo de requisição, usando get para obter os dados
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "REST está Funcionando!";
	}
}
