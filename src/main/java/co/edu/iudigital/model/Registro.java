package co.edu.iudigital.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registro")
public class Registro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4997648797692586362L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
    
	@Column(name = "placa", length = 6, nullable = false)
	private String placa;
	
	@Column(name = "fecha_inicio", nullable = false)
	private LocalDate fecha_inicio;
    
	@Column(name = "fecha_fin", nullable = false)
	private LocalDate fecha_fin;
    
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_usuarioinicia")
	private Usuario usuarioIninicia;
    
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_usuariofinaliza")
	private Usuario usuarioFinaliza;
    
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_celda")
	private Celda celda;
    
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_cliente")
	private Cliente cliente;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_tipovehiculo")
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
