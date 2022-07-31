package co.edu.iudigital.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.dto.RegistroDTO;
import co.edu.iudigital.service.IRegistroService;

@RestController
@RequestMapping("/registro")
public class RegistroController {
	
	private static final Logger log = LoggerFactory.getLogger(RegistroController.class); 
	
	@Autowired
	private IRegistroService registroService;
	
	@GetMapping
	public ResponseEntity<List<RegistroDTO>> index(){
		log.info("Se consultan registros.");
		List<RegistroDTO> registro = registroService.findAll();
		return ResponseEntity.ok().body(registro);
		
	}

}
