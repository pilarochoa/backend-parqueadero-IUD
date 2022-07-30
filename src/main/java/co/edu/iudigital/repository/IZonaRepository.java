package co.edu.iudigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.model.Zona;

@Repository
public interface IZonaRepository extends JpaRepository<Zona, Long>{

}
