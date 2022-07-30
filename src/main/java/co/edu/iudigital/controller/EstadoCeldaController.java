package co.edu.iudigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.model.EstadoCelda;
import co.edu.iudigital.service.IEstadoCeldaService;

@RestController
@RequestMapping("/estadoCelda")
public class EstadoCeldaController {

	@Autowired
	private IEstadoCeldaService estadoCeldaService;
	
	@GetMapping
	public ResponseEntity<List<EstadoCelda>> index(){
		List<EstadoCelda> estadoCelda = estadoCeldaService.getAll();
		return ResponseEntity.ok().body(estadoCelda);
	}
}
