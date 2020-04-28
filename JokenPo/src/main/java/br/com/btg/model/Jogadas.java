package br.com.btg.model;

import javax.persistence.Entity;

import br.com.btg.enums.JogadasEnum;

@Entity
public class Jogadas {

	private Jogador jogador;

	private JogadasEnum jogadasEnum;

	/**
	 * @return the jogador
	 */
	public Jogador getJogador() {
		return jogador;
	}

	/**
	 * @param jogador the jogador to set
	 */
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	/**
	 * @return the jogadasEnum
	 */
	public JogadasEnum getJogadasEnum() {
		return jogadasEnum;
	}

	/**
	 * @param jogadasEnum the jogadasEnum to set
	 */
	public void setJogadasEnum(JogadasEnum jogadasEnum) {
		this.jogadasEnum = jogadasEnum;
	}

	@Override
	public String toString() {
		return "Jogadas{" + "jogador=" + jogador + ", jogadasEnum=" + jogadasEnum + '}';
	}

}
