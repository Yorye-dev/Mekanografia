package logic;

import java.io.File;

import javax.swing.JOptionPane;

public class Ficheros {
	static public File estadisticasFile = new File("bbdd\\estadisticas.txt");
	static public File textoFile = new File("bbdd\\texto.txt");
	static public File usuariosFile = new File("bbdd\\usuarios.txt");
	
	
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
	

}