package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.dto.CeldaDTO;
import co.edu.iudigital.model.Celda;
import co.edu.iudigital.repository.ICeldaRepository;
import co.edu.iudigital.service.ICeldaService;
import co.edu.iudigital.util.Helper;

@Service
public class CeldaServiceImpl implements ICeldaService{
	
	@Autowired
	private ICeldaRepository celdaRepository;

	@Override
	public List<CeldaDTO> findAll() {
		List<Celda> celdas = celdaRepository.findAll();
		List<CeldaDTO> celdasDTO = Helper.convertListCeldaDTO(celdas);
		return celdasDTO;
	}

	@Override
	public CeldaDTO findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CeldaDTO save(CeldaDTO celdaDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long codigo) {
		// TODO Auto-generated method stub
		
	}

}
