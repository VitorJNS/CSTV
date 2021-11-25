package model;

public class Pessoa {
	
	private int codPessoa;
	private String nickPessoa;
	private String nomePessoa;
	private String enderecoPessoa;
	private String bairroPessoa;
	private String cidadePessoa;
	private String estadoPessoa;
	private int cepPessoa;
	private int codPais;
	private String senhaPessoa;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int codPessoa, String nickPessoa, String nomePessoa, String enderecoPessoa,
			String bairroPessoa, String cidadePessoa, String estadoPessoa, int cepPessoa, int codPais, String senhaPessoa) {
		this.codPessoa = codPessoa;
		this.nickPessoa = nickPessoa;
		this.nomePessoa = nomePessoa;	
		this.enderecoPessoa = enderecoPessoa;
		this.bairroPessoa = bairroPessoa;
		this.cidadePessoa = cidadePessoa;
		this.estadoPessoa = estadoPessoa;
		this.cepPessoa = cepPessoa;
		this.codPais = codPais;
		this.senhaPessoa = senhaPessoa;
	}

	public String toString() {
		return "["+codPessoa+","+nickPessoa+","+nomePessoa+","+enderecoPessoa+","+bairroPessoa+","
	+cidadePessoa+","+estadoPessoa+","+cepPessoa+","+codPais+","+senhaPessoa+"]";
	}

	public int getCodPessoa() {
		return codPessoa;
	}
	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}
	public String getNickPessoa() {
		return nickPessoa;
	}
	public void setNickPessoa(String nickPessoa) {
		this.nickPessoa = nickPessoa;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	
	public String getEnderecoPessoa() {
		return enderecoPessoa;
	}
	public void setEnderecoPessoa(String enderecoPessoa) {
		this.enderecoPessoa = enderecoPessoa;
	}
	public String getBairroPessoa() {
		return bairroPessoa;
	}
	public void setBairroPessoa(String bairroPessoa) {
		this.bairroPessoa = bairroPessoa;
	}
	public String getCidadePessoa() {
		return cidadePessoa;
	}
	public void setCidadePessoa(String cidadePessoa) {
		this.cidadePessoa = cidadePessoa;
	}
	public String getEstadoPessoa() {
		return estadoPessoa;
	}
	public void setEstadoPessoa(String estadoPessoa) {
		this.estadoPessoa = estadoPessoa;
	}
	public int getCepPessoa() {
		return cepPessoa;
	}
	public void setCepPessoa(int cepPessoa) {
		this.cepPessoa = cepPessoa;
	}
	public int getCodPais() {
		return codPais;
	}
	public void setCodPais(int codPais) {
		this.codPais = codPais;
	}
	public String getSenhaPessoa() {
		return senhaPessoa;
	}
	public void setSenhaPessoa(String senhaPessoa) {
		this.senhaPessoa = senhaPessoa;
	}

}
