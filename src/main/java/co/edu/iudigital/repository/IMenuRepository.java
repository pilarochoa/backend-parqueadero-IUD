package co.edu.iudigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.model.Menu;

@Repository
public interface IMenuRepository extends JpaRepository<Menu, Long>{

}
