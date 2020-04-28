package br.com.btg.service.impl;

import java.util.List;
import br.com.btg.dto.JogadorRequest;
import br.com.btg.dto.JogadorResponse;
import br.com.btg.exception.JokenPoGameException;
import br.com.btg.service.JogadorService;

public class JogadorServiceImpl implements JogadorService {

	@Override
	public JogadorResponse insert(JogadorRequest jogador) throws JokenPoGameException {
		validarJogador(jogador);
		return null;
	}	

	@Override
	public JogadorResponse deleteByName(String nome) throws JokenPoGameException {
		
		return null;
	}

	@Override
	public List<JogadorResponse> getAll() throws JokenPoGameException {
		
		return null;
	}
	
	private void validarJogador(JogadorRequest jogador) {
		// TODO Auto-generated method stub
		
	}

}
