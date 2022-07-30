package co.edu.iudigital.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.model.Celda;
import co.edu.iudigital.service.ICeldaService;

@RestController
@RequestMapping("/celda")
public class CeldaController {
	
	@Autowired
	private ICeldaService celdaService;
	
	@GetMapping
	public ResponseEntity<List<Celda>> index(){
		List<Celda> celda = celdaService.getAll();
		return ResponseEntity.ok().body(celda);
	}

}
