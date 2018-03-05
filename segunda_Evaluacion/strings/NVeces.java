package strings;
import java.util.Scanner;
public class NVeces {
    private static Scanner key = new Scanner(System.in);
    public static void main(String[] args){
        String cadena;
        //introduccion
        System.out.println("escribe una cadena, si escribes un numero la letra siguiente se escribira n veces");
        cadena = key.nextLine();
        System.out.println();
        //recorrido de la cadena
        for(int i = 0; i < cadena.length() ; i++){
            //comprobacion de si es un numero
            if(Character.isDigit(cadena.charAt(i)) && i+1 < cadena.length()){
                //salida n veces
                for(int j = 0; j < Character.getNumericValue(cadena.charAt(i)); j++){
                    System.out.print(cadena.charAt(i+1));
                }
                i++;
            }else{
                System.out.print(cadena.charAt(i));
            }

        }
    }
}