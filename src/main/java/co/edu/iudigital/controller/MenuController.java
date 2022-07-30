package co.edu.iudigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.model.Menu;
import co.edu.iudigital.service.IMenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private IMenuService menuService;
	
	@GetMapping
	public ResponseEntity<List<Menu>> index(){
		List<Menu> menu = menuService.getALL();
		return ResponseEntity.ok().body(menu);
		
	}		
}
