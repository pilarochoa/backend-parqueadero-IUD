package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.dto.EstadoCeldaDTO;
import co.edu.iudigital.model.EstadoCelda;
import co.edu.iudigital.repository.IEstadoCeldaRepository;
import co.edu.iudigital.service.IEstadoCeldaService;
import co.edu.iudigital.util.Helper;

@Service
public class EstadoCeldaServiceImpl implements IEstadoCeldaService{
	
	@Autowired
	private IEstadoCeldaRepository estadoCeldaRepository;

	@Override
	public List<EstadoCeldaDTO> findAll() {
		List<EstadoCelda> estadoCeldas = estadoCeldaRepository.findAll();
		List<EstadoCeldaDTO> estadoCeldasDTO = Helper.convertListEstadoCeldaDTO(estadoCeldas);
		return estadoCeldasDTO;
	}

	@Override
	public EstadoCeldaDTO findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoCeldaDTO save(EstadoCeldaDTO estadoCeldaDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long codigo) {
		// TODO Auto-generated method stub
		
	}

}
