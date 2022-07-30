package com.sofka.modelo;

public class VehiculoTripulado extends Vehiculo {
	private Tripulante tripulante; 
	private int numeroTripulante;
	private String finUsoNave;
	
	public VehiculoTripulado(String agencia, String tipoCombustible, int empuje, int velocidad, int capacidadCarga, 
			Tripulante tripulante, int numeroTripulante, String finUsoNave) {
		super(agencia, tipoCombustible, empuje, velocidad, capacidadCarga);
		this.tripulante = tripulante;
		this.numeroTripulante = numeroTripulante;
		this.finUsoNave = finUsoNave;
	}
	

	public Tripulante getTripulante() {
		return tripulante;
	}

	public void setTripulante(Tripulante tripulante) {
		this.tripulante = tripulante;
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
