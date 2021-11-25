import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import model.Pessoa;
import model.PessoaDAO;
import services.BD;

import java.awt.Color;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameCadastro extends JFrame {

	private JPanel contentPane;
	private PessoaDAO dao;
	private Pessoa p;
	private BD bd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCadastro frame = new FrameCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameCadastro() {
		
		dao = new PessoaDAO();
		p = new Pessoa();
		bd = new BD();
		bd.getConnection();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrameCadastro.class.getResource("/res/csgo-icon-42856.png")));
		setBackground(new Color(47, 79, 79));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 297);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCadastro = new JLabel("CADASTRO");
		lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastro.setFont(new Font("Arial", Font.BOLD, 20));
		lblCadastro.setBounds(131, 11, 132, 33);
		contentPane.add(lblCadastro);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.BOLD, 13));
		lblNome.setBounds(210, 49, 55, 19);
		contentPane.add(lblNome);
		
		JTextPane txtNome = new JTextPane();
		txtNome.setBounds(261, 49, 114, 19);
		contentPane.add(txtNome);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setFont(new Font("Arial", Font.BOLD, 13));
		lblCodigo.setBounds(21, 49, 55, 19);
		contentPane.add(lblCodigo);
		
		JTextPane txtCodigo = new JTextPane();
		txtCodigo.setBounds(86, 49, 114, 19);
		contentPane.add(txtCodigo);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.BOLD, 13));
		lblSenha.setBounds(21, 79, 48, 19);
		contentPane.add(lblSenha);
		
		JTextPane txtSenha = new JTextPane();
		txtSenha.setBounds(86, 79, 114, 19);
		contentPane.add(txtSenha);
		
		JLabel lblXCadastro = new JLabel("X");
		lblXCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblXCadastro.setForeground(Color.WHITE);
		lblXCadastro.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblXCadastro.setBounds(380, 0, 20, 20);
		contentPane.add(lblXCadastro);
		
		JLabel lblNick = new JLabel("Nick:");
		lblNick.setFont(new Font("Arial", Font.BOLD, 13));
		lblNick.setBounds(211, 79, 55, 19);
		contentPane.add(lblNick);
		
		JTextPane txtNick = new JTextPane();
		txtNick.setBounds(261, 79, 114, 19);
		contentPane.add(txtNick);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setFont(new Font("Arial", Font.BOLD, 13));
		lblEndereco.setBounds(10, 109, 64, 19);
		contentPane.add(lblEndereco);
		
		JTextPane txtEndereco = new JTextPane();
		txtEndereco.setBounds(84, 109, 291, 19);
		contentPane.add(txtEndereco);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Arial", Font.BOLD, 13));
		lblBairro.setBounds(28, 138, 48, 19);
		contentPane.add(lblBairro);
		
		JTextPane txtBairro = new JTextPane();
		txtBairro.setBounds(84, 138, 291, 19);
		contentPane.add(txtBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Arial", Font.BOLD, 13));
		lblCidade.setBounds(21, 168, 55, 19);
		contentPane.add(lblCidade);
		
		JTextPane txtCidade = new JTextPane();
		txtCidade.setBounds(84, 168, 291, 19);
		contentPane.add(txtCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Arial", Font.BOLD, 13));
		lblEstado.setBounds(21, 198, 48, 19);
		contentPane.add(lblEstado);
		
		JTextPane txtEstado = new JTextPane();
		txtEstado.setBounds(84, 198, 291, 19);
		contentPane.add(txtEstado);
		
		JTextPane txtCep = new JTextPane();
		txtCep.setBounds(86, 223, 114, 19);
		contentPane.add(txtCep);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Arial", Font.BOLD, 13));
		lblCep.setBounds(36, 223, 40, 19);
		contentPane.add(lblCep);
		
		JLabel lblPais = new JLabel("Pa\u00EDs:");
		lblPais.setFont(new Font("Arial", Font.BOLD, 13));
		lblPais.setBounds(211, 223, 55, 19);
		contentPane.add(lblPais);
		
		JTextPane txtPais = new JTextPane();
		txtPais.setBounds(261, 223, 114, 19);
		contentPane.add(txtPais);
		lblXCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Deseja retornar a tela de Login ? ","Confirmação",JOptionPane.YES_NO_OPTION) ==0) {
					
					FrameLogin frameLogin = new FrameLogin();
					frameLogin.setVisible(true);
					FrameCadastro.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblXCadastro.setForeground(Color.RED);
			}
			
			public void mouseExited(MouseEvent e) {
				lblXCadastro.setForeground(Color.WHITE);
			}
			
		});
		
		JButton btnCriarConta = new JButton("Criar Conta");
		btnCriarConta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				p.setCodPessoa(Integer.parseInt(txtCodigo.getText()));
				p.setNomePessoa(txtNome.getText());
				p.setSenhaPessoa(txtSenha.getText());
				p.setNickPessoa(txtNick.getText());
				p.setEnderecoPessoa(txtEndereco.getText());
				p.setBairroPessoa(txtBairro.getText());
				p.setCidadePessoa(txtCidade.getText());
				p.setEstadoPessoa(txtEstado.getText());
				p.setCepPessoa(Integer.parseInt(txtCep.getText()));
				p.setCodPais(Integer.parseInt(txtPais.getText()));
				JOptionPane.showMessageDialog(btnCriarConta, dao.salvar(p));
				limparCampos();
			}
			private void limparCampos() {
				txtCodigo.setText("");
				txtNome.setText("");
				txtSenha.setText("");
				txtNick.setText("");
				txtEndereco.setText("");
				txtBairro.setText("");
				txtCidade.setText("");
				txtEstado.setText("");
				txtCep.setText("");
				txtPais.setText("");	
				txtCodigo.requestFocus();
			}		
		});
		btnCriarConta.setFont(new Font("Arial", Font.BOLD, 14));
		btnCriarConta.setBounds(131, 253, 132, 33);
		contentPane.add(btnCriarConta);
			
	}
}
