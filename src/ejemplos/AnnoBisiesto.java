package ejemplos;
import java.util.Scanner;

public class AnnoBisiesto {
	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		int anno=0;
		System.out.println("introduce año");
		anno=key.nextInt();
		System.out.println(anno%400==0 || anno%4==0 && anno%100!=0?"es bisiesto":"no es bisiesto");
		
		
	}
}
