package br.com.btg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.btg.enums.ExceptionEnum;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class JokenPoGameException extends RuntimeException {
	
	private static final long serialVersionUID = -4798004824750320444L;

	public JokenPoGameException(ExceptionEnum erroJogadaInvalida) {
		super(erroJogadaInvalida.getErro());
	}
	
}
