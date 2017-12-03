package Ejercicio04;
	import java.util.Scanner;
public class PruebaFecha {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Fecha fecha1 = new Fecha();
		Fecha fecha2 = new Fecha(4,5,1975);
		Fecha fecha5= new Fecha(4,5,1976);
		Fecha fecha3 = new Fecha();
		
		//leer
		System.out.println("prueba leer fecha3 actual:" + fecha3.corta());
		fecha3.leer(key);
		System.out.println("nueva fecha3 "+ fecha3.corta());
		//mostrar fecha
		System.out.println("fecha1 corta "+ fecha1.corta());
		System.out.println("fecha2 corta "+ fecha2.corta());
		System.out.println("fecha3 larga "+ fecha3.larga());
		System.out.println("fecha2 larga "+ fecha2.larga());
		System.out.println("fecha1 larga "+ fecha1.larga());
		//fecha tras
		System.out.println("1-1-1900 +67694357 dias "+ fecha2.fechaTras(67694357l).corta());
		//dias transcurridos
		System.out.println("dias transcurridos hasta fecha2 "+ fecha2.diasTranscurridos());
		System.out.println("dias entre fecha1 fecha2 "+ fecha1.diasEntre(fecha2));
		System.out.println("dias entre fecha2 y fecha5 "+ fecha2.diasEntre(fecha5));
		
		//dia dia siguiente y anterior
		fecha3.siguiente();
		System.out.println("dia siguiente a fecha3 "+ fecha3.corta() );
		fecha3.anterior();
		fecha3.anterior();
		fecha3.anterior();
		System.out.println("fecha3 3 dias atras "+ fecha3.corta());
		//comaparaciones
		Fecha fecha4 = new Fecha(4,5,2020);
		System.out.println("1-1-1900 es a 4-5-2020 ");
		System.out.println(fecha1.menorQue(fecha4)?"menor":"mayor");
		System.out.println(fecha1.mayorQue(fecha4)?"mayor":"menor");
		System.out.println("fecha1 y 1-1-1900");
		System.out.println(fecha1.igualQue(fecha1)?"igual":"distinto");
		
		
	}
}
