package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.dto.CeldaDTO;

public interface ICeldaService {
	
	
	List<CeldaDTO> findAll();
	
	CeldaDTO findById();
	
	CeldaDTO save(CeldaDTO celdaDTO);
	
	void delete(Long codigo);

}
