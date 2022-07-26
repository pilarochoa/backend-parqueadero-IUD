package co.edu.iudigital.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoVehiculo")
public class TipoVehiculo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4012638539503318803L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
	
	@Column(name = "tarifaMes", nullable = false)
	private Float tarifaMes;
    
    @Column(name = "tarifaDia", nullable = false)
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
