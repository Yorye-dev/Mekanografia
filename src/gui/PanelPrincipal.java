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
import javax.swing.text.Utilities;

import logic.Ficheros;
import logic.Usuarios;

import javax.swing.ImageIcon;
import javax.swing.JButton;

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

public class PanelPrincipal extends JPanel{
	private int posicionString;
	private int teclaPulsada;
	private int vidas;
	static boolean corriendo = false;
	Usuarios usuario;
	Timer cronometro;
	static String texto;
	private JTextField textoIntroducido;
	private JTextField textField;
	
	//Botnoes del teclado
	JButton qBtn 		=	new JButton("Q");
	JButton wBtn 		= 	new JButton("W");
	JButton eBtn 		= 	new JButton("E");
	JButton rBtn 		= 	new JButton("R");
	JButton tBtn 		= 	new JButton("T");
	JButton yBtn 		= 	new JButton("Y");
	JButton uBtn 		= 	new JButton("U");
	JButton iBtn 		= 	new JButton("I");
	JButton oBtn 		= 	new JButton("O");
	JButton pBtn 		=	new JButton("P");
	JButton aBtn 		= 	new JButton("A");
	JButton sBtn 		= 	new JButton("S");
	JButton dBtn		=	new JButton("D");
	JButton fBtn 		= 	new JButton("F");
	JButton gBtn 		=	new JButton("G");
	JButton hBtn 		= 	new JButton("H");
	JButton jBtn	 	= 	new JButton("J");
	JButton kBtn		= 	new JButton("K");
	JButton lBtn 		= 	new JButton("L");
	JButton ñBtn	  	= 	new JButton("Ñ");
	JButton zBtn 		= 	new JButton("Z");
	JButton xBtn 		=	new JButton("X");
	JButton cBtn 		= 	new JButton("C");
	JButton vBtn 		= 	new JButton("V");
	JButton bBtn 		= 	new JButton("B");
	JButton nBtn		= 	new JButton("N");
	JButton mBtn 		= 	new JButton("M");
	JButton comaBtn		= 	new JButton(",");
	JButton puntoBtn	=	new JButton(".");	
	JButton ÇBtn		=	new JButton("Ç");
	JButton spacioBtn	= 	new JButton(" ");
	JButton botones[] = {qBtn, wBtn, eBtn, rBtn, tBtn, yBtn, uBtn, iBtn, oBtn, pBtn, aBtn, sBtn, dBtn, fBtn, gBtn, hBtn, jBtn, kBtn, lBtn, ñBtn, zBtn, xBtn ,cBtn, vBtn, bBtn, nBtn, mBtn, ÇBtn, comaBtn, puntoBtn, spacioBtn};
	
	
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
		Teclado teclado = new Teclado(botones);
		PanelTextos textoPanel = new PanelTextos();
		
		SeleccionNiveles nivelStadisticas = new SeleccionNiveles(268, 1015);
		
		
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
		
		
		panelCentral.add(teclado);
		
		this.usuario = usuario;
		
		//textoPanel.texto.addKeyListener(textoPanel);
		
		
		//Evento login out
		loginOutLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		
		//Eventos de btn de Niveles
		//Facil
		nivelStadisticas.facilBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(corriendo == false){
					textoPanel.setVisible(true);
					vidas = 5;
					nivelStadisticas.numVidasLbl.setText(String.valueOf(vidas));
					textoPanel.texto.setText(Ficheros.recibirTextoDeFicheros(Ficheros.textoFile, 0));
					textoPanel.texto.requestFocus();
					texto = textoPanel.texto.getText();
					//alogic.Utilities.recorrerCadena(textoPanel.texto.getText(), botones);
					posicionString = 0;
				}
				
			}
		});
		//Dificil
		nivelStadisticas.dificilBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(corriendo == false){
					textoPanel.setVisible(true);
					vidas = 5;
					nivelStadisticas.numVidasLbl.setText(String.valueOf(vidas));
					textoPanel.texto.setText(Ficheros.recibirTextoDeFicheros(Ficheros.textoFile, 1));
					textoPanel.texto.requestFocus();
					//logic.Utilities.recorrerCadena(textoPanel.texto.getText(), botones);
					posicionString = 0;
				}
			}
		});
	
		textoPanel.texto.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				botones[teclaPulsada].setBackground(Color.white);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				teclaPulsada = logic.Utilities.teclaPulsada(e.getKeyChar(), botones);
				if(teclaPulsada== logic.Utilities.letraEnLaarray(texto,botones,posicionString)) {
					botones[teclaPulsada].setBackground(Color.green);
				}else {
					botones[teclaPulsada].setBackground(Color.red);
					vidas--;
					nivelStadisticas.numVidasLbl.setText(String.valueOf(vidas));
				}
				logic.Utilities.letraEnLaarray(texto,botones,posicionString);
				posicionString ++;
				//System.out.print(e.getKeyChar());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
