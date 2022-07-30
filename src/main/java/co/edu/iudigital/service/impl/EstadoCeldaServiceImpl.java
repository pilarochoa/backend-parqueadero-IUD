package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.model.EstadoCelda;
import co.edu.iudigital.repository.IEstadoCeldaRepository;
import co.edu.iudigital.service.IEstadoCeldaService;

@Service
public class EstadoCeldaServiceImpl implements IEstadoCeldaService{
	
	@Autowired
	private IEstadoCeldaRepository estadoCeldaRepository;

	@Override
	public List<EstadoCelda> getAll() {
		// TODO Auto-generated method stub
		return estadoCeldaRepository.findAll();
	}

}
