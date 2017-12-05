package ajedrez;
	import java.util.Scanner;
public class PruebaRey {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Rey reyBlanco = new Rey();
		char movimiento=' ';
		do {
			//menu
			System.out.println("mover rey");
			System.out.println("mover norte 		w");
			System.out.println("mover noreste 		q");
			System.out.println("mover noroeste		e");
			System.out.println("mover este 		    a");
			System.out.println("mover oeste 		d");
			System.out.println("mover sur 		    x");
			System.out.println("mover sureste 		z");
			System.out.println("mover suroeste 		c");
			System.out.println("acabar movimientos 	f");
			movimiento=key.next().charAt(0);
			switch(movimiento) {
			case 'w': case 'W':
				reyBlanco.mueve(Direccion.NORTE);
				break;
			case 'q': case 'Q':
				reyBlanco.mueve(Direccion.NORESTE);
				break;
			case 'e': case 'E':
				reyBlanco.mueve(Direccion.NOROESTE);
				break;
			case 'x': case 'X':
				reyBlanco.mueve(Direccion.SUR);
				break;
			case 'z': case 'Z':
				reyBlanco.mueve(Direccion.SURESTE);
				break;
			case 'c': case 'C':
				reyBlanco.mueve(Direccion.SUROESTE);
				break;
			case 'a': case 'A':
				reyBlanco.mueve(Direccion.ESTE);
				break;
			case 'd': case 'D':
				reyBlanco.mueve(Direccion.OESTE);
				break;
			case'f': case 'F':
				break;
			default:
				System.out.println("orden no valida");
				break;
			}
			System.out.println(reyBlanco.toString());
		}while(movimiento!='f');
		key.close();
	}
}
