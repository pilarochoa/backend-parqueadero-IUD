package co.edu.iudigital.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.dto.MenuDTO;
import co.edu.iudigital.service.IMenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {
	
	private static final Logger log = LoggerFactory.getLogger(MenuController.class); 
	
	@Autowired
	private IMenuService menuService;
	
	@GetMapping
	public ResponseEntity<List<MenuDTO>> index(){
		log.info("Se consulta el menu.");
		List<MenuDTO> menu = menuService.findAll();
		return ResponseEntity.ok().body(menu);
		
	}		
}
