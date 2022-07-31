package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.dto.TipoVehiculoDTO;

public interface ITipoVehiculoService {
	
	List<TipoVehiculoDTO> findAll();
	
	TipoVehiculoDTO findById();
	
	TipoVehiculoDTO save(TipoVehiculoDTO tipoVehiculoDTO);
	
	void delete(Long codigo);
}
