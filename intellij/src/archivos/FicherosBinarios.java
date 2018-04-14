package archivos;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FicherosBinarios {
    public static Scanner key = new Scanner(System.in);
    public static void main(String[] args){
        boolean control = false;
        String nombre = "";
        short edad = 0;
        int anno = 0;
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }while(!control);
        // escritura
        try(FileOutputStream entrada = new FileOutputStream("archivo2.bin",true)){
            DataOutputStream formateo = new DataOutputStream(entrada);
            formateo.writeUTF(nombre);
            formateo.writeShort(edad);
            formateo.writeInt(anno);
        }
        catch (IOException io){
            io.printStackTrace();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
