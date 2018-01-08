package arrayObjetos;

public class arrayEmpleado {
	public static void main(String[] args) {
		Empleado empleados[];
		//inicializacion
		empleados = new Empleado[3];
		//valores
		empleados[0] = new Empleado("pepito", "Rodriguez",(byte)30,500);
		empleados[1] = new Empleado("maria", "sanchez",(byte)25,200);
		empleados[2] = new Empleado("javier", "gonzalez", (byte)19,1000);
		//muestra de arrays
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(empleados[i].toString());
		}
		//suma de los sueldos
		System.out.print("suma de los sueldos: ");
		System.out.print(empleados[0].getSueldo() + empleados[1].getSueldo() + empleados[2].getSueldo());
		
	}
}
