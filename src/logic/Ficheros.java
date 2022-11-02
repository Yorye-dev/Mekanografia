package logic;

import java.io.File;

public class Ficheros {
	File estadisticasFile = new File("bbdd\\estadisticas.txt");
	File texto = new File("bbdd\\texto.txt");
	File usuarios = new File("bbdd\\usuario.txt");
	
	static public boolean comprobarFicheros() {
		if (estadisticasFile.exists()==false) {
			
		}
		
		return true;
	}
	

}
