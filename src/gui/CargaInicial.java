package gui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JProgressBar;
import javax.swing.Timer;


/*
 * Jaime
 * 
 * Calse accederFile(){
 * 
 * private ArrayList<Usuario> listaUsuario;
 * 
 * public accederFile() private ArrayList<Usuario> listaUsuario){
 * 	this.listaUsuarios = listaUsuarios;
 * }
 * 
 * accederFicheros(){
 * 
 * listaUsuarios.add(neew Usuario (String.split(";")[0], String.split(";")[1], String.split(";")[2]));
 * }
 * 
 * }
 * 
 * */

import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;

import logic.Ficheros;

public class CargaInicial extends JFrame {
	Timer timer;
	
	private JPanel panelCarga;
	
	public CargaInicial() {
		
		panelCarga = new JPanel();	//Jpanel de carga, el cual tiene una progressBar y una "img de fondo (jlabel)" del mismo tamaño que el jpanel 500*300
		
		ImageIcon imgBack = new ImageIcon("img/Img_background.png");//Imagen del icono
		JLabel background = null;
		background = new JLabel("", imgBack, JLabel.CENTER);
		JProgressBar progressBar = new JProgressBar();
		timer = new Timer (60, new ActionListener() {
			public void actionPerformed(ActionEvent e)
		    {
		    	if (progressBar.getValue() < progressBar.getMaximum()) {
		    		progressBar.setValue(progressBar.getValue()+1);
		    		if (progressBar.getValue() == 80){
		    			if (Ficheros.comprobarFicheros(Ficheros.estadisticasFile, Ficheros.textoFile, Ficheros.usuariosFile) == false) {
		    				System.exit(ABORT);
		    			}
		    		}
				}else if(progressBar.getValue() == progressBar.getMaximum()){
					
					panelCarga.setVisible(false);
					Login login = new Login();
					JButton loginButton = new JButton("Login");
					login.add(loginButton);
					
					loginButton.setBounds(171, 209, 89, 23);
					loginButton.setVisible(true);

					login.setVisible(true);  //Panel principal, donde se va cargar todo el programa
					dispose(); //Se limpia el Jframe
					setUndecorated(false); 
					setVisible(true);
					setContentPane(login);
					
					loginButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							setVisible(false);
							MainPanel panelPrincipal = new MainPanel();
							login.setVisible(false);
							setContentPane(panelPrincipal);
							panelPrincipal.setVisible(true);
							dispose();
							setSize(getMaximumSize());
							setLocationRelativeTo(null);
							setVisible(true);
						}
					});
					
					
					
					timer.stop();
				}
		     }
		});
		
		//Definición del Jframe (el tamaño "500*300", icono y centrado)
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/Mekanografia.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true); //No se meustra el marco de Jframe
		setBounds(100, 100, 500, 300);
		setTitle("Mekanografia");
		
		//Definicion del Jpanel 
		panelCarga.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelCarga.setVisible(true);
		setContentPane(panelCarga);
		panelCarga.setLayout(null);
		panelCarga.setSize(720, 576);
		setResizable(true);
		
		//inicion del JLabel, con un tamaño igual que el jframe
		background.setBounds(0,0,500,300);
		
		//Definicion de la progressbar, con un tamaño máximo de 60, su posiciñon y fuente
		progressBar.setValue(0);
		progressBar.setForeground(Color.GRAY);
		progressBar.setFont(new Font("Consolas", Font.PLAIN, 11));
		progressBar.setStringPainted(true);
		progressBar.setMaximum(100);
		progressBar.setBounds(0, 283, 500, 17);
		
		panelCarga.add(progressBar);
		panelCarga.add(background);
		
		//inicio del contador
		timer.start();
	}
}
