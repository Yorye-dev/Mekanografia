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
	
	public static void recibirUsuarios(File file,ArrayList<Usuarios> lista){
		try 
		{
			FileReader     fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String         linea;
			String[]       columna = new String[4];
			
			linea = br.readLine();
			while (linea != null)
			{
				// Guardar loc campos de la línea la línea separado con ; 
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
	public static String recibirIformacion(File fichero) {
		String texto = "";
		try {
			FileReader fEntrada = new FileReader(fichero);
			
			int letraInt = fEntrada.read();
			while (letraInt!= -1) {
				if(letraInt==-1) {
					//listaTexto.add(texto);
				}
				//letraInt = fEntrada.read();
				String letra = String.valueOf(letraInt);
				texto = texto + letra;
			}
			fEntrada.close();
			return texto;
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Falta el fichero usuario", "ERROR", 0);
			System.out.println("No existe el fichero");
			System.exit(0);
		}
		return texto;
	}*/
	
	//Compueba si la contraseñ y el usuaeio coinciden con alguno de los Usuarios
	
	public static int comproCampos(String usuarioComp, String contraseñaComp, ArrayList<Usuarios> lista) { //refactorizar con bucles !!
		
		if(usuarioComp.equals(lista.get(0).getNombre()) && contraseñaComp.equals(lista.get(0).getContraseña())){
			return 0;
		}else if(usuarioComp.equals(lista.get(1).getNombre()) && contraseñaComp.equals(lista.get(1).getContraseña())){
			return 1;
		}else if(usuarioComp.equals(lista.get(2).getNombre()) && contraseñaComp.equals(lista.get(2).getContraseña())){
			return 2;
		}
		JOptionPane.showMessageDialog(null, "Login incorrecto", "ERROR", 0);
		return lista.size();
	}
	
	public static String recibirTextoDeFicheros(File fichero, int dificultad) { //Recojer el texto
		String texto = "";
		try 
		{
			FileReader     fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			String         linea;
			String[]       columna = new String[2];
			
			linea = br.readLine();
			while (linea != null)
			{
				// Guardar loc campos de la línea la línea separado con ; 
				columna = linea.split(";");
				texto = columna[dificultad];
				linea = br.readLine();
			}
			// Cerrar el fichero
			br.close();
			return texto;
			
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		return texto;
	}
}