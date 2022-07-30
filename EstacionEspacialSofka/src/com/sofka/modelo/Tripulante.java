package com.sofka.modelo;

public class Tripulante {
	private String cedula;
	
	private String nombre;
	private String rol;
	
	public Tripulante(String cedula, String nombre, String rol) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.rol = rol;
	}
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
}
