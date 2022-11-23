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
import javax.swing.ImageIcon;

public class SeleccionNiveles extends JPanel {
	public static  int corriendo;
	JButton dificilBtn		;
	JButton facilBtn		;
	JButton estadisticasBtn ;
	JButton reintentarBtn	;
	JLabel numVidasLbl 		;
	JLabel tiempLbl 		;
	
 SeleccionNiveles(int anchi, int alto) {
		setSize(268, 1015);
		setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panelInfo = new JPanel();
		add(panelInfo);
		panelInfo.setLayout(null);
		
		tiempLbl = new JLabel("00:00");
		tiempLbl.setFont(new Font("Consolas", Font.BOLD, 35));
		tiempLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tiempLbl.setBounds(12, 47, 244, 47);
		//tiempLb.setFont(new Font("Consolas", Font.PLAIN, 32));
		panelInfo.add(tiempLbl);
		
		JLabel vidasLbl = new JLabel("Vidas:");
		vidasLbl.setHorizontalAlignment(SwingConstants.CENTER);
		vidasLbl.setFont(new Font("Consolas", Font.PLAIN, 24));
		vidasLbl.setBounds(12, 214, 122, 39);
		panelInfo.add(vidasLbl);
		
		JLabel ppmLbl = new JLabel("PPM:");
		ppmLbl.setHorizontalAlignment(SwingConstants.CENTER);
		ppmLbl.setFont(new Font("Consolas", Font.PLAIN, 24));
		ppmLbl.setBounds(12, 280, 122, 39);
		panelInfo.add(ppmLbl);
		
		JLabel tiempoTituloLbl = new JLabel("Tiempo");
		tiempoTituloLbl.setBackground(Color.WHITE);
		tiempoTituloLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tiempoTituloLbl.setFont(new Font("Consolas", Font.PLAIN, 34));
		tiempoTituloLbl.setBounds(10, 11, 244, 39);
		panelInfo.add(tiempoTituloLbl);
		
		numVidasLbl = new JLabel("");
		numVidasLbl.setHorizontalAlignment(SwingConstants.LEFT);
		numVidasLbl.setFont(new Font("Consolas", Font.PLAIN, 24));
		numVidasLbl.setBounds(134, 214, 122, 39);
		panelInfo.add(numVidasLbl);
		
		JLabel vidasLbl_1_1 = new JLabel("--");
		vidasLbl_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		vidasLbl_1_1.setFont(new Font("Consolas", Font.PLAIN, 24));
		vidasLbl_1_1.setBounds(134, 280, 122, 39);
		panelInfo.add(vidasLbl_1_1);
		
		JButton reintentarBtn = new JButton("Reintentar");
		reintentarBtn.setEnabled(false);
		reintentarBtn.setBounds(76, 392, 89, 23);
		panelInfo.add(reintentarBtn);
		
		JPanel panelNiveles = new JPanel();
		add(panelNiveles);
		panelNiveles.setLayout(null);
		
		JButton facilBtn = new JButton("Facil");
		facilBtn.setFont(new Font("Consolas", Font.PLAIN, 11));
		facilBtn.setBounds(74, 65, 105, 23);
		panelNiveles.add(facilBtn);
		
		JButton dificilBtn = new JButton("Dificil");
		dificilBtn.setFont(new Font("Consolas", Font.PLAIN, 11));
		dificilBtn.setBounds(74, 99, 105, 23);
		panelNiveles.add(dificilBtn);
		
		JButton estadisticasBtn = new JButton("Estadisticas");
		estadisticasBtn.setFont(new Font("Consolas", Font.PLAIN, 11));
		estadisticasBtn.setBounds(62, 186, 134, 23);
		panelNiveles.add(estadisticasBtn);
		
		JLabel nivelTitulo = new JLabel("Niveles");
		nivelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		nivelTitulo.setFont(new Font("Consolas", Font.PLAIN, 34));
		nivelTitulo.setBackground(Color.WHITE);
		nivelTitulo.setBounds(10, 11, 244, 39);
		panelNiveles.add(nivelTitulo);
		
		this.dificilBtn = dificilBtn;
		this.facilBtn = facilBtn;
		this.estadisticasBtn = estadisticasBtn;
		this.reintentarBtn = reintentarBtn;
		
		

	}
}
