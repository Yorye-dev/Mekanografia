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
		setSize(268, 1026);
		setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panelInfo = new JPanel();
		add(panelInfo);
		panelInfo.setLayout(null);
		
		JLabel tiempLbl = new JLabel("00:00");
		tiempLbl.setFont(new Font("Dialog", Font.BOLD, 35));
		tiempLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tiempLbl.setBounds(12, 12, 244, 27);
		//tiempLb.setFont(new Font("Consolas", Font.PLAIN, 32));
		panelInfo.add(tiempLbl);
		
		JLabel vidasLbl = new JLabel("New label");
		vidasLbl.setBounds(12, 78, 60, 17);
		panelInfo.add(vidasLbl);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(12, 128, 60, 17);
		panelInfo.add(lblNewLabel_1);
		
		JPanel panelNiveles = new JPanel();
		add(panelNiveles);

	}
}
