package ej4;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * programa que permita fusionar dos ficheros de texto indicados por el usuario
 * @author Javier Gonzalez Rives
 */
public class Ej14{
    private static File archivo1;
    private static File archivo2;
    private static File destino;
    private static Scanner key = new Scanner(System.in);
        /**
         * metodo principal
         * @param args
         */
    public static void main(String[] args){

        definirRutas();
        try{

            // creacion del flujo
            FileWriter flujoMez = new FileWriter(destino);
            // escribir1
            escritor(flujoMez,archivo1);
            flujoMez.close();
            // escribir 2
            flujoMez = new FileWriter(destino,true);
            escritor(flujoMez,archivo2);
            flujoMez.close();
        }catch(IOException io){
            System.out.println("error entrada salida");
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
    /**
     * metodo que sirve para definir las rutas de los archivos a mezclar
     */
    private static void definirRutas(){
        boolean control = false;
        do {
            try {
                // ARCHIVO 1
                do {
                    // ruta primer archivo
                    System.out.println("introduce la ruta del primer archivo(despues va el nombre)");
                    archivo1 = new File(key.next());
                    key.nextLine();
                    // nombre primer archivo
                    System.out.println("introduce el nombre del archivo que deseas");
                    archivo1 = new File(archivo1, key.next());
                    key.nextLine();
                }while(!archivo1.exists());
                // ARCHIVO 2
                do {
                    // introduccion ruta archivo 2
                    System.out.println("introduce la ruta del segundo archivo(despues va el nombre)");
                    archivo2 = new File(key.next());
                    key.nextLine();
                    // introduccion archivo 2
                    System.out.println("introduce el nombre del archivo");
                    archivo2 = new File(archivo2,key.next());
                    key.nextLine();
                }while(!archivo2.exists());
                // DESTINO

                System.out.println("introduce el directorio de destino");
                destino = new File(key.next());
                key.nextLine();
                // si el directorio no existo lo crea
                if(!destino.exists()){
                    if(destino.mkdirs()){
                        System.out.println("direccorio creado");
                    }
                }
                destino = new File(destino,(archivo1.getName() + "_" + archivo2.getName() + ".txt"));


                control = true; // FIN BUCLE

            } catch (InputMismatchException in) {
                System.out.println("error en la introduccion");
                key.nextLine();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }while(!control);
    }
    public static void escritor (FileWriter flujoSal,File flujoEntr)throws IOException{
        // formateo del escritor
        PrintWriter escr = new PrintWriter(flujoSal);
        // buffer entrada
        BufferedReader buf = new BufferedReader(new FileReader(flujoEntr));
        // bucle escritor
        String aux = buf.readLine();
        while(aux != null){
            escr.println(aux);
            aux = buf.readLine();
        }
        buf.close();
        escr.close();
    }
}
