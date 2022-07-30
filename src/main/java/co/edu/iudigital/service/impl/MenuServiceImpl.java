package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.model.Menu;
import co.edu.iudigital.repository.IMenuRepository;
import co.edu.iudigital.service.IMenuService;

@Service
public class MenuServiceImpl implements IMenuService{
	
	@Autowired
	private IMenuRepository menuRepository;

	@Override
	public List<Menu> getALL() {
		// TODO Auto-generated method stub
		return menuRepository.findAll();
	}

}
