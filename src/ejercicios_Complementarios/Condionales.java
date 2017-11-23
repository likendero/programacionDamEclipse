
package ejercicios_Complementarios;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
public class Condionales {
    
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        numeroDeCifras(key);
    }
    public static void numeroDeCifras(Scanner key){
        int numero;
        numero=key.nextInt();
        System.out.println("el numero de cifras es"+String.valueOf(numero).length());
    }
}
