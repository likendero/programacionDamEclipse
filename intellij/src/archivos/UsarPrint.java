package archivos;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class UsarPrint {
    public static Scanner key = new Scanner(System.in);
    public static void main(String[] args){
        boolean control = false;
        String nombre = "";
        short edad = 0;
        int anno = 0;
        do {
            do {
                try {
                    System.out.println("introduce nombre");
                    nombre = key.next();
                    System.out.println("introduce la edad");
                    edad = key.nextShort();
                    System.out.println("introduce el anno");
                    anno = key.nextInt();
                    control = true;
                } catch (InputMismatchException in) {
                    System.out.println("error en la introduccion");
                    key.nextLine();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } while (!control);
            // reset control
            control = false;
            // escritura
            try (FileOutputStream entrada = new FileOutputStream("archivo3.bin", true)) {

                PrintStream escritor = new PrintStream(entrada);

                escritor.println(nombre);
                escritor.println(edad);
                escritor.println(anno);
                escritor.close();
                System.out.println("seguir? 1 si 0 no");
                control = seguir(key.nextInt());
            } catch (IOException io) {
                io.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }while(!control);
    }

    /**
     * metodo mal hecho simplon para ver si se quiere seguir
     * @param entrada un entero entre 0 o 1
     * @return true no seguir false seguir
     */
    private static boolean seguir(int entrada){

        if(entrada == 1)return false;
        return true;
    }
}
