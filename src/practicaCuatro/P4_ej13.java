
package practicaCuatro;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
public class P4_ej13 {
    public static void main(String[] args) {
        try(Scanner key = new Scanner(System.in)){
            //variables
            int numero;
            //entrada
            System.out.println("introduce un numero");
            numero=key.nextInt();
            //salida
            System.out.println(numero>=51 && numero<=100?"el numero esta en el intervalo [51,100]":
                     "el numero no esta en el intervalo [50,100]");
            key.close();
        }
    }      
}
