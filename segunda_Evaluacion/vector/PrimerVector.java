package vector;
	import java.util.Vector;
public class PrimerVector {
	public static void main(String[] args) {
		Vector<String> alumnos = new Vector<String>();
		alumnos.add("pepe");
		alumnos.add("jose");
		alumnos.add("pepe");
		alumnos.add("jose");
		alumnos.add("pepe");
		alumnos.add("jose");
		alumnos.add("pepe");
		alumnos.add("jose");
		alumnos.add("pepe");
		alumnos.add("jose");
		alumnos.add("pepe");
		alumnos.add("jose");
		System.out.println(alumnos.size() + " " + alumnos.capacity());
		for (String string : alumnos) {
			System.out.println(string);
		}
	}
}
