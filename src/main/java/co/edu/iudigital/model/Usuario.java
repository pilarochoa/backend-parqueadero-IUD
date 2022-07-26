package co.edu.iudigital.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "usuario")
public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5860564475685249999L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo; 
    
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
	
	@Column(name = "telefono", length = 10, nullable = false)
	private String telefono;
    
	@Column(name = "password", length = 150, nullable = false)
	private String password;
	
	@Column(name = "cod_cargo", nullable = false)
	private Long cod_cargo;

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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getCod_cargo() {
		return cod_cargo;
	}

	public void setCod_cargo(Long cod_cargo) {
		this.cod_cargo = cod_cargo;
	}
	
	

}
