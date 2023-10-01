package com.idwall;

import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.idwall.jbdc.ConexaoBanco;

@SpringBootApplication
public class IdwallApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdwallApplication.class, args);
		Connection conn = ConexaoBanco.getConexao();
		
		
		
		
		
		
		
		ConexaoBanco.closeConnection(conn);
		
		
		
		

	

}
}
