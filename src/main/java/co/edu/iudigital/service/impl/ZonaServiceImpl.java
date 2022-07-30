package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.model.Zona;
import co.edu.iudigital.repository.IZonaRepository;
import co.edu.iudigital.service.IZonaService;

@Service
public class ZonaServiceImpl implements IZonaService{
	
	@Autowired
	private IZonaRepository zonaRepository;

	@Override
	public List<Zona> getAll() {
		// TODO Auto-generated method stub
		return zonaRepository.findAll();
	}

}
