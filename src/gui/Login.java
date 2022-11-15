package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JPanel {
	public JTextField usuarioField;
	public JPasswordField passwordField;
	/*public 	boolean estado;
	
	
	public boolean isEstado() {
		return estado;
	}




	public void setEstado(boolean estado) {
		this.estado = estado;
	}

*/


	public Login() {
		setLayout(null);
		
		usuarioField = new JTextField();
		usuarioField.setBounds(233, 123, 101, 20);
		add(usuarioField);
		usuarioField.setColumns(10);
		
		JLabel usuarioLabel = new JLabel("Usuario:");
		usuarioLabel.setBounds(102, 126, 76, 14);
		add(usuarioLabel);
		
		JLabel passwordLabel = new JLabel("Contraseña:");
		passwordLabel.setBounds(102, 164, 101, 20);
		add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('#');
		passwordField.setBounds(233, 164, 101, 20);
		add(passwordField);
		
		JLabel Titlelbl = new JLabel("Inicio de sesión");
		Titlelbl.setFont(new Font("Consolas", Font.PLAIN, 32));
		Titlelbl.setHorizontalAlignment(SwingConstants.CENTER);
		Titlelbl.setIcon(new ImageIcon("img\\Mekanografia.png"));
		Titlelbl.setBounds(42, 44, 369, 39);
		add(Titlelbl);
		
		
	
		
	}
}
