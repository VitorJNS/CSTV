import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
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

public class FrameCadastro extends JFrame {

	private JPanel contentPane;

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
		
		JLabel lblNewLabel = new JLabel("CADASTRO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(131, 35, 132, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblCadastroNome = new JLabel("Nome:");
		lblCadastroNome.setFont(new Font("Arial", Font.BOLD, 13));
		lblCadastroNome.setBounds(25, 97, 55, 19);
		contentPane.add(lblCadastroNome);
		
		JTextPane textPaneNome = new JTextPane();
		textPaneNome.setBounds(81, 97, 277, 19);
		contentPane.add(textPaneNome);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setFont(new Font("Arial", Font.BOLD, 13));
		lblCodigo.setBounds(25, 157, 55, 19);
		contentPane.add(lblCodigo);
		
		JTextPane textPaneEmail = new JTextPane();
		textPaneEmail.setBounds(81, 157, 277, 19);
		contentPane.add(textPaneEmail);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.BOLD, 13));
		lblSenha.setBounds(25, 127, 55, 19);
		contentPane.add(lblSenha);
		
		JTextPane textPaneSenha = new JTextPane();
		textPaneSenha.setBounds(81, 127, 277, 19);
		contentPane.add(textPaneSenha);
		
		JButton btnCriarConta = new JButton("Criar Conta");
		btnCriarConta.setFont(new Font("Arial", Font.BOLD, 14));
		btnCriarConta.setBounds(131, 200, 132, 33);
		contentPane.add(btnCriarConta);
		
		JLabel lblXCadastro = new JLabel("X");
		lblXCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblXCadastro.setForeground(Color.WHITE);
		lblXCadastro.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblXCadastro.setBounds(380, 0, 20, 20);
		contentPane.add(lblXCadastro);
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
		
	}

}
