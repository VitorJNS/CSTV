package testes;

import model.Pessoa;
import model.PessoaDAO;

public class PessoaInserir {

	public static void main(String[] args) {

		Pessoa p = new Pessoa(3, "AndreALA", "André", "Rua das Margaridas", "Bairro Jardim Doce", "Indaiatuba", "SP", 12345678, 1, "12345");
		PessoaDAO dao = new PessoaDAO();
		System.out.println(dao.salvar(p));
	}

}
