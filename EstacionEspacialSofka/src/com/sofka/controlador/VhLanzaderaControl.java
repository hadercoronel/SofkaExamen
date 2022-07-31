
package com.sofka.controlador;

import java.util.ArrayList;

import com.sofka.modelo.VehiculoLanzadera;

public class VhLanzaderaControl {
	ArrayList<VehiculoLanzadera> VhLanzar;

	public void agregarTripulante(VehiculoLanzadera VhLanzare) {
		if (VhLanzar == null) {
			VhLanzar = new ArrayList<VehiculoLanzadera>();
		}
		VhLanzar.add(VhLanzare);
	}
	
	public VehiculoLanzadera buscarVhLanzar() {
		for (VehiculoLanzadera vehiculoLanzadera : VhLanzar) {
			return vehiculoLanzadera;
		}
		return null;
	}
}
