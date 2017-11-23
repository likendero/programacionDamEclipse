
package practicaCuatro;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
public class P4_ej15 {
    public static void main(String[] args) {
        try(Scanner key = new Scanner(System.in)){
            //variables
            double lado1,lado2,lado3,sp;
            //entrada
            System.out.println("introduce valores para lado 1,2y3");
            lado1=key.nextDouble();
            lado2=key.nextDouble();
            lado3=key.nextDouble();
            sp=(lado1+lado2+lado3)/2;
            //salida
            System.out.println("el area es "+Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3)));
            key.close();
        }catch(Exception ex){
            System.out.println("error"+ ex.toString());
        }
    }
}
