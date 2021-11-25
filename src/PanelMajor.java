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
		
		JLabel lblNameMajor = new JLabel("PGL Major Stockholm 2021");
		lblNameMajor.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameMajor.setFont(new Font("Arial", Font.BOLD, 30));
		lblNameMajor.setBounds(82, 11, 386, 57);
		add(lblNameMajor);
		
		JLabel lblTime1MAJOR = new JLabel("GODSENT");
		lblTime1MAJOR.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime1MAJOR.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime1MAJOR.setBounds(40, 136, 192, 38);
		add(lblTime1MAJOR);
		
		JLabel lblTime3MAJOR = new JLabel("FURIA");
		lblTime3MAJOR.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime3MAJOR.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime3MAJOR.setBounds(40, 280, 192, 38);
		add(lblTime3MAJOR);
		
		JLabel lblTime2MAJOR = new JLabel("paiN");
		lblTime2MAJOR.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime2MAJOR.setFont(new Font("Arial", Font.BOLD, 20));
		lblTime2MAJOR.setBounds(317, 136, 192, 38);
		add(lblTime2MAJOR);
		
		JLabel lblTime4MAJOR = new JLabel("Faze");
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
		lblNewLabel_3.setBounds(233, 245, 84, 24);
		add(lblNewLabel_3);
		
		JLabel lblPartida = new JLabel("Partida 1");
		lblPartida.setFont(new Font("Arial", Font.BOLD, 20));
		lblPartida.setBounds(233, 101, 84, 24);
		add(lblPartida);

	}

}
