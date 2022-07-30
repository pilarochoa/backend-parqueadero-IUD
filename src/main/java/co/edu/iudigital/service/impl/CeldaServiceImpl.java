package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.model.Celda;
import co.edu.iudigital.repository.ICeldaRepository;
import co.edu.iudigital.service.ICeldaService;

@Service
public class CeldaServiceImpl implements ICeldaService{
	
	@Autowired
	private ICeldaRepository celdaRepository;

	@Override
	public List<Celda> getAll() {
		// TODO Auto-generated method stub
		return celdaRepository.findAll();
	}

}
