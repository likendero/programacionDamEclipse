
package practicaCuatro;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */

public class P4_ej7 {
    public static void main(String[] args) {
        try(Scanner key=new Scanner(System.in)){
            //variables
            int nota1,nota2,nota3;
            //entrada
            System.out.println("introduce la primera nota");
            nota1=key.nextInt();
            System.out.println("introduce la segunda nota");
            nota2=key.nextInt();
            System.out.println("introduce la tercera nota");
            nota3=key.nextInt();
            //salida
            System.out.println("la nota media es "+ ((nota1+nota2+nota3)/3));
            key.close();
        }
    }
}
