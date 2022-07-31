package com.sofka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sofka.modelo.Vehiculo;
import com.sofka.modelo.VehiculoLanzadera;
import com.sofka.modelo.VehiculoNoTripulados;

public class VhNoTripuladoDAO {
	private Connection conn = null;

	private Statement stmt = null;

	public VhNoTripuladoDAO(){
		Conexion conec = new Conexion();
		conec.conectar();
		conn = conec.con;
	}
	//CREATE TABLE VhNotripulado (id int(8) AUTO_INCREMENT PRIMARY KEY,agencia Varchar(30), tipoCombustible Varchar(30), empuje int(8), velocidad int(8), capacidadCarga int(8))
	public void insertarVHNot(Vehiculo VhNoTripula) {
		try {
			stmt = conn.createStatement();

			String sql = "INSERT INTO VhNoTripulado (agencia, tipoCombustible, empuje, velocidad, capacidadCarga)" +
			"VALUES ('" + VhNoTripula.getAgencia() + "','"+ VhNoTripula.getTipoCombustible() + "','" + VhNoTripula.getEmpuje() 
			+"','" + VhNoTripula.getVelocidad() +"','" + VhNoTripula.getCapacidadCarga() + "')";
			stmt.executeUpdate(sql);
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // do nothing
		} // end try
	}
	
	public ArrayList<VehiculoNoTripulados> buscarVHNot(){
		try{
			Conexion conec = new Conexion();
			conec.conectar();
			conn = conec.con;
		    VehiculoNoTripulados VhNotripula=null;
		    ArrayList<VehiculoNoTripulados> VhNotripu=new ArrayList<VehiculoNoTripulados>();
		      String sql = "SELECT * FROM vhnotripulado";
		      PreparedStatement st=conn.prepareStatement(sql);
		      ResultSet resultado=st.executeQuery(sql);
		      while (resultado.next()){
		          VhNotripula=new VehiculoNoTripulados(resultado.getString("agencia"),resultado.getString("tipoCombustible")
		        		  ,resultado.getInt("empuje"), resultado.getInt("velocidad"), resultado.getInt("capacidadCarga"));
		          VhNotripu.add(VhNotripula);
		        }
		      return VhNotripu;
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		      return null;
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		      return null;
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		    	  se.printStackTrace();
		    	  return null;
		      }// do nothing
		   }//end try
	}
}
