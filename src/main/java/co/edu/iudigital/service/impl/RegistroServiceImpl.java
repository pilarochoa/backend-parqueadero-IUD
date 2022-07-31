package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.dto.RegistroDTO;
import co.edu.iudigital.model.Registro;
import co.edu.iudigital.repository.IRegistroRepository;
import co.edu.iudigital.service.IRegistroService;
import co.edu.iudigital.util.Helper;

@Service
public class RegistroServiceImpl implements IRegistroService{
	
	
	@Autowired
	private IRegistroRepository registroRepository;

	@Override
	public List<RegistroDTO> findAll() {
		List<Registro> registros = registroRepository.findAll();
		List<RegistroDTO> registrosDTO = Helper.convertListRegistroDTO(registros);
		return registrosDTO;
	}

	@Override
	public RegistroDTO findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistroDTO save(RegistroDTO registroDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long codigo) {
		// TODO Auto-generated method stub
		
	}

}
