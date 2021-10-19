package model;

public class persona {
	String nombre;
	String apellidos;
	String edad;
	public persona(String nombre, String apellidos, String edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	 
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return nombre+" " +apellidos+" "+edad;
	}

}
