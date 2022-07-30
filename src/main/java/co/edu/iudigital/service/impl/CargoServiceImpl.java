package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.model.Cargo;
import co.edu.iudigital.repository.ICargoRepository;
import co.edu.iudigital.service.ICargoService;

@Service
public class CargoServiceImpl implements ICargoService{
	
	@Autowired
	private ICargoRepository cargoRepository;

	@Override
	public List<Cargo> getAll() {
		// TODO Auto-generated method stub
		return cargoRepository.findAll();
	}

}
