package co.edu.iudigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.model.Usuario;
import co.edu.iudigital.service.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> index(){
		List<Usuario> usuario = usuarioService.getAll();
		return ResponseEntity.ok().body(usuario);
	}
}
