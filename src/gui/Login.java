package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Login extends JPanel {
	private JTextField usuarioField;
	private JPasswordField passwordField;
	
	public Login() {
		setLayout(null);
		
		usuarioField = new JTextField();
		usuarioField.setBounds(233, 76, 86, 20);
		add(usuarioField);
		usuarioField.setColumns(10);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(172, 186, 89, 23);
		add(loginButton);
		
		JLabel usuarioLabel = new JLabel("Usuario:");
		usuarioLabel.setBounds(131, 79, 46, 14);
		add(usuarioLabel);
		
		JLabel passwordLabel = new JLabel("Contraseña:");
		passwordLabel.setBounds(131, 123, 46, 14);
		add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(233, 123, 86, 20);
		add(passwordField);
		
	}
}
