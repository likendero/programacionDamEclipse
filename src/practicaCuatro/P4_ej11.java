
package practicaCuatro;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
public class P4_ej11 {
    public static void main(String[] args){
    try(Scanner key = new Scanner(System.in)){
            //variables
            char uno,dos,tres,cuatro,cinco;
            String numero;
            //entrada
            System.out.println("introduce un numero de 5 cifras");
            numero=key.next();
            uno=numero.charAt(0);
            dos=numero.charAt(1);
            tres=numero.charAt(2);
            cuatro=numero.charAt(3);
            cinco=numero.charAt(4);
            /*
            este porgrama podria hacerse sin crear las varibles de tipo char usando
            el string.charAt(x) pero en el momento no se me ocurrio
            */
            //salida
            System.out.println(numero.length()<=5?cinco+" "+cuatro+" "+tres+" "+dos+" "+uno:""
                    + "numero de cifras incorrecto");
            key.close();
        }catch(Exception ex){
            System.out.println("error "+ex.toString());
        }
    }
}
