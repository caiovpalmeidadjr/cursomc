package com.caioalmeida.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caioalmeida.cursomc.domain.Categoria;
import com.caioalmeida.cursomc.domain.Produto;
import com.caioalmeida.cursomc.repositories.CategoriaRepository;
import com.caioalmeida.cursomc.repositories.ProdutoRepository;


//(CommandLineRunner) permite executar uma ação ao iniciar a app
@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	CategoriaRepository catRepository;
	
	@Autowired
	ProdutoRepository prodRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		
		Categoria cat1 = new Categoria(null, "Informatica");
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		
		Categoria cat2 = new Categoria(null, "Escritório");
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		
		//Arrays.asList(cat1,cat2) transformando objetos em lista
		catRepository.saveAll(Arrays.asList(cat1,cat2));
		
		prodRepository.saveAll(Arrays.asList(p1,p2,p3));
		
	}

}
