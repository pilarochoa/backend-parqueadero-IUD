package co.edu.iudigital.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import co.edu.iudigital.dto.CargoDTO;
import co.edu.iudigital.dto.CeldaDTO;
import co.edu.iudigital.dto.ClienteDTO;
import co.edu.iudigital.dto.EstadoCeldaDTO;
import co.edu.iudigital.dto.MenuDTO;
import co.edu.iudigital.dto.RegistroDTO;
import co.edu.iudigital.dto.TipoVehiculoDTO;
import co.edu.iudigital.dto.UsuarioDTO;
import co.edu.iudigital.dto.ZonaDTO;
import co.edu.iudigital.model.Cargo;
import co.edu.iudigital.model.Celda;
import co.edu.iudigital.model.Cliente;
import co.edu.iudigital.model.EstadoCelda;
import co.edu.iudigital.model.Menu;
import co.edu.iudigital.model.Registro;
import co.edu.iudigital.model.TipoVehiculo;
import co.edu.iudigital.model.Usuario;
import co.edu.iudigital.model.Zona;

public interface Helper {
	
	//Usuario
	public static UsuarioDTO convertUsuarioToUsuarioDTO(Usuario usuario) {
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		BeanUtils.copyProperties(usuario, usuarioDTO);
		return usuarioDTO;
	}
	
	public static Usuario convertUsuarioDTOToUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		BeanUtils.copyProperties(usuarioDTO, usuario);
		return usuario;
	}
	
	public static List<UsuarioDTO> convertListUsuarioDTO(List<Usuario> usuarios) {
		return usuarios.stream().map(d -> {
			return convertUsuarioToUsuarioDTO(d);
		}).collect(Collectors.toList());
	}
	
	// Cargo
	public static CargoDTO convertCargoToCargoDTO(Cargo cargo) {
		CargoDTO cargoDTO = new CargoDTO();
		BeanUtils.copyProperties(cargo, cargoDTO);
		return cargoDTO;
	}
	
	public static Cargo convertCargoDTOToCargo(CargoDTO cargoDTO) {
		Cargo cargo = new Cargo();
		BeanUtils.copyProperties(cargoDTO, cargo);
		return cargo;
	}
	
	public static List<CargoDTO> convertListCargoDTO(List<Cargo> cargos) {
		return cargos.stream().map(d -> {
			return convertCargoToCargoDTO(d);
		}).collect(Collectors.toList());
	}
	
	// Menu
	public static MenuDTO convertMenuToMenuDTO(Menu menu) {
		MenuDTO menuDTO = new MenuDTO();
		BeanUtils.copyProperties(menu, menuDTO);
		return menuDTO;
	}
	
	public static Menu convertMenuDTOToMenu(MenuDTO menuDTO) {
		Menu menu = new Menu();
		BeanUtils.copyProperties(menuDTO, menu);
		return menu;
	}
	
	public static List<MenuDTO> convertListMenuDTO(List<Menu> menus) {
		return menus.stream().map(d -> {
			return convertMenuToMenuDTO(d);
		}).collect(Collectors.toList());
	}
	
	//cliente
	public static ClienteDTO convertClienteToClienteDTO(Cliente cliente) {
		ClienteDTO clienteDTO = new ClienteDTO();
		BeanUtils.copyProperties(cliente, clienteDTO);
		return clienteDTO;
	}
	
	public static Cliente convertClienteDTOToCliente(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente();
		BeanUtils.copyProperties(clienteDTO, cliente);
		return cliente;
	}
	
	public static List<ClienteDTO> convertListClienteDTO(List<Cliente> clientes) {
		return clientes.stream().map(d -> {
			return convertClienteToClienteDTO(d);
		}).collect(Collectors.toList());
	}
	
	//Registro
	
	public static RegistroDTO convertRegistroToRegistroDTO(Registro registro) {
		RegistroDTO registroDTO = new RegistroDTO();
		BeanUtils.copyProperties(registro, registroDTO);
		return registroDTO;
	}
	
	public static Registro convertRegistroDTOToRegistro(RegistroDTO registroDTO) {
		Registro registro = new Registro();
		BeanUtils.copyProperties(registroDTO, registro);
		return registro;
	}
	
	public static List<RegistroDTO> convertListRegistroDTO(List<Registro> registros) {
		return registros.stream().map(d -> {
			return convertRegistroToRegistroDTO(d);
		}).collect(Collectors.toList());
	}
	
	//TipoVehiculo
	
	public static TipoVehiculoDTO convertTipoVehiculoToTipoVehiculoDTO(TipoVehiculo tipoVehiculo) {
		TipoVehiculoDTO tipoVehiculoDTO = new TipoVehiculoDTO();
		BeanUtils.copyProperties(tipoVehiculo, tipoVehiculoDTO);
		return tipoVehiculoDTO;
	}
	
	public static TipoVehiculo convertTipoVehiculoDTOToTipoVehiculo(TipoVehiculoDTO tipoVehiculoDTO) {
		TipoVehiculo tipoVehiculo = new TipoVehiculo();
		BeanUtils.copyProperties(tipoVehiculoDTO, tipoVehiculo);
		return tipoVehiculo;
	}
	
	public static List<TipoVehiculoDTO> convertListTipoVehiculoDTO(List<TipoVehiculo> tipoVehiculos) {
		return tipoVehiculos.stream().map(d -> {
			return convertTipoVehiculoToTipoVehiculoDTO(d);
		}).collect(Collectors.toList());
	}
	
	//EstadoCelda
	
	public static EstadoCeldaDTO convertEstadoCeldaToEstadoCeldaDTO(EstadoCelda estadoCelda) {
		EstadoCeldaDTO estadoCeldaDTO = new EstadoCeldaDTO();
		BeanUtils.copyProperties(estadoCelda, estadoCeldaDTO);
		return estadoCeldaDTO;
	}
	
	public static EstadoCelda convertEstadoCeldaDTOToEstadoCelda(EstadoCeldaDTO estadoCeldaDTO) {
		EstadoCelda estadoCelda = new EstadoCelda();
		BeanUtils.copyProperties(estadoCeldaDTO, estadoCelda);
		return estadoCelda;
	}
	
	public static List<EstadoCeldaDTO> convertListEstadoCeldaDTO(List<EstadoCelda> estadoCeldas) {
		return estadoCeldas.stream().map(d -> {
			return convertEstadoCeldaToEstadoCeldaDTO(d);
		}).collect(Collectors.toList());
	}
	
	//Celda
	
	public static CeldaDTO convertCeldaToCeldaDTO(Celda celda) {
		CeldaDTO celdaDTO = new CeldaDTO();
		BeanUtils.copyProperties(celda, celdaDTO);
		return celdaDTO;
	}
	
	public static Celda convertCeldaDTOToCelda(CeldaDTO celdaDTO) {
		Celda celda = new Celda();
		BeanUtils.copyProperties(celdaDTO, celda);
		return celda;
	}
	
	public static List<CeldaDTO> convertListCeldaDTO(List<Celda> celdas) {
		return celdas.stream().map(d -> {
			return convertCeldaToCeldaDTO(d);
		}).collect(Collectors.toList());
	}
	
	//Zona
	
	public static ZonaDTO convertZonaToZonaDTO(Zona zona) {
		ZonaDTO zonaDTO = new ZonaDTO();
		BeanUtils.copyProperties(zona, zonaDTO);
		return zonaDTO;
	}
	
	public static Zona convertZonaDTOToZona(ZonaDTO zonaDTO) {
		Zona zona = new Zona();
		BeanUtils.copyProperties(zonaDTO, zona);
		return zona;
	}
	
	public static List<ZonaDTO> convertListZonaDTO(List<Zona> zonas) {
		return zonas.stream().map(d -> {
			return convertZonaToZonaDTO(d);
		}).collect(Collectors.toList());
	}
}
