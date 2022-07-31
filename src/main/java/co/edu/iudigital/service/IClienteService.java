package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.dto.ClienteDTO;

public interface IClienteService {
	
	List<ClienteDTO> findAll();
	
	ClienteDTO findById();
	
	ClienteDTO save(ClienteDTO clienteDTO);
	
	void delete(Long codigo);

}
