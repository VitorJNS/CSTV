import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PaginaCamp extends JPanel {

	private Image img_esea = new ImageIcon(PanelCampeonatos.class.getResource("res/esea.png")).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
	private Image img_major = new ImageIcon(PanelCampeonatos.class.getResource("res/major.png")).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);

	/**
	 * Create the panel.
	 */
	public PaginaCamp() {

		setBackground(new Color(0, 139, 139));
		setBounds(10, 21, 548, 385);
		setLayout(null);
		
		JLabel lblEslNome = new JLabel("ESL");
		lblEslNome.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEslNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblEslNome.setBounds(38, 21, 156, 58);
		add(lblEslNome);
		
		JLabel lblMajorNome = new JLabel("MAJOR");
		lblMajorNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblMajorNome.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMajorNome.setBounds(338, 21, 156, 58);
		add(lblMajorNome);
		
		JLabel lblEslLogo = new JLabel("");
		lblEslLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEslLogo.setBounds(0, 81, 259, 239);
		lblEslLogo.setIcon(new ImageIcon(img_esea));
		add(lblEslLogo);
		
		JLabel lblMajorLogo = new JLabel("");
		lblMajorLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMajorLogo.setBounds(289, 81, 259, 239);
		lblMajorLogo.setIcon(new ImageIcon(img_major));
		add(lblMajorLogo);
	}

}
