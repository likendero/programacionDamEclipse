package archivos;

import java.io.*;
import java.util.Scanner;
/**
 * clase que sirve para introducir una ruta por teclado y una palabra para buscar
 * @author Javier Gonzalez Rives
 */
public class Ej7 {
    public static Scanner key = new Scanner(System.in);
    /**
     * main
     * @param args
     */
    public static void main(String[] args){
        String cadena = null;
        boolean control = false;
        File archivo = null;
        // Introduccion de los parametros
        try {
            do{
                // directorio
                System.out.println("introduce el nombre o directorio del archivo");
                cadena = key.next();
                // instanciacion del archivo
                archivo = new File(cadena);
                // palabra a buscar
                System.out.println("introduce la palabra a buscar");
                cadena = key.next();
                /*
                 en el caso de que no sea un direcctorio con un fichero o la cadena se encuentre vacia
                 */
                if(archivo.isAbsolute()){
                    control = true;
                }else{
                    System.out.println("directorio no valido");
                }
            }while(!control && cadena != null);
        }
        catch(Exception ex){
            System.out.println("error");
            ex.printStackTrace();
        }
        // lectura del archivo
        try{
            String auxiliar ;
            // flujo binario
            FileInputStream flu = new FileInputStream(archivo);
            // formateo
            InputStreamReader in = new InputStreamReader(flu);
            // guardado en memoria
            BufferedReader bf = new BufferedReader(in);
            // primera intro
            auxiliar = bf.readLine();
            while(auxiliar != null){
                // comparacion con el filtro
                if(auxiliar.contains(cadena))
                    // SALIDA POR PANTALLA
                    System.out.println(auxiliar);
                auxiliar = bf.readLine();
            }
        }
        catch(FileNotFoundException fi){
            System.out.println("no se ha podido encocntrar el archivo");
        }
        catch(IOException io){
            System.out.println("error en el flujo");
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        finally {
            System.out.println("fin del programa");
        }
    }
}
