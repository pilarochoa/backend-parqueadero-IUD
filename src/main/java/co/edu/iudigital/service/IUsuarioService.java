package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.dto.UsuarioDTO;

public interface IUsuarioService {

	List<UsuarioDTO> findAll();
	
	UsuarioDTO findById();
	
	UsuarioDTO save(UsuarioDTO userDTO);
	
	void delete(Long codigo);

}
