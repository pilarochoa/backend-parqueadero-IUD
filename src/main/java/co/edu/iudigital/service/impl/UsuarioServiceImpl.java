package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.iudigital.dto.UsuarioDTO;
import co.edu.iudigital.model.Usuario;
import co.edu.iudigital.repository.IUsuarioRepository;
import co.edu.iudigital.service.IUsuarioService;
import co.edu.iudigital.util.Helper;

@Service
@Transactional
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<UsuarioDTO> findAll() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		List<UsuarioDTO> usuariosDTO = Helper.convertListUsuarioDTO(usuarios);
		return usuariosDTO;
	}
	
	
	@Override
	public UsuarioDTO save(UsuarioDTO user) {
		return null;
	}


	@Override
	public UsuarioDTO findById() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(Long codigo) {
		// TODO Auto-generated method stub
		
	}

}
