package com.sofka.controlador;

import java.util.ArrayList;

import com.sofka.modelo.VehiculoNoTripulados;

public class VhNoTripuladoControl {
		ArrayList<VehiculoNoTripulados> VhNoTripu;

		public void agregarTripulante(VehiculoNoTripulados VhNoTripula) {
			if (VhNoTripu == null) {
				VhNoTripu = new ArrayList<VehiculoNoTripulados>();
			}
			VhNoTripu.add(VhNoTripula);
		}
		
		public VehiculoNoTripulados buscarVhLanzar() {
			for (VehiculoNoTripulados vehiculoNoTripulados : VhNoTripu) {
				return vehiculoNoTripulados;
			}
			return null;
		}

}
