package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import logic.Ficheros;
import logic.Usuarios;

import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import java.awt.Panel;
import javax.swing.JTextField;
import java.awt.Font;

public class PanelPrincipal extends JPanel {
	static boolean corriendo = false;
	Usuarios usuario;
	Timer cronometro;
	static String texto;
	
	
	
	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public PanelPrincipal(Usuarios usuario) {

		JPanel topMenu = new JPanel();
		JPanel menuIzqpanel = new JPanel();
		JPanel panelCentral = new JPanel();
		PanelTextos textoPanel = new PanelTextos();
		
		SeleccionNiveles nivelStadisticas = new SeleccionNiveles(268, 1015);
		Teclado teclado = new Teclado();
		
		FlowLayout fl_menuIzqpanel = (FlowLayout) menuIzqpanel.getLayout();
		JComboBox comboBox = new JComboBox();
		JPanel menuDerPanel = new JPanel();
		JLabel lblNewLabel = new JLabel(usuario.getNombre());
		JLabel loginOutLbl = new JLabel("LoginOut");
		
		
		setSize(getMaximumSize());
		setLayout(new BorderLayout(0, 0));
		
		add(topMenu, BorderLayout.NORTH);
		topMenu.setLayout(new GridLayout(0, 2, 0, 0));
		
		fl_menuIzqpanel.setAlignment(FlowLayout.LEFT);
		menuIzqpanel.setBackground(Color.GRAY);
		topMenu.add(menuIzqpanel);
		
		menuIzqpanel.add(comboBox);
		
		menuDerPanel.setBackground(Color.GRAY);
		FlowLayout fl_menuDerPanel = (FlowLayout) menuDerPanel.getLayout();
		fl_menuDerPanel.setAlignment(FlowLayout.RIGHT);
		topMenu.add(menuDerPanel);
		
		lblNewLabel.setIcon(new ImageIcon("img\\Mekanografia.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		menuDerPanel.add(lblNewLabel);
		
		//Login out 
		menuDerPanel.add(loginOutLbl);
		
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		panelCentral.add(nivelStadisticas);
		
		textoPanel.setBounds(21, 0, 1609, 318);
		textoPanel.texto.setFont(new Font("Consolas", Font.PLAIN, 30));
		textoPanel.texto.setBounds(27, 0, 1603, 378);
		textoPanel.setBounds(278, 10, 1636, 378);
		textoPanel.setVisible(false);
		panelCentral.add(textoPanel);
		textoPanel.setLayout(null);
		
		teclado.setBounds(278, 502, 1636, 429);
		panelCentral.add(teclado);
		
		this.usuario = usuario;
		
		//Evento login out
		loginOutLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		
		//Eventos de btn de Niveles
		
		nivelStadisticas.facilBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(corriendo == false){
					textoPanel.setVisible(true);
					textoPanel.texto.setText(Ficheros.recibirTextoDeFicheros(Ficheros.textoFile, 0));
					texto = textoPanel.texto.getText();
				}
				
			}
		});
		nivelStadisticas.dificilBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(corriendo == false){
					textoPanel.setVisible(true);
					textoPanel.texto.setText(Ficheros.recibirTextoDeFicheros(Ficheros.textoFile, 1));
				}
			}
		});
		System.out.print(usuario.getNombre());
	}
}
