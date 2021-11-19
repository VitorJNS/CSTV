import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class FrameDashboard extends JFrame {

	private JPanel contentPane;
	
	private Image img_logo = new ImageIcon(FrameLogin.class.getResource("res/csgo-icon-42856.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image img_home = new ImageIcon(FrameLogin.class.getResource("res/home-page.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_campeonatos = new ImageIcon(FrameLogin.class.getResource("res/competition-price.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_partidas = new ImageIcon(FrameLogin.class.getResource("res/competition.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_times = new ImageIcon(FrameLogin.class.getResource("res/collaboration.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_configuracao = new ImageIcon(FrameLogin.class.getResource("res/gear.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_sig_out = new ImageIcon(FrameLogin.class.getResource("res/logout.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	
	
	private PanelHome panelHome;
	private PanelCampeonatos panelCampeonatos;
	private PanelPartidas panelPartidas;
	private PanelTimes panelTimes;
	private PanelConfiguracoes panelConfiguracoes;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDashboard frame = new FrameDashboard();
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
	public FrameDashboard() {
		setBackground(new Color(47, 79, 79));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 452);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelHome = new PanelHome();
		panelCampeonatos = new PanelCampeonatos();
		panelPartidas = new PanelPartidas();
		panelTimes = new PanelTimes();
		panelConfiguracoes = new PanelConfiguracoes();
		
		JPanel paneMenu = new JPanel();
		paneMenu.setBackground(new Color(47, 79, 79));
		paneMenu.setBounds(0, 0, 207, 452);
		contentPane.add(paneMenu);
		paneMenu.setLayout(null);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(0, 0, 207, 140);
		lblIconLogo.setIcon(new ImageIcon(img_logo));
		paneMenu.add(lblIconLogo);
		
		JPanel paneHome = new JPanel();
		paneHome.addMouseListener(new PanelButtonMouseAdapter(paneHome) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHome);
			}
		});
		paneHome.setBackground(new Color(47, 79, 79));
		paneHome.setBounds(0, 140, 207, 40);
		paneMenu.add(paneHome);
		paneHome.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(62, 11, 135, 18);
		paneHome.add(lblNewLabel);
		
		JLabel lblIconHome = new JLabel("");
		lblIconHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconHome.setBounds(6, 0, 40, 40);
		lblIconHome.setIcon(new ImageIcon(img_home));
		paneHome.add(lblIconHome);
		
		JPanel paneProfits = new JPanel();
		paneProfits.addMouseListener(new PanelButtonMouseAdapter(paneProfits){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelCampeonatos);
			}
		});
		paneProfits.setBackground(new Color(47, 79, 79));
		paneProfits.setBounds(0, 180, 207, 40);
		paneMenu.add(paneProfits);
		paneProfits.setLayout(null);
		
		JLabel lblCampeonatos = new JLabel("CAMPEONATOS");
		lblCampeonatos.setForeground(Color.WHITE);
		lblCampeonatos.setFont(new Font("Dialog", Font.BOLD, 14));
		lblCampeonatos.setBounds(62, 11, 135, 18);
		paneProfits.add(lblCampeonatos);
		
		JLabel lblIconProfits = new JLabel("");
		lblIconProfits.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconProfits.setBounds(6, 0, 40, 40);
		lblIconProfits.setIcon(new ImageIcon(img_campeonatos));
		paneProfits.add(lblIconProfits);
		
		JPanel paneOrders = new JPanel();
		paneOrders.addMouseListener(new PanelButtonMouseAdapter(paneOrders){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelPartidas);
			}
		});
		paneOrders.setBackground(new Color(47, 79, 79));
		paneOrders.setBounds(0, 220, 207, 40);
		paneMenu.add(paneOrders);
		paneOrders.setLayout(null);
		
		JLabel lblPartidas = new JLabel("PARTIDAS");
		lblPartidas.setForeground(Color.WHITE);
		lblPartidas.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPartidas.setBounds(62, 11, 135, 18);
		paneOrders.add(lblPartidas);
		
		JLabel lblIconOrders = new JLabel("");
		lblIconOrders.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconOrders.setBounds(6, 0, 40, 40);
		lblIconOrders.setIcon(new ImageIcon(img_partidas));
		paneOrders.add(lblIconOrders);
		
		JPanel paneCustomers = new JPanel();
		paneCustomers.addMouseListener(new PanelButtonMouseAdapter(paneCustomers){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelTimes);
			}
		});
		paneCustomers.setBackground(new Color(47, 79, 79));
		paneCustomers.setBounds(0, 260, 207, 40);
		paneMenu.add(paneCustomers);
		paneCustomers.setLayout(null);
		
		JLabel lblTimes = new JLabel("TIMES");
		lblTimes.setForeground(Color.WHITE);
		lblTimes.setFont(new Font("Dialog", Font.BOLD, 14));
		lblTimes.setBounds(62, 11, 135, 18);
		paneCustomers.add(lblTimes);
		
		JLabel lblIconCustumers = new JLabel("");
		lblIconCustumers.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconCustumers.setBounds(6, 0, 40, 40);
		lblIconCustumers.setIcon(new ImageIcon(img_times));
		paneCustomers.add(lblIconCustumers);
		
		JPanel paneSetting = new JPanel();
		paneSetting.addMouseListener(new PanelButtonMouseAdapter(paneSetting){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelConfiguracoes);
			}
		});
		paneSetting.setBackground(new Color(47, 79, 79));
		paneSetting.setBounds(0, 300, 207, 40);
		paneMenu.add(paneSetting);
		paneSetting.setLayout(null);
		
		JLabel lblConfiguraes = new JLabel("CONFIGURA\u00C7\u00D5ES");
		lblConfiguraes.setForeground(Color.WHITE);
		lblConfiguraes.setFont(new Font("Dialog", Font.BOLD, 14));
		lblConfiguraes.setBounds(62, 11, 135, 18);
		paneSetting.add(lblConfiguraes);
		
		JLabel lblIconSetting = new JLabel("");
		lblIconSetting.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconSetting.setBounds(6, 0, 40, 40);
		lblIconSetting.setIcon(new ImageIcon(img_configuracao));
		paneSetting.add(lblIconSetting);
		
		JPanel paneSignout = new JPanel();
		paneSignout.addMouseListener(new PanelButtonMouseAdapter(paneSignout){
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?")== 0) {
					FrameLogin frameLogin = new FrameLogin();
					frameLogin.setVisible(true);
					FrameDashboard.this.dispose();
				}
				
			}
		});
		paneSignout.setBackground(new Color(47, 79, 79));
		paneSignout.setBounds(0, 384, 207, 40);
		paneMenu.add(paneSignout);
		paneSignout.setLayout(null);
		
		JLabel lblSignOut = new JLabel("SIGN OUT");
		lblSignOut.setForeground(Color.WHITE);
		lblSignOut.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSignOut.setBounds(62, 11, 135, 18);
		paneSignout.add(lblSignOut);
		
		JLabel lblIconSignout = new JLabel("");
		lblIconSignout.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconSignout.setBounds(6, 0, 40, 40);
		lblIconSignout.setIcon(new ImageIcon(img_sig_out));
		paneSignout.add(lblIconSignout);
		
		JLabel lblExit = new JLabel("X");
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setForeground(Color.WHITE);
		lblExit.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblExit.setBounds(785, 0, 20, 20);
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar a aplicação?","Confirmação",JOptionPane.YES_NO_OPTION) ==0) {
					FrameDashboard.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setForeground(Color.RED);
			}
			
			public void mouseExited(MouseEvent e) {
				lblExit.setForeground(Color.WHITE);
			}
			
		});
		contentPane.add(lblExit);
		
		JPanel paneMainContent = new JPanel();
		paneMainContent.setBounds(217, 11, 568, 430);
		contentPane.add(paneMainContent);
		paneMainContent.setLayout(null);
		
		paneMainContent.add(panelHome);
		paneMainContent.add(panelCampeonatos);
		paneMainContent.add(panelPartidas);
		paneMainContent.add(panelTimes);
		paneMainContent.add(panelConfiguracoes);
		
		menuClicked(panelHome);
	}
	
	public void menuClicked(JPanel panel) {
		panelHome.setVisible(false);
		panelCampeonatos.setVisible(false);
		panelPartidas.setVisible(false);
		panelTimes.setVisible(false);
		panelConfiguracoes.setVisible(false);
		
		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(47, 79, 79));
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(60, 179, 113));
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
	}
}
