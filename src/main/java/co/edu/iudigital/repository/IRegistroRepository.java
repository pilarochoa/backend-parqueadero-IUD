package co.edu.iudigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.model.Registro;

@Repository
public interface IRegistroRepository extends JpaRepository<Registro,Long>{

}
