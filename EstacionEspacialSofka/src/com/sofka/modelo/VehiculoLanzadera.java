package com.sofka.modelo;

public class VehiculoLanzadera extends Vehiculo {
	public VehiculoLanzadera(String agencia, String tipoCombustible, int empuje, int velocidad, int capacidadCarga) {
		super(agencia, tipoCombustible, empuje, velocidad, capacidadCarga);
	}
	public void despegar() {};
	public void cargarCombustible() {};
	public void verificacionDespegue() {};
}
