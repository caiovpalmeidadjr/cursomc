package com.caioalmeida.cursomc.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.caioalmeida.cursomc.services.exceptions.ObjectNotFoundException;

//criado para fazer o erro via Json
//tudo padrão do método advice

@ControllerAdvice
public class ResourceExceptionHandler {
	//deu exception, cai aqui nessa class
	//class auxiliar para interpretar as exceptions
	//tratador de exception do tipo ObjectNotFoundException
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
		
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(),e.getMessage() , System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}

}
