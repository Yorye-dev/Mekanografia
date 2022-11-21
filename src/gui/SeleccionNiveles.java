package gui;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SeleccionNiveles extends JPanel {

	/**
	 * Create the panel.
	 */
	public SeleccionNiveles(int anchi, int alto) {
		setSize(268, 1015);
		setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panelInfo = new JPanel();
		add(panelInfo);
		panelInfo.setLayout(null);
		
		JLabel tiempLbl = new JLabel("00:00");
		tiempLbl.setFont(new Font("Consolas", Font.BOLD, 35));
		tiempLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tiempLbl.setBounds(12, 47, 244, 47);
		//tiempLb.setFont(new Font("Consolas", Font.PLAIN, 32));
		panelInfo.add(tiempLbl);
		
		JLabel vidasLbl = new JLabel("Vidas:");
		vidasLbl.setHorizontalAlignment(SwingConstants.CENTER);
		vidasLbl.setFont(new Font("Consolas", Font.PLAIN, 24));
		vidasLbl.setBounds(12, 135, 122, 39);
		panelInfo.add(vidasLbl);
		
		JLabel ppmLbl = new JLabel("PPM:");
		ppmLbl.setHorizontalAlignment(SwingConstants.CENTER);
		ppmLbl.setFont(new Font("Consolas", Font.PLAIN, 24));
		ppmLbl.setBounds(12, 185, 122, 39);
		panelInfo.add(ppmLbl);
		
		JLabel tiempoTituloLbl = new JLabel("Tiempo");
		tiempoTituloLbl.setBackground(Color.WHITE);
		tiempoTituloLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tiempoTituloLbl.setFont(new Font("Consolas", Font.PLAIN, 34));
		tiempoTituloLbl.setBounds(10, 11, 244, 39);
		panelInfo.add(tiempoTituloLbl);
		
		JLabel numVidasLbl = new JLabel("4");
		numVidasLbl.setHorizontalAlignment(SwingConstants.LEFT);
		numVidasLbl.setFont(new Font("Consolas", Font.PLAIN, 24));
		numVidasLbl.setBounds(134, 135, 122, 39);
		panelInfo.add(numVidasLbl);
		
		JLabel vidasLbl_1_1 = new JLabel("--");
		vidasLbl_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		vidasLbl_1_1.setFont(new Font("Consolas", Font.PLAIN, 24));
		vidasLbl_1_1.setBounds(134, 185, 122, 39);
		panelInfo.add(vidasLbl_1_1);
		
		JButton reintentarBtn = new JButton("Reintentar");
		reintentarBtn.setEnabled(false);
		reintentarBtn.setBounds(84, 236, 89, 23);
		panelInfo.add(reintentarBtn);
		
		JPanel panelNiveles = new JPanel();
		add(panelNiveles);
		panelNiveles.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(84, 11, 89, 23);
		panelNiveles.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(84, 45, 89, 23);
		panelNiveles.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(84, 79, 89, 23);
		panelNiveles.add(btnNewButton_1_1);

	}
}
