package co.edu.iudigital.dto;

import java.io.Serializable;

import co.edu.iudigital.model.Cargo;

public class MenuDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Long id;
    
	
	private String nombre;
     
	
	
	private Cargo cargo;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Cargo getCargo() {
		return cargo;
	}



	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	

}
