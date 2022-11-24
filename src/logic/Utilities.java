package logic;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Utilities {
	
	public static  boolean compararaValores(JButton boton, JTextPane panelTexto, int contador,int primeraTecla) {
		//char valorBotn = boton.get
		return false;
	}
	
	public static void recorrerCadena(String texto, JButton array[]) {
		for(int i = 0 ; i < texto.length(); i ++) {
			for( int x = 0; x < array.length; x ++) {
				String letrasTexto =String.valueOf(texto.charAt(i));
				if (letrasTexto.equals(array[x].getText()) ) {
					System.out.println(x);
				}
			}
		}
		
	}
	
	//Retorna la posición en int de la teclas que has pulsado
	public static int teclaPulsada(char letraPulsada, JButton array[]) {
		String letrasPulsadaString = String.valueOf(letraPulsada);
		for( int x = 0; x < array.length; x ++) {
			if(letrasPulsadaString.toUpperCase().equals(array[x].getText())) {
				System.out.println(x);	
				return x;
			}
		}
		return -1;
		
	}
	
	public static int letraEnLaarray(String texto, JButton array[], int posición) {
		String letraDeLaString = String.valueOf(texto.charAt(posición));
		for( int i = 0; i < array.length; i ++) {
			if(letraDeLaString.toUpperCase().equals(array[i].getText())) {
				System.out.println(i);	
				return i;
			}
		}
		return -1;
		
	}
}


