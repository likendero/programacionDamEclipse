package archivos;
// io
import java.io.*;
import java.util.Scanner;
public class dataInOut {
    //SCANNER
    private static Scanner key = new Scanner(System.in);

    /**
     * main
     * @param args
     */
    public static void main(String[] args){
        try {
            //creacion de flujo
            FileOutputStream salida = new FileOutputStream("archivo.bin",true);
            // flujo de datos
            DataOutputStream formateo = new DataOutputStream(salida);
            //entrada
            System.out.println("leer");
            formateo.writeChars(key.nextLine() + '\n');
            System.out.println("introduce otra linea");
            formateo.writeChars(key.nextLine() + '\n');
            // cerrado
            formateo.close();
            salida.close();
            //////////////////////////////////////////////////////////////////////
            System.out.println("lectura de lo escrito");
            FileInputStream entrada = new FileInputStream("archivo.bin");
            DataInputStream formateo2 = new DataInputStream(entrada);
            String cadena = "";
            try{
                while(true){
                    cadena += formateo2.readChar();
                }
            }
            catch(IOException io){
                System.out.println("fin lectura");
            }
            System.out.println(cadena);
        }
        catch (IOException io){
            key.nextLine();
            System.out.println("error en el flujo");
            io.printStackTrace();
        }
        catch(Exception ex){
            key.nextLine();
            ex.printStackTrace();
        }
    }
}
