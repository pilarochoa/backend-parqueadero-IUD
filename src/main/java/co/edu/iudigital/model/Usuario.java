package co.edu.iudigital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo; 
    
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
    //telefono VARCHAR(10) NOT NULL,
	
	private String telefono;
    //contraseña VARCHAR(150) NOT NULL,    
    //cod_cargo INT NOT NULL,

}
