package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.dto.MenuDTO;
import co.edu.iudigital.model.Menu;
import co.edu.iudigital.repository.IMenuRepository;
import co.edu.iudigital.service.IMenuService;
import co.edu.iudigital.util.Helper;

@Service
public class MenuServiceImpl implements IMenuService{
	
	@Autowired
	private IMenuRepository menuRepository;

	@Override
	public List<MenuDTO> findAll() {
		List<Menu> menus = menuRepository.findAll();
		List<MenuDTO> menusDTO = Helper.convertListMenuDTO(menus);
		return menusDTO;
	}

	@Override
	public MenuDTO findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MenuDTO save(MenuDTO menuDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long codigo) {
		// TODO Auto-generated method stub
		
	}

}
