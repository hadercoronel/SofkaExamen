package com.sofka.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.sofka.modelo.Tripulante;
import com.sofka.modelo.Vehiculo;
import com.sofka.modelo.VehiculoLanzadera;
import com.sofka.modelo.VehiculoNoTripulados;
import com.sofka.modelo.VehiculoTripulado;

public class Naves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tripulante tripulante = new Tripulante("123456", "Hader", "ingeniero");
		Vehiculo vehiculoLanzadera = new VehiculoLanzadera("nasa", "propelente", 35000, 33000, 120);
		Vehiculo vehiculoNoTripulado = new VehiculoNoTripulados("nasa", "propelente", 35000, 33000, 120);
		Vehiculo vehiculoTripulado = new VehiculoTripulado("nasa", "propelente", 35000, 33000, 120, tripulante, 3,
				"reparacion");
		ArrayList<Vehiculo> vehiculo = new ArrayList();

		vehiculo.add(vehiculoLanzadera);
		vehiculo.add(vehiculoNoTripulado);
		vehiculo.add(vehiculoTripulado);
		// int nave;
		String mensaje = null;
		System.out.println("Seleccione un numero del 1-3 \n" + "para elegir el tipo de nave \n" + "que desea: \n\n"
				+ "1- Vehiculo Lanzadera. \n" + "2- Vehiculo No Tripulado. \n" + "3- Vehiculo Tripulado \n"
				+ "Escriba: ");
		Scanner lecturaint = new Scanner(System.in);
		Scanner lecturaStg = new Scanner(System.in);
		int nave = lecturaint.nextInt();
		do {
			switch (nave) {
			// multiples cases sin declaraciones break

			case 1:

				System.out.println("----Opcion 1 Vehiculo Lanzadera----");
				System.out.println("Digite Agencia: ");
				vehiculoLanzadera.setAgencia(lecturaStg.next());
				System.out.println("Digite Tipo de Combustible: ");
				vehiculoLanzadera.setTipoCombustible(lecturaStg.next());
				System.out.println("Digite Empuje (NM): ");
				vehiculoLanzadera.setEmpuje(lecturaint.nextInt());
				System.out.println("Digite Velocidad Max (Km/h): ");
				vehiculoLanzadera.setVelocidad(lecturaint.nextInt());
				System.out.println("Digite Capacidad Carga(Tonelada): ");
				vehiculoLanzadera.setCapacidadCarga(lecturaint.nextInt());
				vehiculo.add(vehiculoLanzadera);
				break;
			case 2:
				System.out.println("----Opcion 2 Vehiculo No Tripulado----");
				System.out.println("Opcion 1");
				System.out.println("Digite Agencia: ");
				vehiculoNoTripulado.setAgencia(lecturaStg.next());
				System.out.println("Digite Tipo de Combustible: ");
				vehiculoNoTripulado.setTipoCombustible(lecturaStg.next());
				System.out.println("Digite Empuje: ");
				vehiculoNoTripulado.setEmpuje(lecturaint.nextInt());
				System.out.println("Digite Velocidad Max: ");
				vehiculoNoTripulado.setVelocidad(lecturaint.nextInt());
				System.out.println("Digite Capacidad Carga: ");
				vehiculoNoTripulado.setCapacidadCarga(lecturaint.nextInt());
				vehiculo.add(vehiculoNoTripulado);
				break;
			case 3:
				System.out.println("----Opcion Vehiculo Tripulados----");
				System.out.println("Opcion 1");
				System.out.println("Digite Agencia: ");
				vehiculoTripulado.setAgencia(lecturaStg.next());
				System.out.println("Digite Tipo de Combustible: ");
				vehiculoTripulado.setTipoCombustible(lecturaStg.next());
				System.out.println("Digite Empuje: ");
				vehiculoTripulado.setEmpuje(lecturaint.nextInt());
				System.out.println("Digite Velocidad Max: ");
				vehiculoTripulado.setVelocidad(lecturaint.nextInt());
				System.out.println("Digite Capacidad Carga: ");
				vehiculoTripulado.setCapacidadCarga(lecturaint.nextInt());
				// System.out.println("Digite Capacidad Carga: "); vehiculoTripulado.Set
				vehiculo.add(vehiculoTripulado);
				break;

			default:
				System.out.println("Tipo de nave invalido");

			}
			System.out.println("Desea continuar en el Programa [S/N]"); mensaje=lecturaStg.next();
		} while ("N" == mensaje || "n" == mensaje); System.out.println("Hasta pronto.");

	}

}
