package model;

import java.sql.*;
import services.BD;

public class TimeDAO {
	
	private String sql;
	private BD bd;
	
	public TimeDAO() {
		bd = new BD();
	}

	public Time mostrarInfo(int codTime) {
		Time t = new Time();
		sql = "select APELIDO_TIME, NOME_TIME, JOGADOR1, JOGADOR2, JOGADOR3, JOGADOR4, JOGADOR5 from TIMES where COD_TIME=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, codTime);
			bd.rs = bd.st.executeQuery();
			if(bd.rs.next()) {
				t.setApelidoTime(bd.rs.getString(1));
				t.setNomeTime(bd.rs.getString(2));
				t.setJogador1(bd.rs.getString(3));
				t.setJogador2(bd.rs.getString(4));
				t.setJogador3(bd.rs.getString(5));
				t.setJogador4(bd.rs.getString(6));
				t.setJogador5(bd.rs.getString(7));
			}
			else {
				t = null;
			}
		}
		catch(SQLException erro) {
			t = null;
		}
		finally {
			bd.close();
		}
		return t;
	}
	
}
