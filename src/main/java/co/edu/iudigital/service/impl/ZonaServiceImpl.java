package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.dto.ZonaDTO;
import co.edu.iudigital.model.Zona;
import co.edu.iudigital.repository.IZonaRepository;
import co.edu.iudigital.service.IZonaService;
import co.edu.iudigital.util.Helper;

@Service
public class ZonaServiceImpl implements IZonaService{
	
	@Autowired
	private IZonaRepository zonaRepository;

	@Override
	public List<ZonaDTO> findAll() {
		List<Zona> zonas = zonaRepository.findAll();
		List<ZonaDTO> zonasDTO = Helper.convertListZonaDTO(zonas);
		return zonasDTO;
	}

	@Override
	public ZonaDTO findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ZonaDTO save(ZonaDTO zonaDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long codigo) {
		// TODO Auto-generated method stub
		
	}

}
