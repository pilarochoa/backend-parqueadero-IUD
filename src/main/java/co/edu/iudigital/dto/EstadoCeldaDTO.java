package co.edu.iudigital.dto;

import java.io.Serializable;

public class EstadoCeldaDTO implements Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


private Long codigo;
    
	
	private Long nombre;
    
	
	private String disponible;
    
	
	private String color;


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public Long getNombre() {
		return nombre;
	}


	public void setNombre(Long nombre) {
		this.nombre = nombre;
	}


	public String getDisponible() {
		return disponible;
	}


	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	

}
