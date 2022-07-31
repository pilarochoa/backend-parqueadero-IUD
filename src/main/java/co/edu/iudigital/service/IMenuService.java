package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.dto.MenuDTO;

public interface IMenuService {
	
	List<MenuDTO> findAll();
	
	MenuDTO findById();
	
	MenuDTO save(MenuDTO menuDTO);
	
	void delete(Long codigo);
}
