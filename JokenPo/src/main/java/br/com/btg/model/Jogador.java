package br.com.btg.model;

import javax.persistence.Entity;

@Entity
public class Jogador {
	
	private String nome;
	
    public Jogador() {
    	
    }	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	@Override
	public String toString() {
		return "Jogador [nome=" + nome + "]";
	}
	
	
	
	

}
