package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.model.TipoVehiculo;
import co.edu.iudigital.repository.ITipoVehiculoRepository;
import co.edu.iudigital.service.ITipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements ITipoVehiculoService{
	
	@Autowired
	private ITipoVehiculoRepository tipoVehiculoRepository;

	@Override
	public List<TipoVehiculo> getAll() {
		// TODO Auto-generated method stub
		return tipoVehiculoRepository.findAll();
	}

}
