package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.model.Usuario;

public interface IUsuarioService {

	List<Usuario> getAll();
	void createUser(Usuario user);

}
