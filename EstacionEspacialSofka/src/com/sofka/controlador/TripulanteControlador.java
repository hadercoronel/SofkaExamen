package com.sofka.controlador;

import java.util.ArrayList;

import com.sofka.modelo.Tripulante;

public class TripulanteControlador {
	ArrayList<Tripulante> tripulantes;
	
	public void agregarTripulante(Tripulante tripulante){
		if(tripulantes==null) {
			tripulantes = new ArrayList<Tripulante>();
		}
		tripulantes.add(tripulante);
	}
	
	public Tripulante buscarTripulante(String cedula) {
		if(cedula!=null && tripulantes!=null) {
			for (Tripulante tripulante : tripulantes) {
				if(tripulante.equals(cedula)) {
					return tripulante;
				}
			}
		}	
		return null;
	}
}
