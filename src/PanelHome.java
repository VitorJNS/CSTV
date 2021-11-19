import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PanelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		
		setBounds(0, 0, 568, 430);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("AQUI VAI SER A HOME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 137, 548, 149);
		add(lblNewLabel);
	}

}
