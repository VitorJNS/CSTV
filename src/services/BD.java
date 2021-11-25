package services;

import java.sql.*;

public class BD {
	
	//Realiza a conex�o ao BD usando o driver.
	public Connection con = null;
	
	//Realiza a execu��o de instru��es SQL.
	public PreparedStatement st = null;
	
	//Manipula uma tabela em mem�ria.
	public ResultSet rs = null;
	
	private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final String DATABASENAME = "CS_GO";
	private final String URL = "jdbc:sqlserver://localhost:1433;databasename="+DATABASENAME;
	private final String LOGIN = "sa";
	private final String PASSWORD = "123";

	/**
	 * Realiza a conex�o ao banco de dados
	 * @return - True em caso de sucesso ou False caso contr�rio
	 */
	public boolean getConnection() {
		try {
		Class.forName(DRIVER); //Carregando o DRIVER
		//System.out.println("Driver carregado com sucesso! ");
		con = DriverManager.getConnection(URL,LOGIN,PASSWORD);
		System.out.println("Conectado com sucesso! ");
		return true;
		}
		catch(ClassNotFoundException erro) {
			System.out.println("Driver n�o encontrado! ");
			return false;
		}
		catch(SQLException erro) {
			System.out.println("Falha na conex�o! " + erro);
			return false;
		}
	}
	
	/**
	 * Encerra a conex�o com o banco de dados, fechando todos os objetos utilizados
	 */
	public void close() {
		
		try {
			if(rs!=null) rs.close();
			if(st!=null) st.close();
			if(con!=null) {
				con.close();
				System.out.println("Desconectou...");
			}
		}
		catch(SQLException erro) {}
	}
	
	public static void main (String[] args) {
		
		BD bd = new BD();
		bd.getConnection();
		//Executar uma instru��o
		bd.close();
	}
}
