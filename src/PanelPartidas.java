import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelPartidas extends JPanel {

	
	
	/**
	 * Create the panel.
	 */
	public PanelPartidas() {
		setBackground(new Color(0, 139, 139));
		setBounds(0, 0, 568, 430);
		setLayout(null);
		
		
		JPanel content = new JPanel();
		content.setBounds(10, 21, 548, 385);
		add(content);
		content.setLayout(null);
		
		
		PanelEsl pe = new PanelEsl();
		pe.setSize(548, 385);
		pe.setLocation(0,0);
		
		content.removeAll();
		content.add(pe, BorderLayout.CENTER);
		content.revalidate();
		content.repaint();
		
		
		JLabel lblAquiVaiSer = new JLabel("AQUI VAI SER AS PARTIDAS");
		lblAquiVaiSer.setBounds(10, 265, 539, 46);
		content.add(lblAquiVaiSer);
		lblAquiVaiSer.setForeground(Color.CYAN);
		lblAquiVaiSer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAquiVaiSer.setFont(new Font("Tahoma", Font.BOLD, 38));
		
		JButton btnPagina2 = new JButton(">");
		btnPagina2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelEsl pe = new PanelEsl();
				pe.setSize(548, 385);
				pe.setLocation(0,0);
				
				content.removeAll();
				content.add(pe, BorderLayout.CENTER);
				content.revalidate();
				content.repaint();
			}
		});
		btnPagina2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnPagina2.setBackground(new Color(0, 139, 139));
		btnPagina2.setBorder(null);
		btnPagina2.setBorderPainted(false);
		btnPagina2.setFont(new Font("Arial", Font.BOLD, 20));
		btnPagina2.setBounds(515, 406, 53, 24);
		add(btnPagina2);
		
		JButton btnPagina1 = new JButton("<");
		btnPagina1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelMajor pm = new PanelMajor();
				pm.setSize(548, 385);
				pm.setLocation(0,0);
				
				content.removeAll();
				content.add(pm, BorderLayout.CENTER);
				content.revalidate();
				content.repaint();
			}
		});
		btnPagina1.setFont(new Font("Arial", Font.BOLD, 20));
		btnPagina1.setBorderPainted(false);
		btnPagina1.setBorder(null);
		btnPagina1.setBackground(new Color(0, 139, 139));
		btnPagina1.setBounds(0, 406, 53, 24);
		add(btnPagina1);
	}
}
