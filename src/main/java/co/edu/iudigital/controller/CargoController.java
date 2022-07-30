package co.edu.iudigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.model.Cargo;
import co.edu.iudigital.service.ICargoService;

@RestController
@RequestMapping("/cargo")
public class CargoController {
	
	@Autowired
	private ICargoService cargoService;
	
	@GetMapping
	public ResponseEntity<List<Cargo>> index(){
		List<Cargo> cargo = cargoService.getAll();
		return ResponseEntity.ok().body(cargo);
		
	}

}
