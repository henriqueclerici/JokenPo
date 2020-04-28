package br.com.btg.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class JogadasRequest {

	@Size(min = 1)
	@NotNull
	private String jogadorNome;

	@Size(min = 1)
	@NotNull
	private String jogadas;

	public JogadasRequest(String jogadorNome, String jogadas) {

		this.jogadorNome = jogadorNome;
		this.jogadas = jogadas;
	}

	@Override
	public String toString() {
		return "JogadasRequest{" + "jogadorNome='" + jogadorNome + '\'' + ", jogadas='" + jogadas + '\'' + '}';
	}

}
