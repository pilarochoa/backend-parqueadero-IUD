package co.edu.iudigital.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    
	@Column(name = "cod_usuarioinicia", nullable = false)
	private Long cod_usuarioinicia;
    
	@Column(name = "cod_usuariofinaliza", nullable = false)
	private Long cod_usuariofinaliza;
    
	@Column(name = "cod_celda", nullable = false)
	private Long cod_celda;
    
	@Column(name = "fecha_inicio", nullable = false)
	private LocalDate fecha_inicio;
    
	@Column(name = "fecha_fin", nullable = false)
	private LocalDate fecha_fin;
    
	@Column(name = "cod_cliente", nullable = false)
	private Long cod_cliente;

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

	public Long getCod_usuarioinicia() {
		return cod_usuarioinicia;
	}

	public void setCod_usuarioinicia(Long cod_usuarioinicia) {
		this.cod_usuarioinicia = cod_usuarioinicia;
	}

	public Long getCod_usuariofinaliza() {
		return cod_usuariofinaliza;
	}

	public void setCod_usuariofinaliza(Long cod_usuariofinaliza) {
		this.cod_usuariofinaliza = cod_usuariofinaliza;
	}

	public Long getCod_celda() {
		return cod_celda;
	}

	public void setCod_celda(Long cod_celda) {
		this.cod_celda = cod_celda;
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

	public Long getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(Long cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	
	

}
