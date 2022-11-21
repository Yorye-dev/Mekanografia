package gui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Pruebas extends JPanel {

	/**
	 * Create the panel.
	 */
	public Pruebas() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 102, 252);
		panel_1.add(panel_2);

	}
}
