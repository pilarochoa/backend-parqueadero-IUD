package co.edu.iudigital.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.dto.ClienteDTO;
import co.edu.iudigital.dto.UsuarioDTO;
import co.edu.iudigital.exception.RestException;
import co.edu.iudigital.service.IClienteService;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	private static final Logger log = LoggerFactory.getLogger(ClienteController.class); 
	
	@Autowired
	private IClienteService clienteService;
	
	@ApiOperation(
			value = "Obtener los clientes",
			response = UsuarioDTO.class, 
			produces = "application/json",
			httpMethod = "GET")
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> index(){
		try {
			log.info("Se consultan los clientes.");
			List<ClienteDTO> cliente = clienteService.findAll();
			return ResponseEntity.ok().body(cliente);
		} catch (RestException e) {
			log.info("Error consultando los clientes.", e);
			return null;
		}		
	}
	
	@ApiOperation(
			value = "Guarda un cliente",
			response = UsuarioDTO.class, 
			produces = "application/json",
			httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ClienteDTO> create(@RequestBody ClienteDTO clienteDTO) {
		try {
			return new ResponseEntity(
					clienteService.save(clienteDTO),
					HttpStatus.CREATED);
		} catch (RestException e) {
			log.info("Error guardando cliente.", e);
			return null;
		}
	}
	
	@ApiOperation(value = "Elimina un cliente por id",
			produces = "application/json",
			httpMethod = "DELETE")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@DeleteMapping("/{clienteId}")
	public void delete(@PathVariable Long clienteId) throws RestException {
		try {
			log.info("Cliente eliminado");
			clienteService.delete(clienteId);
		} catch (RestException e) {
			log.info("Error al eliminar cliente");
		}
	}

}
