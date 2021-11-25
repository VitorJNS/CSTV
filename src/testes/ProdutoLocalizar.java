package testes;

import model.Pessoa;
import model.PessoaDAO;

public class ProdutoLocalizar {

	public static void main(String[] args) {
		PessoaDAO dao = new PessoaDAO();
		Pessoa p = dao.localizar(1);
		if(p!=null){
			System.out.println(p.toString());
		}
		else{
			System.out.println("Produto não encontrado!");
		}
	}

}
