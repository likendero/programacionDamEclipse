package Files;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * para este ejercicio se ha reultilizado el codigo del ejercicio anterior
 * se ha annadido la funcion de buscar segun el primer caracter
 */
public class FiltroComienzo {
    private static Scanner key = new Scanner(System.in);

    /**
     * metodo principal
     * @param args
     */
    public static void main(String[] args){
        String directorio;
        char caracter = ' ';
        boolean control = false;
        File archivo  = null;
        // introduccion del directorio
        do {
            try {
                System.out.println("introduce un directorio");
                // se introduce el directorio deseado
                directorio =  key.next();
                // introduccion del caracter
                System.out.println("introduce un caracter para realizar la busqueda");
                System.out.println("(si escribes de mas solo se cogera el primer caracter)");
                caracter = key.next().charAt(0);
                //  se crea el archivo
                archivo = new File(directorio);
                control = true;
                // en el caso de error de introduccion
            } catch (InputMismatchException in) {
                System.out.println("introduccion no valida");
                key.nextLine();
                // errores generales
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }while(!control);
        //lectura del dirrectorio
        try{
            // comprobacon de que exista
            if(archivo.exists()){
                // comprobacion si es un directorio
                if(archivo.isDirectory()){
                    // caso que lo sea

                    mostrarDirectorioFiltrado(archivo,caracter);
                }else{
                    // caso qeu no lo sea
                    System.out.println(archivo.getName() + " es un archivo");
                }
            }
            else{
                // caso que el directorio no exista
                System.out.println(" el directorio o archivo no existe ");
            }
        }
        // en el caso de nulo
        catch (NullPointerException nu){
            System.out.println("el directorio es nulo");
        }
        // en el caso de excepcion no controlada
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * metodo que sirve para imprimir por pantalla un directorio
     * @param archivo directorio a imprimir
     */
    public static void mostrarDirectorioFiltrado(File archivo,char caracter){
        File archivo2[]  = archivo.listFiles();
        for(File f: archivo2){
            // comparacion del primer caracter
            if(Character.toLowerCase(caracter) == Character.toLowerCase(f.getName().charAt(0))){
                System.out.println(f.getName());
            }

        }
    }
}
