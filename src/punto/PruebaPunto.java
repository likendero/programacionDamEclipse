
package punto;
	import java.util.Scanner;
/**
 *
 * @author diurno
 */
public class PruebaPunto {
    public static void main(String[] args) {
    	Scanner key = new Scanner(System.in);
    	int introx,introy;
    	System.out.println("introduce un valor para x");
    	introx=key.nextInt();
    	System.out.println("introduce un valor para y");
    	introy=key.nextInt();
        Punto punto1=new Punto();
        Punto punto2=new Punto(introx,introy);
        Punto punto3=new Punto(punto2);
        
        System.out.println("introduce un nuevo valor para x ey punto 2");
        punto2.setX(key.nextInt());
        punto2.setY(key.nextInt());
        System.out.println("el punto 2 antes valia "+ punto3.toString()+" ahora vale "+punto2.toString());
        System.out.println("distancia del punto 1 al punto 2    "+punto1.distanciaPunto(punto2));
        System.out.println("el punto medio de punto 2 y punto 3"+ punto2.puntoMedio(punto2).toString());
    }
}
