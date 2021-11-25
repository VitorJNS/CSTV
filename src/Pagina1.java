import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import model.Time;
import model.TimeDAO;
import services.BD;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

public class Pagina1 extends JPanel {
	
	private BD bd;
	private TimeDAO dao;
	private Time t;
	private JTextField txtCodTime;
	private JTextField txtAbreviacao;
	private JTextField txtJogador1;
	private JTextField txtJogador2;
	private JTextField txtJogador3;
	private JTextField txtJogador4;
	private JTextField txtJogador5;
	private JTextField txtNomeDoTime;

	/**
	 * Create the panel.
	 */
	public Pagina1() {
		
		dao = new TimeDAO();
		t = new Time();
		bd = new BD();
		bd.getConnection();
		
		setBackground(new Color(0, 139, 139));
		setBounds(10, 21, 548, 385);
		setLayout(null);
		
		JLabel lblTimes = new JLabel("TIMES");
		lblTimes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimes.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTimes.setBounds(146, 0, 260, 50);
		add(lblTimes);
		
		JLabel lblJogador2 = new JLabel("Jogador 2:");
		lblJogador2.setBounds(58, 207, 83, 19);
		add(lblJogador2);
		lblJogador2.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogador2.setFont(new Font("Arial", Font.BOLD, 16));
		
		JLabel lblJogador1 = new JLabel("Jogador 1:");
		lblJogador1.setBounds(58, 177, 83, 19);
		add(lblJogador1);
		lblJogador1.setFont(new Font("Arial", Font.BOLD, 16));
		lblJogador1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblJogador4 = new JLabel("Jogador 4:");
		lblJogador4.setBounds(58, 267, 83, 19);
		add(lblJogador4);
		lblJogador4.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogador4.setFont(new Font("Arial", Font.BOLD, 16));
		
		JLabel lblJogador5 = new JLabel("Jogador 5:");
		lblJogador5.setBounds(58, 297, 83, 19);
		add(lblJogador5);
		lblJogador5.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogador5.setFont(new Font("Arial", Font.BOLD, 16));
		
		JLabel lblJogador3 = new JLabel("Jogador 3:");
		lblJogador3.setBounds(58, 237, 83, 19);
		add(lblJogador3);
		lblJogador3.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogador3.setFont(new Font("Arial", Font.BOLD, 16));
		
		JLabel lblcodTime = new JLabel("C\u00F3digo do Time:");
		lblcodTime.setBounds(14, 61, 127, 19);
		add(lblcodTime);
		lblcodTime.setFont(new Font("Arial", Font.BOLD, 16));
		
		txtCodTime = new JTextField();
		txtCodTime.setBounds(156, 61, 46, 20);
		add(txtCodTime);
		txtCodTime.setColumns(10);
		
		
		
		txtAbreviacao = new JTextField();
		txtAbreviacao.setEditable(false);
		txtAbreviacao.setBounds(156, 118, 46, 20);
		add(txtAbreviacao);
		txtAbreviacao.setColumns(10);
		
		txtJogador1 = new JTextField();
		txtJogador1.setEditable(false);
		txtJogador1.setColumns(10);
		txtJogador1.setBounds(156, 178, 332, 20);
		add(txtJogador1);
		
		txtJogador2 = new JTextField();
		txtJogador2.setEditable(false);
		txtJogador2.setColumns(10);
		txtJogador2.setBounds(156, 208, 332, 20);
		add(txtJogador2);
		
		txtJogador3 = new JTextField();
		txtJogador3.setEditable(false);
		txtJogador3.setColumns(10);
		txtJogador3.setBounds(156, 238, 332, 20);
		add(txtJogador3);
		
		txtJogador4 = new JTextField();
		txtJogador4.setEditable(false);
		txtJogador4.setColumns(10);
		txtJogador4.setBounds(156, 268, 332, 20);
		add(txtJogador4);
		
		txtJogador5 = new JTextField();
		txtJogador5.setEditable(false);
		txtJogador5.setColumns(10);
		txtJogador5.setBounds(156, 298, 332, 20);
		add(txtJogador5);
		
		JLabel lblNomeDoTime = new JLabel("Nome do Time:");
		lblNomeDoTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeDoTime.setFont(new Font("Arial", Font.BOLD, 16));
		lblNomeDoTime.setBounds(25, 147, 116, 19);
		add(lblNomeDoTime);
		
		JLabel lblAbreviacao = new JLabel("Abrevia\u00E7\u00E3o:");
		lblAbreviacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbreviacao.setFont(new Font("Arial", Font.BOLD, 16));
		lblAbreviacao.setBounds(43, 117, 98, 19);
		add(lblAbreviacao);
		
		txtNomeDoTime = new JTextField();
		txtNomeDoTime.setEditable(false);
		txtNomeDoTime.setColumns(10);
		txtNomeDoTime.setBounds(156, 147, 332, 20);
		add(txtNomeDoTime);
		
		
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t = dao.mostrarInfo(Integer.parseInt(txtCodTime.getText()));
				if(t!=null) {
					txtAbreviacao.setText(t.getApelidoTime());
					txtNomeDoTime.setText(t.getNomeTime());
					txtJogador1.setText(t.getJogador1());
					txtJogador2.setText(t.getJogador2());
					txtJogador3.setText(t.getJogador3());
					txtJogador4.setText(t.getJogador4());
					txtJogador5.setText(t.getJogador5());
				}
				else {
					JOptionPane.showMessageDialog(null, "Não foram encontrados dados para este código.");
					limparCampos();
				}
			}
		});
		btnBuscar.setBounds(222, 61, 89, 23);
		add(btnBuscar);
			
	}
	private void limparCampos() {
		txtCodTime.setText("");
		txtAbreviacao.setText("");
		txtNomeDoTime.setText("");
		txtJogador1.setText("");
		txtJogador2.setText("");
		txtJogador3.setText("");
		txtJogador4.setText("");
		txtJogador5.setText("");	
		txtCodTime.requestFocus();
	}
}
