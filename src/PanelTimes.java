import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PanelTimes extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelTimes() {
		
		setBounds(0, 0, 568, 430);
		setLayout(null);
		
		JLabel lblAquiVaiSer = new JLabel("AQUI VAI SER OS TIMES");
		lblAquiVaiSer.setForeground(Color.MAGENTA);
		lblAquiVaiSer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAquiVaiSer.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblAquiVaiSer.setBounds(10, 129, 548, 149);
		add(lblAquiVaiSer);
	}

}
