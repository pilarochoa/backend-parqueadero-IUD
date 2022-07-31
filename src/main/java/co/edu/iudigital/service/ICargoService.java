package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.dto.CargoDTO;

public interface ICargoService {
	
	List<CargoDTO> findAll();
	
	CargoDTO findById();
	
	CargoDTO save(CargoDTO cargoDTO);
	
	void delete(Long codigo);

}
