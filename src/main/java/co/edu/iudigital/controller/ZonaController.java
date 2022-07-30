package co.edu.iudigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.model.Zona;
import co.edu.iudigital.service.IZonaService;

@RestController
@RequestMapping("/zona")
public class ZonaController {
	
	@Autowired
	private IZonaService zonaService;
	
	@GetMapping
	public ResponseEntity<List<Zona>> index(){
		List<Zona> zona = zonaService.getAll();
		return ResponseEntity.ok().body(zona);
	}

}
