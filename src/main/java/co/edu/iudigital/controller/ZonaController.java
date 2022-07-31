package co.edu.iudigital.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.dto.ZonaDTO;
import co.edu.iudigital.service.IZonaService;

@RestController
@RequestMapping("/zona")
public class ZonaController {
	
	private static final Logger log = LoggerFactory.getLogger(ZonaController.class); 
	
	@Autowired
	private IZonaService zonaService;
	
	@GetMapping
	public ResponseEntity<List<ZonaDTO>> index(){
		log.info("Se consulta zona.");
		List<ZonaDTO> zona = zonaService.findAll();
		return ResponseEntity.ok().body(zona);
	}

}
