package co.edu.iudigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.model.TipoVehiculo;
import co.edu.iudigital.service.ITipoVehiculoService;

@RestController
@RequestMapping("/tipoVehiculo")
public class TipoVehiculoController {
	
	@Autowired
	private ITipoVehiculoService tipoVehiculoService;
	
	@GetMapping
	public ResponseEntity<List<TipoVehiculo>> index(){
		List<TipoVehiculo> tipoVehiculo = tipoVehiculoService.getAll();
		return ResponseEntity.ok().body(tipoVehiculo);
	}
	

}
