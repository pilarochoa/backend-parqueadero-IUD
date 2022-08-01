package co.edu.iudigital.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.iudigital.dto.UsuarioDTO;
import co.edu.iudigital.exception.ErrorDto;
import co.edu.iudigital.exception.NotFoundException;
import co.edu.iudigital.exception.RestException;
import co.edu.iudigital.model.Usuario;
import co.edu.iudigital.repository.IUsuarioRepository;
import co.edu.iudigital.service.IUsuarioService;
import co.edu.iudigital.util.ConsUtil;
import co.edu.iudigital.util.Helper;

@Service
@Transactional
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<UsuarioDTO> findAll() throws RestException {
		List<Usuario> usuarios = usuarioRepository.findAll();
		List<UsuarioDTO> usuariosDTO = Helper.convertListUsuarioDTO(usuarios);
		return usuariosDTO;
	}
	
	
	@Override
	public UsuarioDTO save(UsuarioDTO userDTO) {
		Usuario usuario = Helper.convertUsuarioDTOToUsuario(userDTO);
		usuario = usuarioRepository.save(usuario);
		return Helper.convertUsuarioToUsuarioDTO(usuario);
	}


	@Override
	public UsuarioDTO findById(Long codigo) throws RestException {
		Optional<Usuario> usuarioOpt = usuarioRepository.findByCodigo(codigo);
		if (!usuarioOpt.isPresent()) {
			throw new NotFoundException(
				ErrorDto.getErrorDto(HttpStatus.NOT_FOUND.getReasonPhrase(),
						ConsUtil.MESSAGE_NOT_FOUND, HttpStatus.NOT_FOUND.value())
			);
		}
		return Helper.convertUsuarioToUsuarioDTO(usuarioOpt.get());
	}
	
	@Override
	@Transactional
	public void delete(Long codigo) throws RestException {
		Optional<Usuario> usuarioOpt = usuarioRepository.findById(codigo);
		if(usuarioOpt.isPresent()) {
			usuarioRepository.deleteById(codigo);
		}else {
			throw new NotFoundException(ErrorDto.getErrorDto(
					HttpStatus.NOT_FOUND.getReasonPhrase(), 
					ConsUtil.MESSAGE_NOT_FOUND, 
					HttpStatus.NOT_FOUND.value())
				);
		}
	}

	@Override
	public UsuarioDTO findByNameAndOPassword(String nombre, String password) throws RestException {
		Optional<Usuario> usuarioOpt = usuarioRepository.findByNombre(nombre);
		if (!usuarioOpt.isPresent()) {
			throw new NotFoundException(
				ErrorDto.getErrorDto(HttpStatus.NOT_FOUND.getReasonPhrase(),
						ConsUtil.MESSAGE_NOT_FOUND, HttpStatus.NOT_FOUND.value())
			);
		} else if (usuarioOpt.get().getPassword().equals(password)) {
			return Helper.convertUsuarioToUsuarioDTO(usuarioOpt.get());
		} else {
			throw new NotFoundException(
					ErrorDto.getErrorDto(HttpStatus.NOT_FOUND.getReasonPhrase(),
							ConsUtil.MESSAGE_NOT_FOUND, HttpStatus.NOT_FOUND.value())
				);
		}
	}

}
