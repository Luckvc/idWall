package com.idwall.jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
	
	private static String usuario = "RM95053";
	private static String senha = "191296";
	private static String urlBanco = "oracle.fiap.com.br:1521:orcl";
	
	
	
	public static Connection getConexao(){
		
		Connection conn = null;
		 
        try {

            String dbURL = "jdbc:oracle:thin:"+usuario+"/"+senha+"@"+urlBanco;
            conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected");
            }
 
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        
        return conn;
        
		}
	

	 
  
	public static void closeConnection(Connection conn) {
		
		try {
			if ((conn != null) && (!conn.isClosed())) {
				conn.close();
				System.out.println("Connection closed");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}	
	}
    

		
}
