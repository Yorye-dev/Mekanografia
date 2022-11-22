package gui;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.JEditorPane;
import java.awt.Font;

public class PanelTextos extends JPanel  {
	public JEditorPane texto;
	

/*	public JEditorPane getTexto() {
		return texto;
	}


	public void setTexto(JEditorPane texto) {
		this.texto = texto;
	}
*/

	public PanelTextos() {
		
		texto = new JEditorPane();
		setLayout(new GridLayout(1, 0, 0, 0));
		texto.setFont(new Font("Consolas", Font.PLAIN, 11));
		texto.setEditable(false);
		add(texto);
		//this.texto = texto;
	}


}
