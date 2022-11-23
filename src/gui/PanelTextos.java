package gui;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JEditorPane;
import java.awt.Font;

public class PanelTextos extends JPanel implements KeyListener  {
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
		texto.setFont(new Font("Consolas", Font.PLAIN, 30));
		texto.setBounds(27, 0, 1603, 378);
		texto.setEditable(false);
		add(texto);
	
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.print("a");
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
