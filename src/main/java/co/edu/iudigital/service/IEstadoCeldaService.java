package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.dto.EstadoCeldaDTO;

public interface IEstadoCeldaService {
	
	List<EstadoCeldaDTO> findAll();
	
	EstadoCeldaDTO findById();
	
	EstadoCeldaDTO save(EstadoCeldaDTO estadoCeldaDTO);
	
	void delete(Long codigo);

}
