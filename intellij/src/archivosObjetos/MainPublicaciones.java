package archivosObjetos;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * clase que guarda registros de publicaciones
 * @author Javier Gonzalez Rives
 */
public class MainPublicaciones {
    // Almacen de objetos

    private static Scanner key = new Scanner(System.in);
    /**
     * main
     * @param args
     */
    public static void main(String[] args){
        int introduccion;
        boolean control =  false;
        do {
            try {
                // menu para seleccionar si , intro , ver o fin
                System.out.println("MENU");
                System.out.println("1. introducir nueva publicacion");
                System.out.println("2. mostrar publicaciones");
                System.out.println("0. salir del programa");
                introduccion = key.nextInt();
                switch (introduccion){
                    case 1:
                        menuIntroduccion();
                        break;
                    case 2:
                        break;
                    // FIN DEL PROGRAMA
                    case 0:
                        control = true;
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                }
            }
            // control de teclado
            catch(InputMismatchException in){
                System.out.println("error en la introduccion");
                key.nextLine();
            }
            // control general
            catch (Exception ex){
                ex.printStackTrace();
                key.nextLine();
            }
        }while(!control);
    }

    /**
     * metodo que sirve para mostrar un menu en el que seleccionar
     * que tipo de publicacion se trata
     */
    private static void menuIntroduccion(){
        int introduccion;
        boolean control = false;
        do{
            try{
                System.out.println("1. libro 2. revista 3. volver");
                introduccion = key.nextInt();
                switch (introduccion){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                }
            }
            catch(InputMismatchException in){
                System.out.println("entrada incorrecta");
                key.nextLine();
            }
            catch(Exception ex){
                ex.printStackTrace();
                key.nextLine();
            }
        }while(!control);
    }

    /**
     * metodo que sirve para introducir un objeto del tipo libre en
     */
    private static void introducirLibro(){
        Libros libro = new Libros();
        try{
            System.out.println("introduce isbn");
            libro.setIsbn(key.next());
        }
        catch(InputMismatchException){

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
