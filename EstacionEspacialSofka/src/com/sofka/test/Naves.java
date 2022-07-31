package com.sofka.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.sofka.controlador.TripulanteControlador;
import com.sofka.controlador.VhLanzaderaControl;
import com.sofka.controlador.VhNoTripuladoControl;
import com.sofka.dao.TripulanteDAO;
import com.sofka.dao.VhLanzaderaDAO;
import com.sofka.dao.VhNoTripuladoDAO;
import com.sofka.modelo.Tripulante;
import com.sofka.modelo.Vehiculo;
import com.sofka.modelo.VehiculoLanzadera;
import com.sofka.modelo.VehiculoNoTripulados;
import com.sofka.modelo.VehiculoTripulado;

public class Naves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tripulante tripulante = new Tripulante("123456", "Hader", "ingeniero");
		Tripulante tripulante2 = new Tripulante("125634", "alfonso", "medico militar");
		
		Vehiculo vehiculoLanzadera = new VehiculoLanzadera("nasa", "propelente", 35000, 33000, 120);
		Vehiculo vehiculoNoTripulado = new VehiculoNoTripulados("nasa", "propelente", 35000, 33000, 120);
		Vehiculo vehiculoTripulado = new VehiculoTripulado("nasa", "propelente", 35000, 33000, 120, 3,"reparacion");
		Vehiculo vehiculoTripulado2 = new VehiculoTripulado("nasa", "propelente", 35000, 33000, 120, 3,"abastecimiento");
		ArrayList<Vehiculo> vehiculo = new ArrayList();
		//-----------------AGREGANDO A LA TABLA ------------------------------------
		TripulanteControlador controlTripulante= new TripulanteControlador();
		TripulanteDAO trpDao = new TripulanteDAO();
		//trpDao.insertar(tripulante);
	    //-----Mostrando los datos de la tabla tripulante
		ArrayList<Tripulante> tripulantes=new ArrayList<Tripulante>();
	   // tripulantes=trpDao.buscar();
	    //for (Tripulante tripulante3 : tripulantes) {
	    	//System.out.println(tripulante.getCedula()+" - " + tripulante.getNombre() +" - "+ tripulante.getRol());
		//}
		Tripulante respuesta=controlTripulante.buscarTripulante(tripulante.getCedula());
		if(respuesta!=null) {
		controlTripulante.agregarTripulante(tripulante);
		}
		Tripulante respuesta2=controlTripulante.buscarTripulante(tripulante2.getCedula());
		if(respuesta2!=null) {
		controlTripulante.agregarTripulante(tripulante2);
		}
		//-----------------AGREGANDO A LA TABLA VhLanzadera----------------------------------------
		VhLanzaderaControl controlVhLanzar= new VhLanzaderaControl();
		VhLanzaderaDAO vhlDao = new VhLanzaderaDAO();
		//vhlDao.insertarVL(vehiculoLanzadera);
		//------------------------------------------------------------------------
		VhNoTripuladoControl controlVhNoTripu= new VhNoTripuladoControl();
		VhNoTripuladoDAO vhnotDao = new VhNoTripuladoDAO();
		vehiculo.add(vehiculoLanzadera);
		vehiculo.add(vehiculoNoTripulado);
		vehiculo.add(vehiculoTripulado);
		// int nave;
		String mensaje = null;
		
		Scanner lecturaint = new Scanner(System.in);
		Scanner lecturaStg = new Scanner(System.in);
		
		do {
			System.out.println("Seleccione un numero del 1-6 \n" + "para elegir el tipo de nave \n" + "que desea: \n\n"
					+ "1- Vehiculo Lanzadera. \n" + "2- Vehiculo No Tripulado. \n" + "3- Vehiculo Tripulado \n"
					+ "4- Mostrar Vehiculo Lanzadera  \n" + "5- Mostrar Vehiculos No Tripulado \n" + "6- Mostrar Vehiculos Tripulado \n"
					+ "Escriba: ");
			int nave = lecturaint.nextInt();
			switch (nave) {
			
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
				//vehiculo.add(vehiculoLanzadera);
				vhlDao.insertarVL(vehiculoLanzadera);
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
				//vehiculo.add(vehiculoNoTripulado);
				vhnotDao.insertarVHNot(vehiculoNoTripulado);
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
				System.out.println("Digite Cedula Tripulante: "); 
				
				controlTripulante.buscarTripulante(lecturaStg.next());
				vehiculo.add(vehiculoTripulado);
				System.out.println("Digite Cedula Tripulante: "); 
				break;
			case 4:
				ArrayList<VehiculoLanzadera> VhLanzadera=new ArrayList<VehiculoLanzadera>();
				    VhLanzadera=vhlDao.buscarVHL();
				    for (VehiculoLanzadera vehiculoLanzadera2 : VhLanzadera) {
				    	System.out.println(vehiculoLanzadera2.getAgencia()+" - " + vehiculoLanzadera2.getTipoCombustible() +" - "+ vehiculoLanzadera2.getEmpuje()
				    	+" - "+ vehiculoLanzadera2.getVelocidad()+" - "+ vehiculoLanzadera2.getCapacidadCarga());
					}
				break;
			case 5:
				ArrayList<VehiculoNoTripulados> VhNoTripula=new ArrayList<VehiculoNoTripulados>();
				VhNoTripula=vhnotDao.buscarVHNot();
			    for (VehiculoNoTripulados vehiculoNoTripula2 : VhNoTripula) {
			    	System.out.println(vehiculoNoTripula2.getAgencia()+" - " + vehiculoNoTripula2.getTipoCombustible() +" - "+ vehiculoNoTripula2.getEmpuje()
			    	+" - "+ vehiculoNoTripula2.getVelocidad()+" - "+ vehiculoNoTripula2.getCapacidadCarga());
				}
				break;
			case 6:
				break;

			default:
				System.out.println("Tipo de nave invalido");

			}
			System.out.println("Desea continuar en el Programa [S/N]"); 
			mensaje=lecturaStg.next();
		} while (mensaje.equals("s")||mensaje.equals("S")); System.out.println("Hasta pronto.");

	}

}
