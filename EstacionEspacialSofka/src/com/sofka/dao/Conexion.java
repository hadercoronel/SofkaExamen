package com.sofka.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Conexion {
	
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   //
   static final String DB_URL = "jdbc:mysql://localhost:3306/sofkaDB";
   
   static final String USER = "root";
   
   static final String PASS = "";
   
   static Connection con = null;
   
   public void conectar(){
	   try {
		    con = DriverManager.getConnection(DB_URL, USER, PASS);
		    
		    System.out.println("conectado");
		} catch (Exception e) {
			System.out.println(e);
		}
   }
	
}
