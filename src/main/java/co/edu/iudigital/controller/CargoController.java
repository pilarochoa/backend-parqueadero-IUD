package co.edu.iudigital.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.dto.CargoDTO;
import co.edu.iudigital.service.ICargoService;

@RestController
@RequestMapping("/cargo")
public class CargoController {
	
	private static final Logger log = LoggerFactory.getLogger(CargoController.class); 
	
	
	@Autowired
	private ICargoService cargoService;
	
	@GetMapping
	public ResponseEntity<List<CargoDTO>> index(){
		log.info("Se consultan los cargos.");
		List<CargoDTO> cargo = cargoService.findAll();
		return ResponseEntity.ok().body(cargo);
		
	}

}
