import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import services.BD;

public class PanelEsl extends JPanel {
	private JLabel lblNameEsl;
	private BD bd;

	/**
	 * Create the panel.
	 */
	public PanelEsl() {

		setBackground(new Color(0, 139, 139));
		setBounds(10, 21, 548, 385);
		setLayout(null);
		
		lblNameEsl = new JLabel("ESL Pro League XIV");
		lblNameEsl.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameEsl.setFont(new Font("Arial", Font.BOLD, 30));
		lblNameEsl.setBounds(84, 11, 376, 51);
		add(lblNameEsl);
		
		JLabel lblTime3ESL = new JLabel("Liquid");
		lblTime3ESL.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime3ESL.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime3ESL.setBounds(84, 301, 90, 38);
		add(lblTime3ESL);
		
		JLabel lblTime4ESL = new JLabel("Gambit");
		lblTime4ESL.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime4ESL.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime4ESL.setBounds(370, 301, 90, 38);
		add(lblTime4ESL);
		
		JLabel lblVs = new JLabel("X");
		lblVs.setFont(new Font("Arial", Font.BOLD, 20));
		lblVs.setBounds(266, 172, 22, 14);
		add(lblVs);
		
		JLabel lblVs2 = new JLabel("X");
		lblVs2.setFont(new Font("Arial", Font.BOLD, 20));
		lblVs2.setBounds(266, 313, 22, 14);
		add(lblVs2);
		
		JLabel lblNewLabel = new JLabel("Partida 2");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(230, 247, 104, 24);
		add(lblNewLabel);
		
		JLabel lblTime1ESL = new JLabel("Vitality");
		lblTime1ESL.setBounds(84, 167, 104, 24);
		add(lblTime1ESL);
		lblTime1ESL.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime1ESL.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblTime2ESL = new JLabel("Navi");
		lblTime2ESL.setBounds(392, 167, 57, 24);
		add(lblTime2ESL);
		lblTime2ESL.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime2ESL.setFont(new Font("Arial", Font.BOLD, 20));
		
		JLabel lblPartida = new JLabel("Partida 1");
		lblPartida.setBounds(230, 107, 84, 24);
		add(lblPartida);
		lblPartida.setFont(new Font("Arial", Font.BOLD, 20));
	}
}
