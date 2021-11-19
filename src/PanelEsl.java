import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelEsl extends JPanel {
	private JLabel lblNameEsl;

	/**
	 * Create the panel.
	 */
	public PanelEsl() {

		setBackground(new Color(0, 139, 139));
		setBounds(10, 21, 548, 385);
		setLayout(null);
		
		lblNameEsl = new JLabel("ESL");
		lblNameEsl.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameEsl.setFont(new Font("Arial", Font.BOLD, 30));
		lblNameEsl.setBounds(84, 0, 376, 51);
		add(lblNameEsl);
		
		JLabel lblTime1ESL = new JLabel("Time1");
		lblTime1ESL.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime1ESL.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime1ESL.setBounds(38, 128, 192, 38);
		add(lblTime1ESL);
		
		JLabel lblTime3ESL = new JLabel("Time3");
		lblTime3ESL.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime3ESL.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime3ESL.setBounds(38, 272, 192, 38);
		add(lblTime3ESL);
		
		JLabel lblTime2ESL = new JLabel("Time2");
		lblTime2ESL.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime2ESL.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime2ESL.setBounds(315, 128, 192, 38);
		add(lblTime2ESL);
		
		JLabel lblTime4ESL = new JLabel("Time4");
		lblTime4ESL.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime4ESL.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime4ESL.setBounds(315, 272, 192, 38);
		add(lblTime4ESL);
		
		JLabel lblVs = new JLabel("X");
		lblVs.setFont(new Font("Arial", Font.BOLD, 20));
		lblVs.setBounds(266, 140, 22, 14);
		add(lblVs);
		
		JLabel lblVs2 = new JLabel("X");
		lblVs2.setFont(new Font("Arial", Font.BOLD, 20));
		lblVs2.setBounds(266, 287, 22, 14);
		add(lblVs2);
		
		JLabel lblNewLabel = new JLabel("Partida 2");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(236, 247, 104, 14);
		add(lblNewLabel);
		
		JLabel lblPartida = new JLabel("Partida 1");
		lblPartida.setFont(new Font("Arial", Font.BOLD, 20));
		lblPartida.setBounds(236, 103, 104, 14);
		add(lblPartida);
		
	}
}
