-- DROP DATABASE parkingIUD;
CREATE DATABASE IF NOT EXISTS parkingIUD;
USE parkingIUD;
CREATE TABLE IF NOT EXISTS cargo(
    codigo INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    PRIMARY KEY (codigo)
);
CREATE TABLE IF NOT EXISTS usuario(
    codigo INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    telefono VARCHAR(10) NOT NULL,
    password VARCHAR(150) NOT NULL,    
    PRIMARY KEY (codigo),
    cod_cargo INT NOT NULL,
    FOREIGN KEY (cod_cargo) REFERENCES cargo(codigo)
);

CREATE TABLE IF NOT EXISTS menu(
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    PRIMARY KEY (id),
    id_cargo INT NOT NULL,
    FOREIGN KEY (id_cargo) REFERENCES cargo(codigo)
);

CREATE TABLE IF NOT EXISTS cliente(
    codigo INT NOT NULL AUTO_INCREMENT,
    tipo_documento VARCHAR(50) NOT NULL,
    documento VARCHAR(15) NOT NULL,
    telefono VARCHAR(10) NOT NULL,
    email VARCHAR(50) NOT NULL,
    PRIMARY KEY (codigo)
);
CREATE TABLE IF NOT EXISTS estadoCelda(
    codigo INT NOT NULL AUTO_INCREMENT,
    nombre INT NOT NULL,
    disponible CHAR(1) NOT NULL,
    color  VARCHAR(10) NOT NULL,
    PRIMARY KEY (codigo)
);
CREATE TABLE IF NOT EXISTS zona(
    codigo INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    PRIMARY KEY (codigo)
);
CREATE TABLE IF NOT EXISTS celda(
    codigo INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    cod_zona INT NOT NULL,
    cod_estado INT NOT NULL,
    PRIMARY KEY (codigo),
    FOREIGN KEY (cod_estado) REFERENCES estadoCelda(codigo),
    FOREIGN KEY (cod_zona) REFERENCES zona(codigo)
); 
CREATE TABLE IF NOT EXISTS registro(
    codigo INT NOT NULL AUTO_INCREMENT,
    placa VARCHAR(6) NOT NULL,
    cod_usuarioinicia INT NOT NULL,
    cod_usuariofinaliza INT NOT NULL,
    cod_celda INT NOT NULL,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    cod_tipovehiculo INT NOT NULL,
    PRIMARY KEY (codigo),
    cod_cliente INT NOT NULL,
    FOREIGN KEY (cod_cliente) REFERENCES cliente(codigo),
    FOREIGN KEY (cod_usuarioinicia) REFERENCES usuario(codigo),
     FOREIGN KEY (cod_usuariofinaliza) REFERENCES usuario(codigo),
     FOREIGN KEY (cod_celda) REFERENCES celda(codigo),
     FOREIGN KEY (cod_tipovehiculo) REFERENCES tipovehiculo(codigo)

    
);
CREATE TABLE IF NOT EXISTS tipoVehiculo(
    codigo INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    tarifaMes FLOAT NOT NULL,
    tarifaDia FLOAT NOT NULL,
    PRIMARY KEY (codigo)
);
