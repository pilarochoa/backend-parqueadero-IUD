package co.edu.iudigital.dto;

import java.io.Serializable;

import co.edu.iudigital.model.EstadoCelda;
import co.edu.iudigital.model.Zona;

public class CeldaDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long codigo;
    
    private String nombre;
    
    private Zona zona;
    
    private EstadoCelda estadoCelda;

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

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public EstadoCelda getEstadoCelda() {
		return estadoCelda;
	}

	public void setEstadoCelda(EstadoCelda estadoCelda) {
		this.estadoCelda = estadoCelda;
	}
	    
}
