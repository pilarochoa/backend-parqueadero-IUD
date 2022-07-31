package co.edu.iudigital.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.dto.EstadoCeldaDTO;
import co.edu.iudigital.service.IEstadoCeldaService;

@RestController
@RequestMapping("/estadoCelda")
public class EstadoCeldaController {
	
	private static final Logger log = LoggerFactory.getLogger(EstadoCeldaController.class); 

	@Autowired
	private IEstadoCeldaService estadoCeldaService;
	
	@GetMapping
	public ResponseEntity<List<EstadoCeldaDTO>> index(){
		log.info("Se consulta estado de celda.");
		List<EstadoCeldaDTO> estadoCelda = estadoCeldaService.findAll();
		return ResponseEntity.ok().body(estadoCelda);
	}
}
