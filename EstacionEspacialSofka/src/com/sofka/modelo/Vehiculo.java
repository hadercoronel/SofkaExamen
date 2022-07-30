package com.sofka.modelo;

public abstract class Vehiculo {
	private String agencia;
	private String tipoCombustible;
	private int empuje;
	private int velocidad;
	private int capacidadCarga;
	
	public Vehiculo() {}
	public Vehiculo(String agencia, String tipoCombustible, int empuje, int velocidad, int capacidadCarga) {
		super();
		this.agencia = agencia;
		this.tipoCombustible = tipoCombustible;
		this.empuje = empuje;
		this.velocidad = velocidad;
		this.capacidadCarga = capacidadCarga;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public int getEmpuje() {
		return empuje;
	}
	public void setEmpuje(int empuje) {
		this.empuje = empuje;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	
	public abstract void despegar();
	public abstract void cargarCombustible();
	public abstract void verificacionDespegue();
	
	
}
