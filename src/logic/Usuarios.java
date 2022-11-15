package logic;

public class Usuarios {
	String id;
	String nombre;
	String contraseña;
	String correo;
	
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public Usuarios(String id, String nombre, String contraseña, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.correo = correo;
	}
	
	
}
