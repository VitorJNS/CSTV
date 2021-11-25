package testes;

import model.PessoaDAO;

public class ProdutoExcluir {

	public static void main(String[] args) {
		PessoaDAO dao = new PessoaDAO();
		System.out.println(dao.excluir(1));

	}

}
