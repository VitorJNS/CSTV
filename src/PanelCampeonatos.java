import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;

public class PanelCampeonatos extends JPanel {

	private Image img_esea = new ImageIcon(PanelCampeonatos.class.getResource("res/esea.png")).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
	private Image img_major = new ImageIcon(PanelCampeonatos.class.getResource("res/major.png")).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
	
	/**
	 * Create the panel.
	 */
	public PanelCampeonatos() {
		setBackground(new Color(0, 139, 139));
		
		setBounds(0, 0, 568, 430);
		setLayout(null);
		
		JLabel lblEsea = new JLabel("ESL");
		lblEsea.setForeground(new Color(0, 0, 0));
		lblEsea.setHorizontalAlignment(SwingConstants.CENTER);
		lblEsea.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblEsea.setBounds(10, 11, 246, 85);
		add(lblEsea);
		
		JLabel lblCampeonato1 = new JLabel("");
		lblCampeonato1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCampeonato1.setBounds(10, 93, 259, 239);
		lblCampeonato1.setIcon(new ImageIcon(img_esea));
		add(lblCampeonato1);
		
		JLabel lblCampeonato2 = new JLabel("");
		lblCampeonato2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCampeonato2.setBounds(299, 93, 259, 239);
		lblCampeonato2.setIcon(new ImageIcon(img_major));
		add(lblCampeonato2);
		
		JLabel lblMajor = new JLabel("MAJOR");
		lblMajor.setHorizontalAlignment(SwingConstants.CENTER);
		lblMajor.setForeground(new Color(0, 0, 0));
		lblMajor.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblMajor.setBounds(312, 11, 246, 85);
		add(lblMajor);
		
		JButton btnEsl = new JButton("Veja mais");
		btnEsl.setBorder(null);
		btnEsl.setBackground(new Color(245, 245, 220));
		btnEsl.setFont(new Font("Arial", Font.BOLD, 14));
		btnEsl.setBounds(10, 357, 246, 42);
		add(btnEsl);
		
		JButton btnMajor = new JButton("Veja mais");
		btnMajor.setBackground(new Color(245, 245, 220));
		btnMajor.setBorder(null);
		btnMajor.setFont(new Font("Arial", Font.BOLD, 14));
		btnMajor.setBounds(309, 357, 246, 42);
		add(btnMajor);
	}
}
