package co.edu.iudigital.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cod_zona")
    private Zona zona;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cod_estado")
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
