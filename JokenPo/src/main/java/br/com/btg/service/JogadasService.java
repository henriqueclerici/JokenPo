package br.com.btg.service;

import java.util.List;

import br.com.btg.dto.JogadasRequest;
import br.com.btg.dto.JogadasResponse;

public interface JogadasService {

	List<JogadasResponse> getAll();

	JogadasResponse deleteByName(String nome);

	JogadasResponse insert(JogadasRequest jogadas);
	
	

}
