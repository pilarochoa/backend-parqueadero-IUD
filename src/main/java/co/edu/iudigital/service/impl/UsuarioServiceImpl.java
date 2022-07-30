package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.model.Usuario;
import co.edu.iudigital.repository.IUsuarioRepository;
import co.edu.iudigital.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}
	
	@Override
	public void createUser(Usuario user) {
		
	}

}
