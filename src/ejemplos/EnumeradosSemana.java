package ejemplos;
	enum  semana{lunes,martes,miercoles,jueves,viernes,sabado,domingo};
public class EnumeradosSemana {
	public static void main(String[] args) {
		semana diaActual= semana.miercoles;
		semana diaQueQuieroQueLlegue=semana.sabado;
		System.out.println(diaActual);
		System.out.println(diaQueQuieroQueLlegue);
	}
}
