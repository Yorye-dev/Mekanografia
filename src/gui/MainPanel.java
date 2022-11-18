package gui;

import javax.swing.JPanel;

import principal.Principal;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import logic.Texto;

public class MainPanel extends JPanel implements KeyListener {
	
	private JTextField txtTexto;
	boolean Correindo;
	Timer cronometro;
	int puntuacion;
	int ppm;
	int fallos;
	private final int MAXFALLOSFACIL = 5;
	private final int MAXFALLOSDIFICIL = 3;
	String textoComp;
	int i =-1;
	PanelTextos textoPanel;
	
	public void KeyPressed() {
		
	}

	public MainPanel( JFrame frame) {
		
		setLayout(new BorderLayout(0, 0));
		
		JPanel cabeceraPanel = new JPanel();
		//Top nav menu
		cabeceraPanel.setBackground(Color.ORANGE);
		add(cabeceraPanel, BorderLayout.NORTH);
		
		JPanel menuIzqPanel = new JPanel();
		menuIzqPanel.setBackground(Color.GREEN);
		add(menuIzqPanel, BorderLayout.WEST);
		//menuIzqPanel.setSize(134,getWidth());
		menuIzqPanel.setLayout(new GridLayout(0, 1, 0, 0));
		//menuIzqPanel.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel menuDerPanel = new JPanel();
		menuDerPanel.setBackground(Color.MAGENTA);
		add(menuDerPanel , BorderLayout.EAST);
		
		JPanel centralPanel = new JPanel();
		centralPanel.setBackground(Color.DARK_GRAY);
		add(centralPanel, BorderLayout.CENTER);
		centralPanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		PanelTextos textoPanel = new PanelTextos();
		
		textoComp =textoPanel.texto.getText();
		System.out.print(" "+textoComp);
		/*textoPanel.setBackground(Color.BLACK);
		centralPanel.add(textoPanel);
		textoPanel.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setText("Texto..");
		txtTexto.setHorizontalAlignment(SwingConstants.LEFT);
		txtTexto.setFont(new Font("Consolas", Font.PLAIN, 11));
		txtTexto.setBounds(10, 11,410, 50);
		txtTexto.setColumns(10);
		txtTexto.setVisible(true);
		textoPanel.add(txtTexto);*/
		
		Teclado teclado = new Teclado();
		
		
		SeleccionNiveles menuIzq = new SeleccionNiveles();
		menuIzqPanel.add(menuIzq);
		centralPanel.add(textoPanel);
		centralPanel.add(teclado);
		
		addKeyListener(this);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.print(e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
