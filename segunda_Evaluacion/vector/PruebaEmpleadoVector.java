package vector;
	import java.util.Iterator;
import java.util.Scanner;
	import java.util.Vector;
		/*
		 * crear un vector de empleados con capacidad inicial 5
		 * con crecimiento 5 y que despues muestre los datos y diga las dimensiones
		 */
public class PruebaEmpleadoVector {
	
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		int introduccion = 0;
		Vector<Empleado> empleados = new Vector<Empleado>(5,5);
		do {
			//slecor para introducir elementos o terminar el programa
			System.out.println("1 para nuevo empleado, 2 para terminar");
			introduccion = key.nextInt();
			switch(introduccion) {
			case 1:
				empleados.add(datos());
				break;
			case 2:
				System.out.println("fin del programa");
				break;
			default:
				System.out.println("por favor introduzca un valor valido");
				break;
			}
		}while(introduccion!=2);
		//mostrar elementos
		for (Empleado empleado : empleados) {
			System.out.println(empleado.toString());
		}
		//salida por pantalla sanidad
		System.out.println("empleados con especialidad sanidad");
		for (Empleado empleado: empleados) {
			if(empleado.getEspecialidad() == Especialidades.SANIDAD) {
				System.out.println(empleado.toString());
			}
		}
		//vector que almacea a los de administracion
		Vector<Empleado> administracion = new Vector<Empleado>();
		//proceso de seleccion y guardado
		for(Empleado empleado : empleados) {
			if(empleado.getEspecialidad() == Especialidades.ADMINISTRACION) {
				administracion.add(empleado);
			}
		}
		//ajuste
		administracion.trimToSize();
		//salida
		for (Empleado empleado : administracion) {
			System.out.println(empleado.toString());
		}
	}
	/*
	 * metodo que sirve para introducir todos los datos de un empleado
	 */
	public static Empleado datos() {
		int selector = 0;
		Empleado nuevoEmpleado = new Empleado();
		System.out.println("introduce el nombre");
		nuevoEmpleado.setNombre(key.next());
		System.out.println("introduce direccion");
		nuevoEmpleado.setDireccion(key.next());
		System.out.println("introduce telefono");
		nuevoEmpleado.setTelefono(key.nextInt()+"");
		System.out.println("introduce nif");
		nuevoEmpleado.setNif(key.next());
		do{
			//slector
			System.out.println("selecione la especialidad");
			System.out.println("1 para administracion");
			System.out.println("2 para mecanica");
			System.out.println("3 para hosteleria");
			System.out.println("4 para inforematica");
			System.out.println("5 para sanidad");
			selector = key.nextInt();
			switch(selector) {
			case 1:
				nuevoEmpleado.setEspecialidad(Especialidades.ADMINISTRACION);
				break;
			case 2:
				nuevoEmpleado.setEspecialidad(Especialidades.MECANICA);
				break;
			case 3:
				nuevoEmpleado.setEspecialidad(Especialidades.HOSTELERIA);
				break;
			case 4:
				nuevoEmpleado.setEspecialidad(Especialidades.INFORMATICA);
				break;
			case 5:
				nuevoEmpleado.setEspecialidad(Especialidades.SANIDAD);
				break;
			default:
				System.out.println("introduce un valor valido por favor");
			};
		}while(selector<0 || selector>5);
		return nuevoEmpleado;
	}
}
