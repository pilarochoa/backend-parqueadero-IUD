package co.edu.iudigital.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.model.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
	// QUERY
	// Select * from usuario where nombre = ?
	Usuario findByNombre(String nombre);
	// @Query("Select * from usuario u where u.nombre = ?1");
}
