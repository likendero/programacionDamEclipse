package ejemplos;
import com.sun.java.accessibility.util.EventID;
	import java.util.Scanner;
public class EjerciciosCondicionales {

	public static void main(String[] args) {
            sumaConScanner();
            condicionales();
                
		
	}
        public static void sumaConScanner(){
            Scanner key=new Scanner(System.in);
            int num1;
            int num2;
            System.out.println("Introduce un entero");
            num1=key.nextInt();
            System.out.println("Introduce el segundo entero");
            num2=key.nextInt();
            System.out.println("La suma es "+ (num1+num2));
        }
        public static void condicionales(){
                int nota=0;
		int anno=1998;
		int mes=2;
		int dia=9;
		int edad= 2017-anno;
		int numero=23;
		System.out.println("Introduce nota para FP");
		//nota=key.nextInt();
		System.out.println(nota>=0 && nota<=10?"nota valida":"nota no valida");
		System.out.println(dia==9 && mes==2?"hoy es tu cumpleaños":"hoy no es tu cumpleaños");
		System.out.println(edad>=18?"puedes votar en las elecciones":"no puedes votar en las elecciones");
		System.out.println(numero%3==0 && numero%5==0 && numero%7!=0?"cumple":"no cumple");
		System.out.println(numero==6*(25-3)?"lo es":"no lo es");
		System.out.println(numero==(320+8)/8/8?"lo es":"no lo es");
		
        }
        public static void pruebaBits(){
                Scanner key=new Scanner(System.in);
                int prueba = 200;
		byte prueba2 =2;
		double lala=3.3;
                prueba2=(byte)prueba;
		System.out.println(prueba2);
		prueba=(int)lala;
		System.out.println(prueba);
                System.out.println("Introduce un entero");
                prueba=key.nextInt();
                System.out.println(prueba);
        }
	

}
