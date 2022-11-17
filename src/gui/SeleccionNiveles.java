package gui;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SeleccionNiveles extends JPanel {

	/**
	 * Create the panel.
	 */
	public SeleccionNiveles() {
		setLayout(null);
		
		JLabel lblTiempo_1 = new JLabel("00:00");
		lblTiempo_1.setBounds(0, 44, 142, 38);
		lblTiempo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiempo_1.setFont(new Font("Consolas", Font.PLAIN, 24));
		add(lblTiempo_1);
		
		JLabel lblScore_2 = new JLabel("SCORE: ");
		lblScore_2.setBounds(10, 82, 52, 14);
		lblScore_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScore_2.setFont(new Font("Consolas", Font.PLAIN, 11));
		add(lblScore_2);
		
		JLabel lblScore_1_2 = new JLabel("0000");
		lblScore_1_2.setBounds(59, 82, 52, 14);
		lblScore_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblScore_1_2.setFont(new Font("Consolas", Font.PLAIN, 11));
		add(lblScore_1_2);
		
		JLabel lblScore_1_1_2 = new JLabel("VIDAS: ");
		lblScore_1_1_2.setBounds(10, 105, 52, 14);
		lblScore_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScore_1_1_2.setFont(new Font("Consolas", Font.PLAIN, 11));
		add(lblScore_1_1_2);
		
		JLabel lblScore_1_1_2_1 = new JLabel("VIDAS: ");
		lblScore_1_1_2_1.setBounds(59, 105, 52, 14);
		lblScore_1_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScore_1_1_2_1.setFont(new Font("Consolas", Font.PLAIN, 11));
		add(lblScore_1_1_2_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(22, 360, 89, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		btnNewButton_1_2.setBounds(22, 394, 89, 23);
		add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("New button");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setBounds(22, 326, 89, 23);
		add(btnNewButton_1_1_1);

	}
}
