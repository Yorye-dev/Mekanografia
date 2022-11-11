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
		
		JPanel teclado = new JPanel();
		teclado.setBackground(Color.PINK);
		centralPanel.add(teclado);
		teclado.setLayout(null);
		
		JButton qButton = new JButton("Q");
		qButton.setBounds(10, 11, 50, 50);
		teclado.add(qButton);
		
		JButton wButton = new JButton("W");
		wButton.setBounds(70, 11, 50, 50);
		teclado.add(wButton);
		
		JButton eButton = new JButton("E");
		eButton.setBounds(130, 11, 50, 50);
		teclado.add(eButton);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(190, 11, 50, 50);
		teclado.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(250, 11, 50, 50);
		teclado.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(310, 11, 50, 50);
		teclado.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(370, 11, 50, 50);
		teclado.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(10, 67, 50, 50);
		teclado.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(70, 67, 50, 50);
		teclado.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(130, 67, 50, 50);
		teclado.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setBounds(190, 67, 50, 50);
		teclado.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setBounds(250, 67, 50, 50);
		teclado.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("New button");
		btnNewButton_12.setBounds(310, 67, 50, 50);
		teclado.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("New button");
		btnNewButton_13.setBounds(370, 67, 50, 50);
		teclado.add(btnNewButton_13);
		
		
	}
}
