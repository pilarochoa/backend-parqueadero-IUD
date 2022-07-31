package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.dto.RegistroDTO;

public interface IRegistroService {
	
	List<RegistroDTO> findAll();
	
	RegistroDTO findById();
	
	RegistroDTO save(RegistroDTO registroDTO);
	
	void delete(Long codigo);

}
