package co.edu.iudigital.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.dto.TipoVehiculoDTO;
import co.edu.iudigital.service.ITipoVehiculoService;

@RestController
@RequestMapping("/tipoVehiculo")
public class TipoVehiculoController {
	
	private static final Logger log = LoggerFactory.getLogger(TipoVehiculoController.class); 
	
	@Autowired
	private ITipoVehiculoService tipoVehiculoService;
	
	@GetMapping
	public ResponseEntity<List<TipoVehiculoDTO>> index(){
		log.info("Se consulta Vehiculos.");
		List<TipoVehiculoDTO> tipoVehiculo = tipoVehiculoService.findAll();
		return ResponseEntity.ok().body(tipoVehiculo);
	}
	

}
