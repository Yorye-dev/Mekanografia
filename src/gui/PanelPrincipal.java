package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class PanelPrincipal extends JPanel {
	SeleccionNiveles nivelEStadisticas;
	boolean corriendo;
	String texto;
	
	public PanelPrincipal() {
		setSize(getMaximumSize());
		
		setBackground(new Color(102, 0, 51));
		setLayout(null);
		
		//Crear la estancia de selector de niveles y tambien las estadísticas.
		
		nivelEStadisticas = new SeleccionNiveles();
		nivelEStadisticas.setBounds(10, 11, 268, 1026);
		add(nivelEStadisticas);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 255, 255));
		panel_1.setBounds(290, 11, 123, 45);
		add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(290, 386, 753, 236);
		add(panel_1_1);
	}
}
