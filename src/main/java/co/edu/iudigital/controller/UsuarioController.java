package co.edu.iudigital.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.dto.UsuarioDTO;
import co.edu.iudigital.exception.RestException;
import co.edu.iudigital.model.Usuario;
import co.edu.iudigital.service.IUsuarioService;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import nonapi.io.github.classgraph.utils.LogNode;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioController {

	private static final Logger log = LoggerFactory.getLogger(UsuarioController.class); 
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@ApiOperation(
			value = "Obtener los usuarios",
			response = UsuarioDTO.class, 
			produces = "application/json",
			httpMethod = "GET")
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> index() {
		try {
			log.info("Se consultan los usuarios.");
			List<UsuarioDTO> usuario = usuarioService.findAll();
			return ResponseEntity.ok().body(usuario);
		} catch (RestException e) {
			log.info("Error consultando los usuarios.", e);
			return null;
		}
	}
	
	@ApiOperation(
			value = "Guarda un usuario",
			response = UsuarioDTO.class, 
			produces = "application/json",
			httpMethod = "POST")
	@PostMapping
	public ResponseEntity<UsuarioDTO> create(@RequestBody UsuarioDTO usuarioDTO) {
		try {
			return new ResponseEntity(
					usuarioService.save(usuarioDTO),
					HttpStatus.CREATED);
		} catch (RestException e) {
			log.info("Error guardando usuario.", e);
			return null;
		}
	}
	
	@ApiOperation(value = "Elimina un usuario por id",
			produces = "application/json",
			httpMethod = "DELETE")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@DeleteMapping("/{userId}")
	public void delete(@PathVariable Long userId) throws RestException {
		try {
			log.info("Eliminando usuario");
			usuarioService.delete(userId);
		} catch (RestException e) {
			log.info("Error al eliminar usuario");
		}
	}

	@ApiOperation(
			value = "Obtener usuario por nombre y password",
			response = UsuarioDTO.class, 
			produces = "application/json",
			httpMethod = "POST")
	@PostMapping("/signin")
	public ResponseEntity<UsuarioDTO> singin(@RequestBody UsuarioDTO usuarioDTO) {
		try {
			log.info("Se consultan usuario por nombre y contraseña.");
			UsuarioDTO usuario = usuarioService.findByNameAndOPassword(usuarioDTO.getNombre(), usuarioDTO.getPassword());
			return ResponseEntity.ok().body(usuario);
		} catch (RestException e) {
			log.info("Error consultando los usuarios.", e);
			return null;
		}
	}
}
