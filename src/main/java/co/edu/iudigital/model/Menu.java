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
import javax.persistence.Table;

@Entity
@Table (name = "menu")
public class Menu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6196184089935757969L;
	//id INT NOT NULL AUTO_INCREMENT,
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
     
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_cargo")
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
