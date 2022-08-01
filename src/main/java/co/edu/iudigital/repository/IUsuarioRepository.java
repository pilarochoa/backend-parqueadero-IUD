package co.edu.iudigital.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.model.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
	// QUERY
	// Select * from usuario where nombre = ?
	Optional<Usuario> findByNombre(String nombre);
	Optional<Usuario> findByCodigo(Long codigo);
	
	// @Query("SELECT u FROM usuario u WHERE u.nombre=?1 AND u.password=?2")
	// Usuario findByNombreAndPassword(String nombre, String password);
	// @Query("Select * from usuario u where u.nombre = ?1");
}
