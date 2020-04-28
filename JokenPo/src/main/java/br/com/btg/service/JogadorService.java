package br.com.btg.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import br.com.btg.dto.JogadorRequest;
import br.com.btg.dto.JogadorResponse;
import br.com.btg.exception.JokenPoGameException;

public interface JogadorService {

	JogadorResponse insert(@Valid @Size(min = 1) JogadorRequest jogador) throws JokenPoGameException;

	JogadorResponse deleteByName(String nome) throws JokenPoGameException;

	List<JogadorResponse> getAll() throws JokenPoGameException;

}
