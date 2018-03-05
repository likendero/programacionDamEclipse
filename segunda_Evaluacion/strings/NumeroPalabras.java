package strings;
import java.util.Scanner;
public class NumeroPalabras {
    private static Scanner key = new Scanner(System.in);
    public static void main(String[] args){
        String cadena;
        int numPalabras  = 0;
        // introduccion de la cadena
        System.out.println("introduce una cadena para contar el numero de palabras");
        cadena = key.nextLine();
        //recorrido
        for(int i = 0; i < cadena.length(); i++){
            /*
            comprueba si lo primero que aparece es una palabra 
            y depues cuenta el resto de palabreas, el metodo consiste
            en detectar los espacios si despues de uno hay una letra suma 
            una palabra
             */
            if(i==0 && Character.isLetter(cadena.charAt(i))
                    || cadena.substring(i,i+1).equals(" ") && Character.isLetter(cadena.charAt(i+1))){
                numPalabras++;
            }
        }
        System.out.println("el numero de palabras es " + numPalabras);
    }
}
