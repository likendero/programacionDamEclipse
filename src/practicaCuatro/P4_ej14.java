
package practicaCuatro;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
public class P4_ej14 {
    public static void main(String[] args) {
        try(Scanner key = new Scanner(System.in)){
            //variables
            int numero;
            //entrada
            System.out.println("Introduce un valor entero");
            numero=key.nextInt();
            //salida
            System.out.println(numero>=60 && numero<=90?"el numero es positivo y esta en el intervalo"
                    + "[60,90]":numero>0?"el numero es positivo":numero==0?"el numero es 0":""
                    + "el numero es negativo");
            key.close();
        }catch(Exception ex){
            System.out.println("error"+ ex.toString());
        }
    }
}
