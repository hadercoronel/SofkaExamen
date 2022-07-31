package com.sofka.modelo;

import java.util.ArrayList;

public class VehiculoTripulado extends Vehiculo {
	private ArrayList<Tripulante> tripulantes; 
	private int numeroTripulante;
	private String finUsoNave;
	
	public VehiculoTripulado(String agencia, String tipoCombustible, int empuje, int velocidad, int capacidadCarga, int numeroTripulante, String finUsoNave) {
		super(agencia, tipoCombustible, empuje, velocidad, capacidadCarga);
		this.numeroTripulante = numeroTripulante;
		this.finUsoNave = finUsoNave;
	}
	


	public int getNumeroTripulante() {
		return numeroTripulante;
	}

	public void setNumeroTripulante(int numeroTripulante) {
		this.numeroTripulante = numeroTripulante;
	}

	public String getFinUsoNave() {
		return finUsoNave;
	}

	public void setFinUsoNave(String finUsoNave) {
		this.finUsoNave = finUsoNave;
	}

	public void despegar() {};
	public void cargarCombustible() {};
	public void verificacionDespegue() {};
}
