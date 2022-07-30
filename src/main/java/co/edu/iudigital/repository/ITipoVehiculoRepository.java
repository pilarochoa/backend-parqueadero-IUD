package co.edu.iudigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.model.TipoVehiculo;

@Repository
public interface ITipoVehiculoRepository extends JpaRepository<TipoVehiculo, Long>{

}
