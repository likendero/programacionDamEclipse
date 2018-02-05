package regex;

public class Persona {
	private String nombre, apellido, dni, fechaNac, email,
	Fijo, movil;
	public Persona() {
		//super();
	}
	//getters setters
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellido;
	}
	public String getDni() {
		return dni;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public String getEmail() {
		return email;
	}
	public String getFijo() {
		return Fijo;
	}
	public String getMovil() {
		return movil;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellido = apellidos;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFijo(String fijo) {
		Fijo = fijo;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	//############################################################
	public String toString() {
		return "nombre: " + this.getNombre() + " apellido: " + this.getApellidos()
				+ "\n dni: " + this.getDni() + " fecha:" + this.getFechaNac()
				+ "\n email" + email
				+ "\n numero fijo: " + this.getFijo() + " numero movil: " + this.getMovil();
				
	}
}















