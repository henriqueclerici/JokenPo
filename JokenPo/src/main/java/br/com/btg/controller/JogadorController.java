package br.com.btg.controller;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.btg.dto.JogadorRequest;
import br.com.btg.exception.JokenPoGameException;
import br.com.btg.service.JogadorService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/jogador")
public class JogadorController {

	private final JogadorService jogadorService;

	@Autowired
	public JogadorController(final JogadorService jogadorService) {
		this.jogadorService = jogadorService;

	}

	public ResponseEntity<Object> insert(@Valid @Size(min = 1) @RequestBody JogadorRequest jogador)
			throws JokenPoGameException {
		return new ResponseEntity<>(jogadorService.insert(jogador), HttpStatus.OK);
	}

	@DeleteMapping(value = "")
	public ResponseEntity<Object> delete(@PathParam("jogadorNome") String nome) throws JokenPoGameException {
		return new ResponseEntity<>(jogadorService.deleteByName(nome), HttpStatus.OK);

	}

	@GetMapping(value = "")
	public ResponseEntity<Object> getAll() throws JokenPoGameException {
		return new ResponseEntity<>(jogadorService.getAll(), HttpStatus.OK);		
	}
}
