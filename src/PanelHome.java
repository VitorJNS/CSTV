import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JButton;

public class PanelHome extends JPanel {

	private Image img_brasil = new ImageIcon(PanelHome.class.getResource("res/BrasilMajor.jpeg")).getImage().getScaledInstance(468, 150, Image.SCALE_SMOOTH);
	private Image img_fallen = new ImageIcon(PanelHome.class.getResource("res/Fallen.jpg")).getImage().getScaledInstance(468, 150, Image.SCALE_SMOOTH);
	
	
	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBackground(new Color(0, 139, 139));
		
		setBounds(0, 0, 568, 430);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("5 TIMES BRASILEIROS V\u00C3O PARA O MAJOR");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 548, 81);
		add(lblNewLabel);
		
		JLabel lblBrasil = new JLabel("");
		lblBrasil.setHorizontalAlignment(SwingConstants.CENTER);
		lblBrasil.setBounds(0, 23, 568, 220);
		lblBrasil.setIcon(new ImageIcon(img_brasil));
		add(lblBrasil);
		
		JLabel lblFallenTxt = new JLabel("FALLEN NA LIQUID \u00C9 BRASIL !!");
		lblFallenTxt.setForeground(Color.WHITE);
		lblFallenTxt.setHorizontalAlignment(SwingConstants.CENTER);
		lblFallenTxt.setFont(new Font("Arial", Font.BOLD, 21));
		lblFallenTxt.setBounds(10, 210, 548, 81);
		add(lblFallenTxt);
		
		JButton btnPagina2 = new JButton(">");
		btnPagina2.setFont(new Font("Arial", Font.BOLD, 17));
		btnPagina2.setBorderPainted(false);
		btnPagina2.setBorder(null);
		btnPagina2.setBackground(new Color(0, 139, 139));
		btnPagina2.setBounds(525, 406, 43, 24);
		add(btnPagina2);
		
		JLabel lblFalen = new JLabel("");
		lblFalen.setHorizontalAlignment(SwingConstants.CENTER);
		lblFalen.setBounds(0, 251, 568, 199);
		lblFalen.setIcon(new ImageIcon(img_fallen));
		add(lblFalen);
	}
}
