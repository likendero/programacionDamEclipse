
package patrones;
import java.util.regex.*;
import java.util.Scanner;
/**
 *
 * @author liken
 */
public class primeraPrueba {
    private static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {
        String cadena;
        System.out.println("introduce una cadena");
        cadena = key.nextLine();
        //creacion del pattern
        Pattern p = Pattern.compile("\\d");
        //creacion del matcher
        Matcher m = p.matcher(cadena);
        System.out.println(cadena.length());
        //recorrido del matcher
        if(m.find()){
           cadena = m.replaceAll("");
        }
        //salida 
        System.out.println(cadena.length());
        System.out.println(cadena);
        
    }
}
