package co.edu.iudigital.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.model.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long>{
	Optional<Cliente> findByCodigo(Long codigo);
}
