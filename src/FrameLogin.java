import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import model.PessoaDAO;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.Toolkit;

public class FrameLogin extends JFrame {
	
	//Não fazer isso: não tem getName, apenas getResource:
	//private Image img_password = new ImageIcon(FrameLogin.class.getResource(getName("res/key.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JTextField txtNick;
	private JPasswordField txtSenha;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
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
	public FrameLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrameLogin.class.getResource("/res/csgo-icon-42856.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(170, 199, 250, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNick = new JTextField();
		txtNick.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtNick.getText().equals("Username")) {
					txtNick.setText("");
					
				}
				else {
					txtNick.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtNick.getText().equals(""))
					txtNick.setText("Username");
			}
		});
		txtNick.setBorder(null);
		txtNick.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNick.setText("Username");
		txtNick.setBounds(10, 11, 170, 20);
		panel.add(txtNick);
		txtNick.setColumns(10);
		
		JLabel lblIconUsername = new JLabel("");
		lblIconUsername.setIcon(new ImageIcon(FrameLogin.class.getResource("/res/user.png")));
		lblIconUsername.setAlignmentY(Component.TOP_ALIGNMENT);
		lblIconUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconUsername.setBounds(210, 0, 40, 40);
		panel.add(lblIconUsername);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(170, 250, 250, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtSenha = new JPasswordField();
		txtSenha.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtSenha.getText().equals("Password")) {
					txtSenha.setEchoChar('●');
					txtSenha.setText("");
					
				}
				else {
					txtSenha.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtSenha.getText().equals("")) {
					txtSenha.setText("Password");
					txtSenha.setEchoChar((char)0);
				}
			}
		});
		txtSenha.setBorder(null);
		txtSenha.setEchoChar((char)0);
		txtSenha.setFont(new Font("Arial", Font.PLAIN, 12));
		txtSenha.setText("Password");
		txtSenha.setBounds(10, 11, 170, 20);
		panel_1.add(txtSenha);
		
		JLabel lblIconPassword = new JLabel("");
		lblIconPassword.setIcon(new ImageIcon(FrameLogin.class.getResource("/res/key.png")));
		lblIconPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconPassword.setAlignmentY(Component.TOP_ALIGNMENT);
		lblIconPassword.setBounds(210, 0, 40, 40);
		panel_1.add(lblIconPassword);
		
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
		            //Receber usuário e senha
		            String nickPessoa, senhaPessoa;
		            nickPessoa = txtNick.getText();
		            senhaPessoa = txtSenha.getText();
		            
		            PessoaDAO dao = new PessoaDAO();
		            
		            if (dao.efetuaLogin(nickPessoa, senhaPessoa)) {
		            	JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
		                //Abre o menu principal 
		            	FrameDashboard frameDashboard = new FrameDashboard();
						frameDashboard.setVisible(true);
						FrameLogin.this.dispose();
		                
		            }	            
		        } catch (Exception erro) {}
				if(txtNick.getText().equals("admin") && txtSenha.getText().equals("admin123")) {
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
					
					FrameDashboard frameDashboard = new FrameDashboard();
					frameDashboard.setVisible(true);
					FrameLogin.this.dispose();
				}
				else if(txtNick.getText().equals("") || txtNick.getText().equals("Username") ||
						txtSenha.getText().equals("") || txtSenha.getText().equals("Password")) {
					lblLoginMessage.setText("Por favor inserir todos requerimentos!");
				}
				else {
					lblLoginMessage.setText("Username ou Senha incorretos!");
				}
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(30, 60, 60));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(47, 79, 79));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(60, 80, 80));
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(30, 60, 60));
			}
		});
		pnlBtnLogin.setBackground(new Color(47, 79, 79));
		pnlBtnLogin.setBounds(170, 339, 250, 50);
		contentPane.add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOG IN");
		lblNewLabel.setMaximumSize(new Dimension(40, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(101, 11, 110, 28);
		pnlBtnLogin.add(lblNewLabel);
		
		JLabel lblIconLogin = new JLabel("");
		lblIconLogin.setSize(new Dimension(50, 50));
		lblIconLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogin.setMaximumSize(new Dimension(40, 40));
		lblIconLogin.setIcon(new ImageIcon(FrameLogin.class.getResource("/res/login.png")));
		lblIconLogin.setBounds(200, 0, 50, 50);
		pnlBtnLogin.add(lblIconLogin);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar a aplicação?","Confirmação",JOptionPane.YES_NO_OPTION) ==0) {
					
					FrameLogin.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.RED);
			}
			
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.WHITE);
			}
			
		});
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(580, 0, 20, 20);
		contentPane.add(lblX);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(192, 0, 200, 188);
		contentPane.add(lblIconLogo);
		lblIconLogo.setIcon(new ImageIcon(FrameLogin.class.getResource("/res/csgo-icon-42856.png")));
		
		lblLoginMessage.setForeground(new Color(128, 0, 0));
		lblLoginMessage.setFont(new Font("Arial", Font.BOLD, 14));
		lblLoginMessage.setBounds(170, 316, 250, 14);
		contentPane.add(lblLoginMessage);
		
		JLabel lblCadastro = new JLabel("Não possui uma conta ? Cadastre-se agora");
		lblCadastro.setBounds(149, 299, 300, 17);
		contentPane.add(lblCadastro);
		lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastro.setMaximumSize(new Dimension(40, 30));
		lblCadastro.setForeground(Color.WHITE);
		lblCadastro.setFont(new Font("Arial", Font.BOLD, 14));
		setLocationRelativeTo(null);
		lblCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Deseja realizar cadastro ?","Confirmação",JOptionPane.YES_NO_OPTION) ==0) {
					
					FrameCadastro frameCadastro = new FrameCadastro();
					frameCadastro.setVisible(true);
					FrameLogin.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblCadastro.setForeground(Color.RED);
			}
			
			public void mouseExited(MouseEvent e) {
				lblCadastro.setForeground(Color.WHITE);
			}
			
		});
	}
}
