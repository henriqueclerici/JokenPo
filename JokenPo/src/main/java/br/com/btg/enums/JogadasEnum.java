package br.com.btg.enums;

import java.util.Arrays;

import br.com.btg.exception.JokenPoGameException;

public enum JogadasEnum {

	SPOCK("SPOCK"), TESOURA("TESOURA"), PAPEL("PAPEL"), PEDRA("PEDRA"), LARGATO("LARGATO");

	private String nome;
	
	JogadasEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static JogadasEnum getJogadasEnumPorNome(String nomeJogada) {
		for (JogadasEnum jogadas : Arrays.asList(JogadasEnum.values())) {
			if(null != nomeJogada) {
				if(nomeJogada.equals(jogadas.getNome())) {
					return jogadas;
				}
			}else{
				throw new JokenPoGameException(ExceptionEnum.ERRO_JOGADA_INVALIDA);
			}
		}
		throw new JokenPoGameException(ExceptionEnum.ERRO_JOGADA_NAO_ENCONTRADA);
	}
	
	

}
