package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
	
	public static void recibirUsuarios(File file,ArrayList<Usuarios> lista)
	{
		try 
		{
			FileReader     fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String         linea;
			String[]       columna = new String[4];
			
			linea = br.readLine();
			while (linea != null)
			{
				// Tratar la línea separado con ; 
				columna = linea.split(";");
				Usuarios  c = new Usuarios(columna[0], columna[1], columna[2], columna[3]);
				lista.add(c);
				linea = br.readLine();
			}
			// Cerrar el fichero
			br.close();
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
/*
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
	*/
	
	public static boolean comproCampos(String usuarioComp, String contraseñaComp, ArrayList<Usuarios> lsita) {
		
		
		return false;
	}
	

}