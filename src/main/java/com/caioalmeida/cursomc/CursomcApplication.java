package com.caioalmeida.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caioalmeida.cursomc.domain.Categoria;
import com.caioalmeida.cursomc.repositories.CategoriaRepository;


//(CommandLineRunner) permite executar uma ação ao iniciar a app
@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	CategoriaRepository catRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		//Arrays.asList(cat1,cat2) transformando objetos em lista
		catRepository.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
