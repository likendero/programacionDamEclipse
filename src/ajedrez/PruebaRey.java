package ajedrez;
	import java.util.Scanner;
public class PruebaRey {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Rey reyBlanco = new Rey();
		char movimiento=' ';
		do {
			System.out.println("mover rey");
			System.out.println("mover norte w");
			System.out.println("mover noreste q");
			System.out.println("mover noroeste e");
			System.out.println("mover este a");
			System.out.println("mover oeste d");
			System.out.println("mover sur x");
			System.out.println("mover sureste z");
			System.out.println("mover suroeste c");
			System.out.println("acabar movimientos f");
			switch(movimiento) {
			
			}
		}while(movimiento!='f');
	}
}
