package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.dto.TipoVehiculoDTO;
import co.edu.iudigital.model.TipoVehiculo;
import co.edu.iudigital.repository.ITipoVehiculoRepository;
import co.edu.iudigital.service.ITipoVehiculoService;
import co.edu.iudigital.util.Helper;

@Service
public class TipoVehiculoServiceImpl implements ITipoVehiculoService{
	
	@Autowired
	private ITipoVehiculoRepository tipoVehiculoRepository;

	@Override
	public List<TipoVehiculoDTO> findAll() {
		List<TipoVehiculo> tipoVehiculos = tipoVehiculoRepository.findAll();
		List<TipoVehiculoDTO> tipoVehiculosDTO = Helper.convertListTipoVehiculoDTO(tipoVehiculos);
		return tipoVehiculosDTO;
	}

	@Override
	public TipoVehiculoDTO findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoVehiculoDTO save(TipoVehiculoDTO tipoVehiculoDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long codigo) {
		// TODO Auto-generated method stub
		
	}

}
