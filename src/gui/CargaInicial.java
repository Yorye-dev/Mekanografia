package gui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JProgressBar;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;

import logic.Ficheros;
import logic.Usuarios;

public class CargaInicial extends JFrame {
	Timer timer;
	ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
	JFrame frame = this;
	
	
	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	private JPanel panelCarga;
	
	public CargaInicial() {
		
		panelCarga = new JPanel();	//Jpanel de carga, el cual tiene una progressBar y una "img de fondo (jlabel)" del mismo tamaño que el jpanel 500*300
		
		ImageIcon imgBack = new ImageIcon("img\\Img_background.png");//Imagen del icono
		JLabel background = null;
		background = new JLabel("", imgBack, JLabel.CENTER);
		JProgressBar progressBar = new JProgressBar();
		timer = new Timer (60, new ActionListener() {
			public void actionPerformed(ActionEvent e){
		    	if (progressBar.getValue() < progressBar.getMaximum()) {
		    		progressBar.setValue(progressBar.getValue()+1);
		    		if (progressBar.getValue() == 80 && Ficheros.comprobarFicheros(Ficheros.estadisticasFile, Ficheros.textoFile, Ficheros.usuariosFile) == false){ //compara ficheros al 80% y muestra un mensaje de error
		    			System.exit(ABORT);
		    			}
				}else if(progressBar.getValue() == progressBar.getMaximum()){
					
					//Todo correcto se inica el login
					panelCarga.setVisible(false);
					Login login = new Login();
					

					setVisible(true);//Panel principal, donde se va cargar todo el programa
					dispose(); //Se limpia el Jframe
					setUndecorated(false); 
					setVisible(true);
					setResizable(false);
					setContentPane(login);
				
					//Comprobación del logind
					login.getBotonLogin().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							//Comprobar que el login sea correcto.
							int usrSelec = logic.Ficheros.comproCampos(login.usuarioField.getText(), String.valueOf(login.passwordField.getPassword()), listaUsuarios); //Retorna un entero, que dice que posicion de arrat a inicado sesion
							if(usrSelec < listaUsuarios.size()){
							setVisible(false);
							dispose();
							setExtendedState(JFrame.MAXIMIZED_BOTH);
							setSize(getMaximumSize());
							setLocationRelativeTo(null);
							setVisible(true);
							PanelPrincipal panelPrincipal = new PanelPrincipal(listaUsuarios.get(usrSelec));
							login.setVisible(false);
							setContentPane(panelPrincipal);
							panelPrincipal.setVisible(true);
							}
						}
					});
					timer.stop();
				}
		     }
		});
		
		//Definición del Jframe (el tamaño "500*300", icono y centrado)
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\Mekanografia.png"));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//Preguntar cerrar programa
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int salir = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "Close", JOptionPane.YES_NO_OPTION);	
				if (salir == JOptionPane.YES_OPTION) {
					System.exit(ABORT);
				}
			}
		});
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
		
		//Llena la array de usaurios, con todos sus get 
		logic.Ficheros.recibirUsuarios(logic.Ficheros.usuariosFile, listaUsuarios);
	}
}
