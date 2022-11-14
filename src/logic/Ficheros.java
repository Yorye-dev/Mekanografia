package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ficheros {
	static public File 	estadisticasFile	=	new File("bbdd/estadisticas.txt");
	static public File	textoFile		 	= 	new File("bbdd/texto.txt");
	static public File 	usuariosFile		= 	new File("bbdd/usuarios.txt");
	
	
	static public boolean comprobarFicheros(File fichero1, File fichero2, File fichero3) {
		boolean existeFichero = true;
			
		if(fichero1.exists() && fichero2.exists() && fichero3.exists()) {
			existeFichero = true;
			
		}else if(fichero1.exists()==false){
			JOptionPane.showMessageDialog(null, "Falta el fichero estadísticas", "ERROR", 0);
			existeFichero=false;
		}else if(fichero2.exists()==false){
			JOptionPane.showMessageDialog(null, "Falta el fichero texto", "ERROR", 0);
			existeFichero=false;
		}else if(fichero3.exists()==false){
			JOptionPane.showMessageDialog(null, "Falta el fichero usuario", "ERROR", 0);
			existeFichero=false;
		}
		return existeFichero;
	}
	
	public static void recibirIformacion(File fichero) {
		try {
			FileReader fEntrada = new FileReader(fichero);
			int c = fEntrada.read();
			while (c!= -1) {
				if(c==-1) {
					
				}
				c = fEntrada.read();
				char letra = (char)c;
				System.out.print(letra);
			}
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Falta el fichero usuario", "ERROR", 0);
			System.out.println("No existe el fichero");
			System.exit(0);
		}
		
		
		//return " ";
	}
	public static boolean comproCampos(String usuarioComp, String contraseñaComp) {
		return false;
	}
	

}