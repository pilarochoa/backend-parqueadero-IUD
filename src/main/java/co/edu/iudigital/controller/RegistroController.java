package co.edu.iudigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.model.Registro;
import co.edu.iudigital.service.IRegistroService;

@RestController
@RequestMapping("/registro")
public class RegistroController {
	
	@Autowired
	private IRegistroService registroService;
	
	@GetMapping
	public ResponseEntity<List<Registro>> index(){
		List<Registro> registro = registroService.getAll();
		return ResponseEntity.ok().body(registro);
		
	}

}
