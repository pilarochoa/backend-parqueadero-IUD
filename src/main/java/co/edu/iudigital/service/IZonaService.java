package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.dto.ZonaDTO;

public interface IZonaService {

	List<ZonaDTO> findAll();
	
	ZonaDTO findById();
	
	ZonaDTO save(ZonaDTO zonaDTO);
	
	void delete(Long codigo);
}
