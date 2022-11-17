package gui;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.JEditorPane;

public class PanelTextos extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelTextos() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JEditorPane texto = new JEditorPane();
		texto.setText("sadasdasd");
		add(texto);

	}

}
