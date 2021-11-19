import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelTimes extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelTimes() {
		setBackground(new Color(0, 139, 139));
		
		setBounds(0, 0, 568, 430);
		setLayout(null);
		
		JPanel content2 = new JPanel();
		content2.setBackground(new Color(0, 139, 139));
		content2.setBounds(10, 11, 548, 392);
		add(content2);
		content2.setLayout(null);
		
		Pagina1 p1 = new Pagina1();
		p1.setSize(548, 385);
		p1.setLocation(0,0);
		
		content2.removeAll();
		content2.add(p1, BorderLayout.CENTER);
		content2.revalidate();
		content2.repaint();
		
		JButton btnProxima = new JButton(">");
		btnProxima.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pagina2 p2 = new Pagina2();
				p2.setSize(548, 385);
				p2.setLocation(0,0);
				
				content2.removeAll();
				content2.add(p2, BorderLayout.CENTER);
				content2.revalidate();
				content2.repaint();
			}
		});
		btnProxima.setFont(new Font("Arial", Font.BOLD, 20));
		btnProxima.setBorderPainted(false);
		btnProxima.setBorder(null);
		btnProxima.setBackground(new Color(0, 139, 139));
		btnProxima.setBounds(515, 395, 53, 35);
		add(btnProxima);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pagina1 p1 = new Pagina1();
				p1.setSize(548, 385);
				p1.setLocation(0,0);
				
				content2.removeAll();
				content2.add(p1, BorderLayout.CENTER);
				content2.revalidate();
				content2.repaint();
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 20));
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBorder(null);
		btnVoltar.setBackground(new Color(0, 139, 139));
		btnVoltar.setBounds(0, 395, 53, 35);
		add(btnVoltar);
	}
}
