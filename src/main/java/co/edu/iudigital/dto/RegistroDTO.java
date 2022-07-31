package co.edu.iudigital.dto;

import java.io.Serializable;
import java.time.LocalDate;

import co.edu.iudigital.model.Celda;
import co.edu.iudigital.model.Cliente;
import co.edu.iudigital.model.TipoVehiculo;
import co.edu.iudigital.model.Usuario;

public class RegistroDTO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Long codigo;
    
	
	private String placa;
	
	
	private LocalDate fecha_inicio;
    
	
	private LocalDate fecha_fin;
    
	
	private Usuario usuarioIninicia;
    

	private Usuario usuarioFinaliza;
    
	
	private Celda celda;
    
	
	private Cliente cliente;
	
	
	private TipoVehiculo tipoVehiculo;


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public LocalDate getFecha_inicio() {
		return fecha_inicio;
	}


	public void setFecha_inicio(LocalDate fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}


	public LocalDate getFecha_fin() {
		return fecha_fin;
	}


	public void setFecha_fin(LocalDate fecha_fin) {
		this.fecha_fin = fecha_fin;
	}


	public Usuario getUsuarioIninicia() {
		return usuarioIninicia;
	}


	public void setUsuarioIninicia(Usuario usuarioIninicia) {
		this.usuarioIninicia = usuarioIninicia;
	}


	public Usuario getUsuarioFinaliza() {
		return usuarioFinaliza;
	}


	public void setUsuarioFinaliza(Usuario usuarioFinaliza) {
		this.usuarioFinaliza = usuarioFinaliza;
	}


	public Celda getCelda() {
		return celda;
	}


	public void setCelda(Celda celda) {
		this.celda = celda;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}


	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
	


}
