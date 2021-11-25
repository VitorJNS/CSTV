package model;

public class Time {
	
	private int codTime;
	private String apelidoTime;
	private String nomeTime;
	private String jogador1;
	private String jogador2;
	private String jogador3;
	private String jogador4;
	private String jogador5;
	
	public Time() {
		
	}

	public Time(int codTime, String apelidoTime, String nomeTime, String jogador1, String jogador2,
			String jogador3, String jogador4, String jogador5) {
		this.codTime = codTime;
		this.apelidoTime = apelidoTime;
		this.nomeTime = nomeTime;
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		this.jogador3 = jogador3;
		this.jogador4 = jogador4;
		this.jogador5 = jogador5;
	}

	public String toString() {
		return "[" + codTime + "," + apelidoTime + "," + nomeTime + "," + jogador1 + "," + jogador2 + "," + jogador3
				+ "," + jogador4 + "," + jogador5 + "]";
	}

	public int getCodTime() {
		return codTime;
	}

	public void setCodTime(int codTime) {
		this.codTime = codTime;
	}

	public String getApelidoTime() {
		return apelidoTime;
	}

	public void setApelidoTime(String apelidoTime) {
		this.apelidoTime = apelidoTime;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public String getJogador1() {
		return jogador1;
	}

	public void setJogador1(String jogador1) {
		this.jogador1 = jogador1;
	}

	public String getJogador2() {
		return jogador2;
	}

	public void setJogador2(String jogador2) {
		this.jogador2 = jogador2;
	}

	public String getJogador3() {
		return jogador3;
	}

	public void setJogador3(String jogador3) {
		this.jogador3 = jogador3;
	}

	public String getJogador4() {
		return jogador4;
	}

	public void setJogador4(String jogador4) {
		this.jogador4 = jogador4;
	}

	public String getJogador5() {
		return jogador5;
	}

	public void setJogador5(String jogador5) {
		this.jogador5 = jogador5;
	}
}
