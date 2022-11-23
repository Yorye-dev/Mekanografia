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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import java.awt.Panel;
import javax.swing.JTextField;
import java.awt.Font;

public class PanelPrincipal extends JPanel  implements KeyListener {
	static boolean corriendo = false;
	Usuarios usuario;
	Timer cronometro;
	static String texto;
	private JTextField textoIntroducido;
	
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
		
		textoPanel.setBounds(278, 10, 1636, 378);
		textoPanel.setVisible(false);
	
		panelCentral.add(textoPanel);
		textoPanel.setLayout(null);
		
		teclado.setBounds(278, 502, 1636, 429);
		textoPanel.texto.requestFocus();
		addKeyListener(teclado);
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
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.print("a");
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
