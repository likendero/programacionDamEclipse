
package practicaCuatro;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
public class P4_ej9 {
    public static void main(String[] args) {
        try(Scanner key=new Scanner(System.in)){
            //varibles
            final double iva=0.21;
            double precio;
            //entrada
            System.out.println("introduce el precio del producto");
            precio=key.nextDouble();
            //salida
            System.out.println("el precio con iva es "+ (precio+precio*iva) );
            key.close();
        }
    }
}
