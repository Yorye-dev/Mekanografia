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
		
		JPanel TopMenu = new JPanel();
		add(TopMenu, BorderLayout.NORTH);
		TopMenu.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		TopMenu.add(panel);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		TopMenu.add(panel_1);
		
		JLabel lblNewLabel = new JLabel(usuario.getNombre());
		lblNewLabel.setIcon(new ImageIcon("img\\Mekanografia.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LoginOut");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		panel_1.add(lblNewLabel_1);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		SeleccionNiveles nivelStadisticas = new SeleccionNiveles(268, 1015);
		panelCentral.add(nivelStadisticas);
		
		this.usuario = usuario;
		
		System.out.print(usuario.getNombre());
	}
}
