
package practicaCuatro;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
/* 
este programa pide un valor para la varible x de la que dependera el valor de y
y=6x²+8x-17
*/
public class P4_ej8 {
    public static void main(String[] args) {
        try(Scanner key=new Scanner(System.in)){
            //variables
            double x;
            //entrada
            System.out.println("Introduce un valor para x");
            x=key.nextDouble();
            //salida
            System.out.println("el valor de y es "+(6*Math.pow(x, 2)+8*x-17));
            key.close();
        }
    }
}
