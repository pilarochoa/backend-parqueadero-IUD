package co.edu.iudigital.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.dto.UsuarioDTO;
import co.edu.iudigital.service.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	private static final Logger log = LoggerFactory.getLogger(UsuarioController.class); 
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> index(){
		log.info("Se consultan los usuarios.");
		List<UsuarioDTO> usuario = usuarioService.findAll();
		return ResponseEntity.ok().body(usuario);
	}
}
