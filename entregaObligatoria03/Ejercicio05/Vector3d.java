package Ejercicio05;
/**
 * clase contiene los valores para crear un punto y manipularlo
 * @author liken
 *
 */
public class Vector3d {
	int x,y,z;
	/**
	 * constructor por defecto, inicializa todos los valores a 0
	 */
	public Vector3d() {
		super();
		this.x=0;
		this.y=0;
		this.z=0;
	}
	/**
	 * constructor de clase, se le pasan todos los parametros para crear el 
	 * punto
	 * @param x
	 * @param y
	 * @param z
	 */
	public Vector3d(int x,int y,int z) {
		super();
		this.x=x;
		this.y=y;
		this.z=z;
	}
	/**
	 * constructor de copia, crea otro vector copiando los valores 
	 * de otro ya existente
	 * @param vector3d2
	 */
	public Vector3d(Vector3d vector3d2) {
		super();
		this.x=vector3d2.getX();
		this.y=vector3d2.getY();
		this.z=vector3d2.getZ();
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "("+this.getX()+","+this.getY()+","+this.getZ()+")";
	}
	/**
	 * metodo que compara dos vectores e indica si son iguales
	 * @param vector3d2
	 * @return true si son iguales false en caso contrario
	 */
	public boolean equal(Vector3d vector3d2) {
		if(this.getX() == vector3d2.getX() && this.getY() == vector3d2.getY()
				&& this.getZ() == vector3d2.getZ())
			return true;
		return false;
	}
	/**
	 * metodo que traslada el vector en la coordenada x
	 * @param x desplazamiento
	 */
	public void trasladar(int x) {
		this.setX(this.getX()+x);
	}
	/**
	 * metodo que traslada el vector introduciendo la distancia en x ý en y
	 * @param x
	 * @param y
	 */
	public void trasladar(int x,int y) {
		this.setX(this.getX()+x);
		this.setY(this.getY()+y);
	}
	/**
	 * metodo que traslada el vector introduciendo  la distancia en x,y ý z
	 * @param x
	 * @param y
	 * @param z
	 */
	public void trasladar(int x,int y,int z) {
		this.setX(this.getX()+x);
		this.setY(this.getY()+y);
		this.setZ(this.getZ()+z);
	}
}
