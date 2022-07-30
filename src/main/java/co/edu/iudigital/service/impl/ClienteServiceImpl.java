package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.model.Cliente;
import co.edu.iudigital.repository.IClienteRepository;
import co.edu.iudigital.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired 
	private IClienteRepository clienteRepository;

	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

}
