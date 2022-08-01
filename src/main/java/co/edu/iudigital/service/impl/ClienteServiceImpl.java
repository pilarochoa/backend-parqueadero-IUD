package co.edu.iudigital.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.LongFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import co.edu.iudigital.dto.ClienteDTO;
import co.edu.iudigital.dto.UsuarioDTO;
import co.edu.iudigital.exception.ErrorDto;
import co.edu.iudigital.exception.NotFoundException;
import co.edu.iudigital.exception.RestException;
import co.edu.iudigital.model.Cliente;
import co.edu.iudigital.model.Usuario;
import co.edu.iudigital.repository.IClienteRepository;
import co.edu.iudigital.service.IClienteService;
import co.edu.iudigital.util.ConsUtil;
import co.edu.iudigital.util.Helper;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired 
	private IClienteRepository clienteRepository;

	@Override
	public List<ClienteDTO> findAll() throws RestException {
		List<Cliente> clientes = clienteRepository.findAll();
		List<ClienteDTO> clientesDTO = Helper.convertListClienteDTO(clientes);
		return clientesDTO;
	}

	@Override
	public ClienteDTO findById(Long codigo) throws RestException {
		Optional<Cliente> clienteOpt = clienteRepository.findByCodigo(codigo);
		if (!clienteOpt.isPresent()) {
			throw new NotFoundException(
				ErrorDto.getErrorDto(HttpStatus.NOT_FOUND.getReasonPhrase(),
						ConsUtil.MESSAGE_NOT_FOUND, HttpStatus.NOT_FOUND.value())
			);
		}
		return Helper.convertClienteToClienteDTO(clienteOpt.get());
	}

	@Override
	public ClienteDTO save(ClienteDTO clienteDTO) {
		Cliente cliente = Helper.convertClienteDTOToCliente(clienteDTO);
		cliente = clienteRepository.save(cliente);
		return Helper.convertClienteToClienteDTO(cliente);
	}

	@Override
	public void delete(Long codigo) throws RestException {
		Optional<Cliente> clienteOpt = clienteRepository.findById(codigo);
		if(clienteOpt.isPresent()) {
			clienteRepository.deleteById(codigo);
		}else {
			throw new NotFoundException(ErrorDto.getErrorDto(
					HttpStatus.NOT_FOUND.getReasonPhrase(), 
					ConsUtil.MESSAGE_NOT_FOUND, 
					HttpStatus.NOT_FOUND.value())
				);
		}
	}

}
