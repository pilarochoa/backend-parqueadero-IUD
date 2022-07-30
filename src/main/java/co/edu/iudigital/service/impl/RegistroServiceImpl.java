package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.model.Registro;
import co.edu.iudigital.repository.IRegistroRepository;
import co.edu.iudigital.service.IRegistroService;

@Service
public class RegistroServiceImpl implements IRegistroService{
	
	
	@Autowired
	private IRegistroRepository registroRepository;

	@Override
	public List<Registro> getAll() {
		// TODO Auto-generated method stub
		return registroRepository.findAll();
	}

}
