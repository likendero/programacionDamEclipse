package archivos;
import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class leerTexto {
    public static void main(String[] args){
        File f = new File("hola.txt");
        String cadena = "";
        try {
            FileInputStream in = new FileInputStream(f);
            InputStreamReader re  = new InputStreamReader(in);
            BufferedReader bf = new BufferedReader(re);
            cadena = bf.readLine();
            while(cadena != null){
                System.out.println(cadena);
                cadena = bf.readLine();
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("fin del programa");
        }
    }
}
