package co.edu.iudigital.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.dto.CeldaDTO;
import co.edu.iudigital.service.ICeldaService;

@RestController
@RequestMapping("/celda")
public class CeldaController {
	
	private static final Logger log = LoggerFactory.getLogger(CeldaController.class); 
	
	@Autowired
	private ICeldaService celdaService;
	
	@GetMapping
	public ResponseEntity<List<CeldaDTO>> index(){
		log.info("Se consultan las celdas.");
		List<CeldaDTO> celda = celdaService.findAll();
		return ResponseEntity.ok().body(celda);
	}

}
