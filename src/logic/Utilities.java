package logic;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Utilities {
	

	
	//Retorna la posición en int de la teclas que has pulsado
	public static int teclaPulsada(char letraPulsada, JButton array[]) {
		String letrasPulsadaString = String.valueOf(letraPulsada);
		for( int x = 0; x < array.length; x ++) {
			if(letrasPulsadaString.toUpperCase().equals(array[x].getText())) {
				return x;
				}
			} 
		return array.length-1; 
		} 
	
	public static int letraEnLaarray(String texto, JButton array[], int posición) {
		String letraDeLaString = String.valueOf(texto.charAt(posición));
		for( int i = 0; i < array.length; i ++) {
			if(letraDeLaString.toUpperCase().equals(array[i].getText())) {
				return i;
			}
		}
		return texto.length();
		
	}
}


