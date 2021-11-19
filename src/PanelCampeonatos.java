import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

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
		
		JPanel content3 = new JPanel();
		content3.setBackground(new Color(0, 139, 139));
		content3.setBounds(10, 11, 548, 385);
		add(content3);
		content3.setLayout(null);
		
		PaginaCamp pc = new PaginaCamp();
		pc.setSize(548, 385);
		pc.setLocation(0,0);
		
		content3.removeAll();
		content3.add(pc, BorderLayout.CENTER);
		content3.revalidate();
		content3.repaint();
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.setBounds(0, 396, 49, 34);
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaginaCamp pc = new PaginaCamp();
				pc.setSize(548, 385);
				pc.setLocation(0,0);
				
				content3.removeAll();
				content3.add(pc, BorderLayout.CENTER);
				content3.revalidate();
				content3.repaint();
			}
		});
		btnNewButton.setBackground(new Color(0, 139, 139));
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		
		
		JButton btnNewButton1 = new JButton("Ver ESL");
		btnNewButton1.setBackground(new Color(0, 139, 139));
		btnNewButton1.setBorder(null);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelEsl pe = new PanelEsl();
				pe.setSize(548, 385);
				pe.setLocation(0,0);
				
				content3.removeAll();
				content3.add(pe, BorderLayout.CENTER);
				content3.revalidate();
				content3.repaint();
			}
		});
		btnNewButton1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton1.setBounds(67, 396, 128, 34);
		add(btnNewButton1);
		
		JButton btnNewButton1_1 = new JButton("Ver MAJOR");
		btnNewButton1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelMajor pm = new PanelMajor();
				pm.setSize(548, 385);
				pm.setLocation(0,0);
				
				content3.removeAll();
				content3.add(pm, BorderLayout.CENTER);
				content3.revalidate();
				content3.repaint();
			}
		});
		btnNewButton1_1.setBackground(new Color(0, 139, 139));
		btnNewButton1_1.setBorder(null);
		btnNewButton1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton1_1.setBounds(377, 396, 120, 34);
		add(btnNewButton1_1);
	}
}
