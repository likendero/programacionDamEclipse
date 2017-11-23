
package practicaCuatro;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
public class P4_ej10 {
    public static void main(String[] args) {
        try(Scanner key = new Scanner(System.in)){
            //varibles 
            String numero;
            char uno,dos,tres;
            //entrada
            System.out.println("Introduce un numero de 3 cifras");
            numero=key.next();
            uno=numero.charAt(0);
            dos=numero.charAt(1);
            tres=numero.charAt(2);
            //salida
            System.out.println(numero.length()<=3?uno+" "+dos+" "+tres:""
                    + "el numero es de mas de 3 cifras");
            key.close();
        }catch(Exception ex){
            System.out.println("faltan cifras "+ ex.toString());
        }
    }
}
