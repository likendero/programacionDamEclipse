package Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	
	// primera raiz
	static double root(double A, double B, double C) throws IllegalArgumentException{  
		if (A == 0) {          
			throw new IllegalArgumentException("A no puede ser cero.");         
		}else {            
			double disc = B*B - 4*A*C;            
			if (disc < 0)               
				throw new IllegalArgumentException("Discriminante < cero.");         
				return  (-B + Math.sqrt(disc)) / (2*A);
		
		}
	}
	static double root1(double A, double B, double C) throws IllegalArgumentException{  
		if (A == 0) {          
			throw new IllegalArgumentException("A no puede ser cero.");         
		}else {            
			double disc = B*B - 4*A*C;            
			if (disc < 0)               
				throw new IllegalArgumentException("Discriminante < cero.");         
				return  (-B - Math.sqrt(disc)) / (2*A);
		
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=0, b=0,c=0;
		boolean valido=false;
		//***************** coeficiente A
		while(!valido)
			try {
				System.out.println("Introduce valor del coeficiente A de la ecuación a*x*x+B*x+C=0");
				a=sc.nextDouble();
				valido=true;
			}catch (InputMismatchException ime) {
				System.out.println("*****Debes introducir un número");
				sc.next();
			}
		valido=false;
		
		//***************** coeficiente B
		while(!valido)
			try {
				System.out.println("Introduce valor del coeficiente B de la ecuación a*x*x+B*x+C=0");
				b=sc.nextDouble();
				valido=true;
			}catch (InputMismatchException ime) {
				System.out.println("*****Debes introducir un número");
				sc.next();
			}
		valido=false;
		
		//***************** coeficiente C
		while(!valido)
			try {
				System.out.println("Introduce valor del coeficiente C de la ecuación a*x*x+B*x+C=0");
				c=sc.nextDouble();
				valido=true;
			}catch (InputMismatchException ime) {
				System.out.println("*****Debes introducir un número");
				sc.next();
			}
		valido=false;
		
		try{
			System.out.println(Ejercicio4.root(a,b,c));
			valido=true;
		}catch(IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}
		if (valido==true)
			System.out.println(Ejercicio4.root(a,b,c));
		sc.close();

	}

}
