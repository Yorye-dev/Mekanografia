package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import principal.Principal;

import java.awt.BorderLayout;
import java.awt.Color;

public class mainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public mainPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		add(panel_3, BorderLayout.CENTER);
		

	}

}
