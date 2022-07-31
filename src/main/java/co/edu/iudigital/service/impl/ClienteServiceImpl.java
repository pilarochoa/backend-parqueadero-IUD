package co.edu.iudigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.dto.ClienteDTO;
import co.edu.iudigital.model.Cliente;
import co.edu.iudigital.repository.IClienteRepository;
import co.edu.iudigital.service.IClienteService;
import co.edu.iudigital.util.Helper;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired 
	private IClienteRepository clienteRepository;

	@Override
	public List<ClienteDTO> findAll() {
		List<Cliente> clientes = clienteRepository.findAll();
		List<ClienteDTO> clientesDTO = Helper.convertListClienteDTO(clientes);
		return clientesDTO;
	}

	@Override
	public ClienteDTO findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteDTO save(ClienteDTO clienteDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long codigo) {
		// TODO Auto-generated method stub
		
	}

}
