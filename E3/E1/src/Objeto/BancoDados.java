package Objeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BancoDados {
	Connection con;
	
	ResultSet rs;
	PreparedStatement ps;
	
	//bd db4free.net
	String url = "jdbc:mysql://db4free.net:3306/banco_ep1";
	String user = "admin1316";
	String password = "admin5094";

	public void insereRegistro(Capacete c2) throws SQLException, ClassNotFoundException
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      con = DriverManager.getConnection(url, user, password);
	      System.out.println("Conectou no banco de dados.");
	      
	      String inserir = "INSERT INTO capacete (marca, material, cor, protecao, preco) VALUES (?,?,?,?,?)";
	      ps = con.prepareStatement(inserir);
	     	
		  ps.setString(1, c2.getMarca());
		  ps.setString(2, c2.getMaterial());
		  ps.setString(3, c2.getCor());
		  ps.setString(4, c2.getProtecao());
		  ps.setString(5, String.valueOf(c2.getPreco()));
		  ps.execute();
		  System.out.println("Dados do aluno foram inseridos!");
			
	    } catch (SQLException ex) {
	      System.out.println("Erro: Não conseguiu conectar no BD.");
	    } catch (ClassNotFoundException ex) {
	      System.out.println("Erro: Não encontrou o driver do BD.");
	    }

	
		//Class.forName(driver);
		//con = DriverManager.getConnection(url, user, password);
		//String criarTabela = "create table Aluno (codigo serial primary key, marca varchar(255), material varchar(255), cor varchar(255), protecao varchar(255), preco int ); ";
		//ps = con.prepareStatement(criarTabela);
		
		try {
		      if(con != null && !con.isClosed()) {
		        con.close();
		        System.out.println("Desconectou do banco de dados.");
		      }
		    } catch (SQLException ex) {
		      System.out.println("Não conseguiu desconectar do BD.");
		    }
        
	}
	
}
