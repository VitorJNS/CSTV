import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelMajor extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelMajor() {
		
		setBackground(new Color(0, 139, 139));
		setBounds(10, 21, 548, 385);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MAJOR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(93, 0, 359, 57);
		add(lblNewLabel);
		
		JLabel lblTime1MAJOR = new JLabel("Time1");
		lblTime1MAJOR.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime1MAJOR.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime1MAJOR.setBounds(40, 136, 192, 38);
		add(lblTime1MAJOR);
		
		JLabel lblTime3MAJOR = new JLabel("Time3");
		lblTime3MAJOR.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime3MAJOR.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime3MAJOR.setBounds(40, 280, 192, 38);
		add(lblTime3MAJOR);
		
		JLabel lblTime2MAJOR = new JLabel("Time2");
		lblTime2MAJOR.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime2MAJOR.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime2MAJOR.setBounds(317, 136, 192, 38);
		add(lblTime2MAJOR);
		
		JLabel lblTime4MAJOR = new JLabel("Time4");
		lblTime4MAJOR.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime4MAJOR.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime4MAJOR.setBounds(317, 280, 192, 38);
		add(lblTime4MAJOR);
		
		JLabel lblVs = new JLabel("X");
		lblVs.setFont(new Font("Arial", Font.BOLD, 20));
		lblVs.setBounds(268, 148, 22, 14);
		add(lblVs);
		
		JLabel lblVs2 = new JLabel("X");
		lblVs2.setFont(new Font("Arial", Font.BOLD, 20));
		lblVs2.setBounds(268, 295, 22, 14);
		add(lblVs2);
		
		JLabel lblNewLabel_3 = new JLabel("Partida 2");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_3.setBounds(238, 255, 104, 14);
		add(lblNewLabel_3);
		
		JLabel lblPartida = new JLabel("Partida 1");
		lblPartida.setFont(new Font("Arial", Font.BOLD, 20));
		lblPartida.setBounds(238, 111, 104, 14);
		add(lblPartida);

	}

}
