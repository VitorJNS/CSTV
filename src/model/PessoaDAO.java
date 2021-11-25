package model;

import java.sql.*;
import services.BD;

public class PessoaDAO {
	
	private String sql, men;
	private BD bd;

	public PessoaDAO() {
		bd = new BD();
	}
	
	/**
	 * Realiza a gravação de uma pessoa no banco de dados
	 * @param p - a pessoa a ser salva
	 * @return - uma mensagem informando o ocorrido
	 */
	public String salvar(Pessoa p) {
		sql = "insert into PESSOA values (?,?,?,?,?,?,?,?,?,?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, p.getCodPessoa());
			bd.st.setString(2, p.getNickPessoa());
			bd.st.setString(3, p.getNomePessoa());
			bd.st.setString(4, p.getEnderecoPessoa());
			bd.st.setString(5, p.getBairroPessoa());
			bd.st.setString(6, p.getCidadePessoa());
			bd.st.setString(7, p.getEstadoPessoa());
			bd.st.setInt(8, p.getCepPessoa());
			bd.st.setInt(9, p.getCodPais());
			bd.st.setString(10, p.getSenhaPessoa());
			bd.st.executeUpdate();
			men = "Pessoa "+p.getNomePessoa()+" inserido com sucesso!";
		}
		catch(SQLException erro) {
			sql = "update PESSOA set COD_PESSOA=?,NICKNAME_PESSOA=?,NOME_PESSOA=?,END_PESSOA=?,BAIRRO_PESSOA=?,CIDADE_PESSOA=?,ESTADO_PESSOA=?,CEP_PESSOA=?,"
					+ "COD_PAIS=?,SENHA_PESSOA=?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(1, p.getCodPessoa());
				bd.st.setString(2, p.getNickPessoa());
				bd.st.setString(3, p.getNomePessoa());
				bd.st.setString(4, p.getEnderecoPessoa());
				bd.st.setString(5, p.getBairroPessoa());
				bd.st.setString(6, p.getCidadePessoa());
				bd.st.setString(7, p.getEstadoPessoa());
				bd.st.setInt(8, p.getCepPessoa());
				bd.st.setInt(9, p.getCodPais());
				bd.st.setString(10, p.getSenhaPessoa());
				bd.st.executeUpdate();
				men = "Pessoa "+p.getNomePessoa()+" alterado com sucesso!";
			}
			catch(SQLException erro2) {
				men = "Falha: "+erro.toString();
			}
		}
		finally {
			bd.close();
		}
		return men;
	}
	
	/**
	 * Exclui uma pessoaa partir do seu código
	 * @param codPessoa - o código da pessoa a ser excluído
	 * @return - uma mensagem informando o ocorrido
	 */
	public String excluir(int codPessoa) {
		sql = "delete from PESSOA where COD_PESSOA=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, codPessoa);
			if(bd.st.executeUpdate()==1) {
				men = "Produto excluído com sucesso!";
			}
			else {
				men = "Produto não encontrado!";
			}
		}
		catch(SQLException erro) {
			men = "Falha: "+erro.toString();
		}
		finally {
			bd.close();
		}
		return men;
	}
	
	/**
	 * Localiza uma pessoa a partir de seu código
	 * @param codPessoa - o código da pessoa a ser localizado
	 * @return - a pessoa na forma de um objeto ou null caso não encontrado
	 */
	public Pessoa localizar(int codPessoa) {
		Pessoa p = new Pessoa();
		sql = "select NICKNAME_PESSOA from PESSOA where COD_PESSOA=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, codPessoa);
			bd.rs = bd.st.executeQuery();
			if(bd.rs.next()) {
				p.setNickPessoa(bd.rs.getString(1));
			}
			else {
				p = null;
			}
		}
		catch(SQLException erro) {
			p = null;
		}
		finally {
			bd.close();
		}
		return p;
	}
	
	public boolean efetuaLogin(String nickPessoa, String senhaPessoa) throws SQLException {
	    try {
		    sql = "select * from PESSOA where NICKNAME_PESSOA = ? and SENHA_PESSOA = ?";

		    bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
		    bd.st.setString(1, nickPessoa);
		    bd.st.setString(2, senhaPessoa);
		    bd.rs = bd.st.executeQuery();
		    
		    //Verificar se foi encontrado o registro
		    if (!bd.rs.next()){
		        //Faz login
		        return false;   
		    }
	    }
	    catch (Exception erro) {}
	    finally {
			bd.close();
		}
	    return true;
	}
}
	

