package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.dto.UsuarioDTO;
import co.edu.iudigital.exception.RestException;

public interface IUsuarioService {

	List<UsuarioDTO> findAll() throws RestException;
	
	UsuarioDTO findByNameAndOPassword(String nombre, String password) throws RestException;
	
	UsuarioDTO findById(Long codigo) throws RestException;
	
	UsuarioDTO save(UsuarioDTO userDTO) throws RestException;
	
	void delete(Long codigo) throws RestException;

}
