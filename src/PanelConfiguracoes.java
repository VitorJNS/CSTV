import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import model.PessoaDAO;
import services.BD;
import model.Pessoa;
import javax.swing.JTextField;

public class PanelConfiguracoes extends JPanel {
	
	private Pessoa p;
	private PessoaDAO dao;
	private BD bd;
	private JTextField txtCodPessoa;
	private JTextField txtNomePessoa;

	/**
	 * Create the panel.
	 */
	public PanelConfiguracoes() {
		
		p = new Pessoa();
		dao = new PessoaDAO();
		bd = new BD();
		bd.getConnection();
		
		setBackground(new Color(0, 139, 139));
		
		setBounds(0, 0, 568, 430);
		setLayout(null);
		
		JButton btnExcluir = new JButton("Excluir conta");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao.excluir(Integer.parseInt(txtCodPessoa.getText()));
				JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso, ao deslogar não será mais possível\n "
						+ "acessar o sistema com o usuário excluído.");
				limparCampos();
			}
		});
		btnExcluir.setBounds(368, 133, 116, 23);
		add(btnExcluir);
		
		JLabel lblCodPessoa = new JLabel("C\u00F3digo do Usu\u00E1rio:");
		lblCodPessoa.setFont(new Font("Arial", Font.BOLD, 16));
		lblCodPessoa.setBounds(41, 103, 151, 19);
		add(lblCodPessoa);
		
		txtCodPessoa = new JTextField();
		txtCodPessoa.setColumns(10);
		txtCodPessoa.setBounds(202, 102, 46, 20);
		add(txtCodPessoa);
		
		JLabel lblNomePessoa = new JLabel("Nome do Usu\u00E1rio:");
		lblNomePessoa.setFont(new Font("Arial", Font.BOLD, 16));
		lblNomePessoa.setBounds(51, 133, 139, 19);
		add(lblNomePessoa);
		
		txtNomePessoa = new JTextField();
		txtNomePessoa.setEditable(false);
		txtNomePessoa.setColumns(10);
		txtNomePessoa.setBounds(202, 133, 156, 20);
		add(txtNomePessoa);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				p = dao.localizar(Integer.parseInt(txtCodPessoa.getText()));
				if(p!=null) {
					txtNomePessoa.setText(p.getNickPessoa());
				}
				else {
					JOptionPane.showMessageDialog(null, "Não foram encontrados dados para este código.");
					limparCampos();
				}	
			}
		});
		btnBuscar.setBounds(258, 101, 99, 23);
		add(btnBuscar);
		
		JLabel lblConfiguracoes = new JLabel("CONFIGURA\u00C7\u00D5ES");
		lblConfiguracoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfiguracoes.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblConfiguracoes.setBounds(149, 11, 260, 50);
		add(lblConfiguracoes);
	}
	private void limparCampos() {
		txtCodPessoa.setText("");
		txtNomePessoa.setText("");
		txtCodPessoa.requestFocus();
	}
}
