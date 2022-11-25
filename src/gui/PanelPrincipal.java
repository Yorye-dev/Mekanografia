package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.text.BadLocationException;
import javax.swing.text.Highlighter;
import javax.swing.text.Utilities;

import logic.Ficheros;
import logic.Usuarios;

import javax.naming.directory.AttributeModificationException;
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
	
	
	
	JLabel loginOutLbl;
	private String difivultad;
	private int posicionString;
	private int teclaPulsada;
	private int vidas;
	private int pulsacionesPorMin;
	private int contadorPulsaciones;
	private int tiempo;
	static boolean corriendo = false;
	Usuarios usuario;
	Timer cronometro;
	static String texto;
	private JTextField textoIntroducido;
	private JTextField textField;
	
	SeleccionNiveles nivelStadisticas;
	PanelTextos textoPanel;
	
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
	JButton botnoesNoAdmitidos	= 	new JButton(" ");
	JButton botones[] = {qBtn, wBtn, eBtn, rBtn, tBtn, yBtn, uBtn, iBtn, oBtn, pBtn, aBtn, sBtn, dBtn, fBtn, gBtn, hBtn, jBtn, kBtn, lBtn, ñBtn, zBtn, xBtn ,cBtn, vBtn, bBtn, nBtn, mBtn, ÇBtn, comaBtn, puntoBtn, spacioBtn, botnoesNoAdmitidos};
	
	
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
		textoPanel = new PanelTextos();
		textoPanel.texto.setBounds(0, 0, 1630, 378);
		
		nivelStadisticas = new SeleccionNiveles(268, 1015);
		nivelStadisticas.setBounds(0, 0, 248, 1015);
		
		
		FlowLayout fl_menuIzqpanel = (FlowLayout) menuIzqpanel.getLayout();
		JComboBox comboBox = new JComboBox();
		JPanel menuDerPanel = new JPanel();
		JLabel lblNewLabel = new JLabel(usuario.getNombre());
		loginOutLbl = new JLabel("LoginOut");
		
		
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
		
		teclado.setBounds(267, 501, 1640, 429);
		
		
		panelCentral.add(teclado);
		Highlighter subrayador = textoPanel.texto.getHighlighter();
		
		this.usuario = usuario;
		
		//textoPanel.texto.addKeyListener(textoPanel);
		
		
		//Evento login out
		
		
		//Eventos de btn de Niveles
		//Facil
		nivelStadisticas.facilBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(corriendo == false){
					textoPanel.setVisible(true);
					tiempo = 60;
					vidas = 5;
					nivelStadisticas.numVidasLbl.setText(String.valueOf(vidas));
					nivelStadisticas.tiempLbl.setText(String.valueOf(tiempo)+"ms");
					textoPanel.texto.setText(Ficheros.recibirTextoDeFicheros(Ficheros.textoFile, 0));
					textoPanel.texto.requestFocus();
					texto = textoPanel.texto.getText();
					contadorPulsaciones = 0;
					posicionString = 0;
					cronometro = new Timer(1000, new ActionListener() {
						
						//Mision del timer
						
						@Override
						public void actionPerformed(ActionEvent x) {
							tiempo --;
							nivelStadisticas.tiempLbl.setText(String.valueOf(tiempo)+"ms");
							if (tiempo == 0) {
								JOptionPane.showMessageDialog(null, "Se necesita practicar... El mundo digital te necesita", "ERROR", 0);
								reset();
								}
							}
						});
					}
				}
			});
		
		//Dificil
		nivelStadisticas.dificilBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(corriendo == false){
					textoPanel.setVisible(true);
					tiempo =180;
					vidas = 3;
					nivelStadisticas.numVidasLbl.setText(String.valueOf(vidas));
					nivelStadisticas.tiempLbl.setText(String.valueOf(tiempo)+"ms");
					textoPanel.texto.setText(Ficheros.recibirTextoDeFicheros(Ficheros.textoFile, 1));
					textoPanel.texto.requestFocus();
					texto = textoPanel.texto.getText();
					contadorPulsaciones = 0;
					posicionString = 0;
					cronometro = new Timer(1000, new ActionListener() {
						//Mision del timer
						@Override
						public void actionPerformed(ActionEvent x) {	
							tiempo --;
							nivelStadisticas.tiempLbl.setText(String.valueOf(tiempo)+"ms");
							if (tiempo == 0) {
								JOptionPane.showMessageDialog(null, "Se necesita practicar... El mundo digital te necesita", "ERROR", 0);
								reset();
								}
							}
						});
				}
			}
		});
		//Se agregan los eventos
		textoPanel.texto.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				botones[teclaPulsada].setBackground(Color.white);
				if (vidas == 0){
					JOptionPane.showMessageDialog(null, "Se necesita practicar... El mundo digital te necesita", "ERROR", 0);
					reset();
				}else if ( posicionString == texto.length()){
					pulsacionesPorMin = contadorPulsaciones*tiempo/60;
					nivelStadisticas.pulsacionesPorminuto.setText(String.valueOf(pulsacionesPorMin));
					reset();
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				botones[teclaPulsada].setBackground(Color.white);
				teclaPulsada = logic.Utilities.teclaPulsada(e.getKeyChar(), botones);
				if (teclaPulsada == logic.Utilities.letraEnLaarray(texto,botones,0) && corriendo == false){
					//primeraPulsación = true;
					corriendo = true;
					nivelStadisticas.facilBtn.setEnabled(false);
					nivelStadisticas.dificilBtn.setEnabled(false);
					botones[teclaPulsada].setBackground(Color.green);
					cronometro.start();
					contadorPulsaciones ++;
					try {
						subrayador.addHighlight(posicionString, posicionString +1, Rotuladores.rotuVerde);
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(corriendo == true && vidas > 0 && posicionString < texto.length()) {
					if(teclaPulsada == logic.Utilities.letraEnLaarray(texto,botones,posicionString)) {
						
						try {
							botones[teclaPulsada].setBackground(Color.green);	
							subrayador.addHighlight(posicionString, posicionString +1, Rotuladores.rotuVerde);
							//if (posicionString == texto.length()) {
//Para no auemntar el contador, ya que el número máximo de posición tiene que ser el tamaño de la cadena de texto -1 por el fin de cadena
						//	}else {
							posicionString ++;
						//	}
							contadorPulsaciones ++;
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(teclaPulsada == botones.length-1) {
						System.out.print("Caracter no válido");
					}else{
						try {
							botones[teclaPulsada].setBackground(Color.red);
							subrayador.addHighlight(posicionString, posicionString +1, Rotuladores.rotuRojo);
							vidas--;
							nivelStadisticas.numVidasLbl.setText(String.valueOf(vidas));
							//if (posicionString == texto.length()) {
								
							//}else {
								posicionString ++;
								contadorPulsaciones ++;
							//}
							
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
							}
						}
					}	
					//logic.Utilities.letraEnLaarray(texto,botones,posicionString);
				
				System.out.println(texto.length());
				System.out.println(posicionString);
				System.out.println("...........");
				
			}
		});
	}
	
	void reset() {
		corriendo = false;
		posicionString = 0;
		tiempo = 0;
		nivelStadisticas.facilBtn.setEnabled(true);
		nivelStadisticas.dificilBtn.setEnabled(true);
		textoPanel.texto.setText(null);
		cronometro.stop();
	}
}
