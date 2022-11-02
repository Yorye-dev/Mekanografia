package gui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JProgressBar;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class CargaInicial extends JFrame {
	

	private JPanel panelCarga;

	/**
	 * Create the frame.
	 */
	
	public CargaInicial() {
		
		JProgressBar progressBar = new JProgressBar();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\Mekanografia.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true); //No se meustra el marco de Jframe
		setBounds(100, 100, 500, 300);
		
		
		panelCarga = new JPanel();
		panelCarga.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelCarga.setVisible(true);
		setContentPane(panelCarga);
		panelCarga.setLayout(null);
		
		//Image imgBack = Toolkit.getDefaultToolkit().createImage("img\\imgBack.png");
		JLabel background = null;
		panelCarga.setSize(720, 576);
		setResizable(true);
		ImageIcon imgBack = new ImageIcon("img\\Img_background.png");//
		background = new JLabel("", imgBack, JLabel.CENTER);
		background.setBounds(0,0,500,300);
		progressBar.setValue(48);
		progressBar.setForeground(Color.GRAY);
		progressBar.setFont(new Font("Consolas", Font.PLAIN, 11));
		progressBar.setStringPainted(true);
		progressBar.setMaximum(60);
		progressBar.setBounds(0, 283, 500, 17);
		
		
		panelCarga.add(progressBar);
		panelCarga.add(background);
		
		
		
		
	}
}
