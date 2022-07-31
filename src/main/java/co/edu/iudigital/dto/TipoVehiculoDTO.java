package co.edu.iudigital.dto;

import java.io.Serializable;

public class TipoVehiculoDTO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Long codigo;
	
	
	private String nombre;
	
	
	private Float tarifaMes;
    
   
    private Float tarifaDia;


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


	public Float getTarifaMes() {
		return tarifaMes;
	}


	public void setTarifaMes(Float tarifaMes) {
		this.tarifaMes = tarifaMes;
	}


	public Float getTarifaDia() {
		return tarifaDia;
	}


	public void setTarifaDia(Float tarifaDia) {
		this.tarifaDia = tarifaDia;
	}
    
    

}
