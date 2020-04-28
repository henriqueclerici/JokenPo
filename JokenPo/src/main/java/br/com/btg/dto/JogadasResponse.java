package br.com.btg.dto;

import javax.validation.constraints.NotNull;

import br.com.btg.JogadasEnum;
import br.com.btg.model.Jogador;

public class JogadasResponse {

	@NotNull
	private Jogador jogador;

	@NotNull
	private JogadasEnum jogadasEnum;

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public JogadasEnum getJogadasEnum() {
		return jogadasEnum;
	}

	public void setJogadasEnum(JogadasEnum jogadasEnum) {
		this.jogadasEnum = jogadasEnum;
	}

	/**
	 * @param jogador
	 * @param jogadasEnum
	 */
	public JogadasResponse(Jogador jogador, JogadasEnum jogadasEnum) {
		this.jogador = jogador;
		this.jogadasEnum = jogadasEnum;
	}

	@Override
	public String toString() {
		return "JogadasResponse{" + "jogador=" + jogador + ", jogadasEnum=" + jogadasEnum + '}';
	}

}
