package com.sofka.dao;
	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sofka.modelo.Tripulante;

public class TripulanteDAO {
		
		private Connection conn = null;
		
		private Statement stmt = null;
		
		public TripulanteDAO(){
			Conexion conec = new Conexion();
			conec.conectar();
			conn = conec.con;
		}
		
		public void insertar(Tripulante tripulante){
			try{
			      stmt = conn.createStatement();
			      
			      String sql = "INSERT INTO tripulante (cedula, nombre, rol)" +
			                   "VALUES ('"+tripulante.getCedula()+"','"+tripulante.getNombre()+"','"+tripulante.getRol()+"')";
			      stmt.executeUpdate(sql);
			      
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            conn.close();
			      }catch(SQLException se){
			    	  se.printStackTrace();
			      }// do nothing
			   }//end try
		}
		
		public ArrayList<Tripulante> buscar(){
			try{
				Conexion conec = new Conexion();
				conec.conectar();
				conn = conec.con;
			    Tripulante tripulante=null;
			    ArrayList<Tripulante> tripulantes=new ArrayList<Tripulante>();
			      String sql = "SELECT * FROM tripulante";
			      PreparedStatement st=conn.prepareStatement(sql);
			      ResultSet resultado=st.executeQuery(sql);
			      while (resultado.next()){
			          tripulante=new Tripulante(resultado.getString("cedula"),resultado.getString("nombre"),resultado.getString("rol"));
			          tripulantes.add(tripulante);
			        }
			      return tripulantes;
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

