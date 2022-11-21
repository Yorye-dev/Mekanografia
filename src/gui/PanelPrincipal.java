package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

import logic.Usuarios;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import java.awt.Panel;
import javax.swing.JTextField;

public class PanelPrincipal extends JPanel {
	boolean corriendo;
	String texto;
	Usuarios usuario;
	
	
	
	public Usuarios getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}



	public PanelPrincipal(Usuarios usuario) {
		setSize(getMaximumSize());
		setLayout(new BorderLayout(0, 0));
		
		JPanel topMenu = new JPanel();
		add(topMenu, BorderLayout.NORTH);
		topMenu.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel menuIzqpanel = new JPanel();
		FlowLayout fl_menuIzqpanel = (FlowLayout) menuIzqpanel.getLayout();
		fl_menuIzqpanel.setAlignment(FlowLayout.LEFT);
		menuIzqpanel.setBackground(Color.GRAY);
		topMenu.add(menuIzqpanel);
		
		JComboBox comboBox = new JComboBox();
		menuIzqpanel.add(comboBox);
		
		JPanel menuDerPanel = new JPanel();
		menuDerPanel.setBackground(Color.GRAY);
		FlowLayout fl_menuDerPanel = (FlowLayout) menuDerPanel.getLayout();
		fl_menuDerPanel.setAlignment(FlowLayout.RIGHT);
		topMenu.add(menuDerPanel);
		
		JLabel lblNewLabel = new JLabel(usuario.getNombre());
		lblNewLabel.setIcon(new ImageIcon("img\\Mekanografia.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		menuDerPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LoginOut");
		
		menuDerPanel.add(lblNewLabel_1);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		SeleccionNiveles nivelStadisticas = new SeleccionNiveles(268, 1015);
		panelCentral.add(nivelStadisticas);
		
		Panel textoSupPanel = new Panel();
		textoSupPanel.setBounds(274, 10, 1640, 193);
		panelCentral.add(textoSupPanel);
		textoSupPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Panel panel_2_1 = new Panel();
		panel_2_1.setBounds(274, 209, 1640, 193);
		panelCentral.add(panel_2_1);
		
		Panel panel_2_1_1 = new Panel();
		panel_2_1_1.setBounds(274, 406, 1640, 193);
		panelCentral.add(panel_2_1_1);
		
		this.usuario = usuario;
		
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		System.out.print(usuario.getNombre());
	}
}
