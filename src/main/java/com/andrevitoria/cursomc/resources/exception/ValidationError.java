package com.andrevitoria.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	private List<FieldMessage> errors = new ArrayList<>();
	
	public List<FieldMessage> getErros() {
		return errors;
	}

	public void setList(List<FieldMessage> list) {
		this.errors = list;
	}

	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
	}
	public void addErrors(String fieldName, String messagem) {
		errors.add(new FieldMessage(fieldName, messagem));		
	}

	
}
