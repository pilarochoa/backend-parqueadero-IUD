package co.edu.iudigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.model.Celda;

@Repository
public interface ICeldaRepository extends JpaRepository<Celda, Long>{

}
