package co.edu.iudigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.model.Cargo;

@Repository
public interface ICargoRepository extends JpaRepository<Cargo, Long>{

}
