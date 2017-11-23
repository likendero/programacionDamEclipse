
package practicaCuatro;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
public class P4_ej12 {
    public static void main(String[] args) {
        try(Scanner key = new Scanner(System.in)){
            //variables
            String entrada;
            char seleccion;
            //entrada
            System.out.print("Introduce algo por teclado ");
            entrada=key.next();
            seleccion=entrada.charAt(0);
            //salida
            System.out.println(seleccion=='1'|| seleccion=='2'||seleccion=='3'||seleccion=='4'||
                    seleccion=='5'||seleccion=='6'||seleccion=='7'||seleccion=='8'||seleccion=='9'||
                    seleccion=='0'?"es un numero":"es un caracter");
            key.close();
            /*
            Implementando la clase java.lang.Character se podria simplificar mucho este 
            programa
            */
        }catch(Exception ex){
            System.out.println("error "+ ex.toString() );
        }
    }
}
