package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.dto.ClienteDTO;
import co.edu.iudigital.dto.UsuarioDTO;
import co.edu.iudigital.exception.RestException;

public interface IClienteService {
	
	List<ClienteDTO> findAll() throws RestException;
		
	ClienteDTO findById(Long codigo) throws RestException;
	
	ClienteDTO save(ClienteDTO clienteDTO) throws RestException;
	
	void delete(Long codigo) throws RestException;

}
