package ej4;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * clase que crea dos archivos de ej4, uno un listado de paises, otro es un
 * listado de ciudades, en un directorio indicado por el usuario
 * @author Javier Gonzalez Rives
 */
public class Ej12 {
    private static Scanner key = new Scanner(System.in);

    /**
     * metodo principal
     * @param args
     */
    public static void main(String[] args){
        boolean control = false;
        File directorio = null;

        do{
            try{
                // introduccion del directorio
                System.out.println("introduce el directorio en el que deseas introducir los paises y ciudades");
                System.out.println("(si no existe lo creara)");
                directorio = new File(key.next());
                key.nextLine();
                // en el caso que no exista el direcctorio introducido
                if(!directorio.exists()){
                    // creacion del direcctorio, en el caso de que lo cree (de crear) imprime un mensaje por pantalla
                    if(directorio.mkdirs())
                        System.out.println("directorio creado correctamente");
                }
                control = true; // fin del bucle
            }catch(InputMismatchException in){
                System.out.println("error en la introduccion de ej4");
                key.nextLine();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }while(!control);
        // llamada al metodo para imprimir
        imprimirCiudades(directorio);

    }
    private static void imprimirCiudades(File directorio){
        File ciudades = new File(directorio,"ciudades.txt");
        File paises = new File(directorio,"paises.txt");
        String cadCiudades[] = {"Madrid","Lisboa","Paris","Berlin"};
        String cadPaises[] = {"Espanna","Portugal","Francia","Alemania"};
        // INICIO DEL PROCESO CONTROLADO
        try{
            // flujos de salida
            FileWriter escritorCiudades = new FileWriter(ciudades);
            FileWriter escritorPaises = new FileWriter(paises);
            // imresoras laser
            PrintWriter prCiudades = new PrintWriter(escritorCiudades);
            PrintWriter prPaises = new PrintWriter(escritorPaises);
            // bucle para ciudades
            for (int i = 0; i < cadCiudades.length;i++ ){
                // impresion
               prCiudades.println(cadCiudades[i]);
            }
            // cerrado flujo ciudades
            prCiudades.close();
            escritorCiudades.close();
            // bucle paises
            for(int i = 0; i < cadPaises.length ; i++){
                // impresion para paises
                prPaises.println(cadPaises[i]);
            }
            // cerrado flujo para paises
            prPaises.close();
            escritorPaises.close();
        }catch(FileNotFoundException fn){
            System.out.println("archivo no encontrado");
        }catch(IOException io){
            System.out.println("ERROR en la escritura");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("fin de impresion");
        }
    }
}










