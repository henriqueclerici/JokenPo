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

import br.com.btg.dto.JogadasRequest;
import br.com.btg.exception.JokenPoGameException;
import br.com.btg.service.JogadasService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/jogadas")
public class JogadasController {
	
	private final JogadasService jogadasService;

	@Autowired
	public JogadasController(final JogadasService jogadasService) {
		
		this.jogadasService = jogadasService;
	}
	
	public ResponseEntity<Object> insert(@Valid @Size(min = 1) @RequestBody JogadasRequest jogadas)
			throws JokenPoGameException {
		return new ResponseEntity<>(jogadasService.insert(jogadas), HttpStatus.OK);
	}

	@DeleteMapping(value = "")
	public ResponseEntity<Object> delete(@PathParam("jogadorNome") String nome) throws JokenPoGameException {
		return new ResponseEntity<>(jogadasService.deleteByName(nome), HttpStatus.OK);

	}

	@GetMapping(value = "")
	public ResponseEntity<Object> getAll() throws JokenPoGameException {
		return new ResponseEntity<>(jogadasService.getAll(), HttpStatus.OK);		
	}

}
