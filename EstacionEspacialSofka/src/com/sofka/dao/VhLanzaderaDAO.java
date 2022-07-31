package com.sofka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sofka.modelo.Vehiculo;
import com.sofka.modelo.VehiculoLanzadera;

public class VhLanzaderaDAO {
	private Connection conn = null;

	private Statement stmt = null;

	public VhLanzaderaDAO(){
		Conexion conec = new Conexion();
		conec.conectar();
		conn = conec.con;
	}

	public void insertarVL(Vehiculo VhLanzare) {
		try {
			stmt = conn.createStatement();

			String sql = "INSERT INTO VhLanzadera (agencia, tipoCombustible, empuje, velocidad, capacidadCarga)" +
			"VALUES ('" + VhLanzare.getAgencia() + "','"+ VhLanzare.getTipoCombustible() + "','" + VhLanzare.getEmpuje() 
			+"','" + VhLanzare.getVelocidad() +"','" + VhLanzare.getCapacidadCarga() + "')";
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
	
	public ArrayList<VehiculoLanzadera> buscarVHL(){
		try{
			Conexion conec = new Conexion();
			conec.conectar();
			conn = conec.con;
		    VehiculoLanzadera VhLanzadera=null;
		    ArrayList<VehiculoLanzadera> VhLanzar=new ArrayList<VehiculoLanzadera>();
		      String sql = "SELECT * FROM vhlanzadera";
		      PreparedStatement st=conn.prepareStatement(sql);
		      ResultSet resultado=st.executeQuery(sql);
		      while (resultado.next()){
		          VhLanzadera=new VehiculoLanzadera(resultado.getString("agencia"),resultado.getString("tipoCombustible")
		        		  ,resultado.getInt("empuje"), resultado.getInt("velocidad"), resultado.getInt("capacidadCarga"));
		          VhLanzar.add(VhLanzadera);
		        }
		      return VhLanzar;
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
