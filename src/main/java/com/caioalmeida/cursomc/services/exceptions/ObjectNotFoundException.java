package com.caioalmeida.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}

	// passando para a superclass
	public ObjectNotFoundException (String msg, Throwable cause) {
		super(msg,cause);
	}

}
