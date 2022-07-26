package co.edu.iudigital.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "celda")
public class Celda implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6361334706958141347L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
    
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    
    @Column(name = "cod_zona", nullable = false)
    private Long cod_zona;
    
    @Column(name = "cod_estado", nullable = false)
    private Long cod_estado;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCod_zona() {
		return cod_zona;
	}

	public void setCod_zona(Long cod_zona) {
		this.cod_zona = cod_zona;
	}

	public Long getCod_estado() {
		return cod_estado;
	}

	public void setCod_estado(Long cod_estado) {
		this.cod_estado = cod_estado;
	}
    
    

}
