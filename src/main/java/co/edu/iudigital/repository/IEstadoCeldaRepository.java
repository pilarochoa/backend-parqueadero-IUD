package co.edu.iudigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.model.EstadoCelda;

@Repository
public interface IEstadoCeldaRepository extends JpaRepository<EstadoCelda, Long>{

}
