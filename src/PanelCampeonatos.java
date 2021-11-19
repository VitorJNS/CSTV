import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PanelCampeonatos extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelCampeonatos() {
		
		setBounds(0, 0, 568, 430);
		setLayout(null);
		
		JLabel lblAquiVaiSer = new JLabel("AQUI VAI SER CAMPEONATOS");
		lblAquiVaiSer.setForeground(Color.RED);
		lblAquiVaiSer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAquiVaiSer.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblAquiVaiSer.setBounds(10, 123, 548, 149);
		add(lblAquiVaiSer);
	}

}
