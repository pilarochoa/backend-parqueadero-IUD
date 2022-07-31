package co.edu.iudigital.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.dto.ClienteDTO;
import co.edu.iudigital.service.IClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	private static final Logger log = LoggerFactory.getLogger(ClienteController.class); 
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> index(){
		log.info("Se consultan los clientes.");
		List<ClienteDTO> cliente = clienteService.findAll();
		return ResponseEntity.ok().body(cliente);
		
	}

}
