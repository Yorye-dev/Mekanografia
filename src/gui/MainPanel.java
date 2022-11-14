package gui;

import javax.swing.JPanel;

import principal.Principal;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainPanel extends JPanel {
	private JTextField txtTexto;

	public MainPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel cabeceraPanel = new JPanel();
		cabeceraPanel.setBackground(Color.ORANGE);
		add(cabeceraPanel, BorderLayout.NORTH);
		
		JPanel menuIzqPanel = new JPanel();
		menuIzqPanel.setBackground(Color.GREEN);
		add(menuIzqPanel, BorderLayout.WEST);
		//menuIzqPanel.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel menuDerPanel = new JPanel();
		menuDerPanel.setBackground(Color.MAGENTA);
		add(menuDerPanel , BorderLayout.EAST);
		
		JPanel centralPanel = new JPanel();
		centralPanel.setBackground(Color.DARK_GRAY);
		add(centralPanel, BorderLayout.CENTER);
		centralPanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel textoPanel = new JPanel();
		textoPanel.setBackground(Color.BLACK);
		centralPanel.add(textoPanel);
		textoPanel.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setText("Texto..");
		txtTexto.setHorizontalAlignment(SwingConstants.LEFT);
		txtTexto.setFont(new Font("Consolas", Font.PLAIN, 11));
		txtTexto.setBounds(10, 11,410, 50);
		txtTexto.setColumns(10);
		txtTexto.setVisible(true);
		textoPanel.add(txtTexto);
		
		Teclado teclado = new Teclado();
		centralPanel.add(teclado);
		
		
	}
}
