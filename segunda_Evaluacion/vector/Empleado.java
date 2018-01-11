package vector;
	
enum Especialidades{
	ADMINISTRACION,
	MECANICA,
	HOSTELERIA,
	INFORMATICA,
	SANIDAD;
}
	
public class Empleado {
	private String nombre, direccion,telefono,nif;
	private Especialidades especialidad;
	/**
	 * constructor por defecto
	 */
	public Empleado() {
		//super
		this.nombre = null;
		this.direccion = null;
		this.telefono = null;
		this.nif = null;
		especialidad = null;
	}
	/**
	 * constructor de clase
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 * @param nif
	 * @param especialidad
	 */
	public Empleado(String nombre, String direccion, String telefono, String nif, Especialidades especialidad) {
		//super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nif = nif;
		this.especialidad = especialidad;
	}
	//getters
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getNif() {
		return nif;
	}
	public Especialidades getEspecialidad() {
		return especialidad;
	}
	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public void setEspecialidad(Especialidades especialidad) {
		this.especialidad = especialidad;
	}
	@Override
	public String toString() {
		return this.nombre + " direcion: " + this.direccion + " telefono " + this.telefono + " nif "
				+ this.nif + " especialidad " + this.especialidad;
	}
}
