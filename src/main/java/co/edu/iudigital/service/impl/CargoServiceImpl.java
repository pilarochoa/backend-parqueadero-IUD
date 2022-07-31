package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.dto.CargoDTO;
import co.edu.iudigital.model.Cargo;
import co.edu.iudigital.repository.ICargoRepository;
import co.edu.iudigital.service.ICargoService;
import co.edu.iudigital.util.Helper;

@Service
public class CargoServiceImpl implements ICargoService{
	
	@Autowired
	private ICargoRepository cargoRepository;

	@Override
	public List<CargoDTO> findAll() {
		List<Cargo> cargos = cargoRepository.findAll();
		List<CargoDTO> cargosDTO = Helper.convertListCargoDTO(cargos);
		return cargosDTO;
	}
	
	
	@Override
	public CargoDTO save(CargoDTO user) {
		return null;
	}


	@Override
	public CargoDTO findById() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(Long codigo) {
		// TODO Auto-generated method stub
		
	}

}
