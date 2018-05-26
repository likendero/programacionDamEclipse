package archivosObjetos;
import java.io.*;
import java.util.GregorianCalendar;
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
                        introducirLibro();
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
            catch(IncorrectDataException da){
                System.out.println(da.getMessage());
            }
            catch(Exception ex){
                ex.printStackTrace();
                key.nextLine();
            }
        }while(!control);
    }

    /**
     * metodo que sirve para introducir un objeto del tipo libro en
     */
    private static void introducirLibro()throws IncorrectDataException{
        Libros libro = new Libros();
        // TODO la parte correspondiente al libro
        // ISBN
        System.out.println("introduce isbn");
        libro.setIsbn(key.next());
        if(true){
            throw new IncorrectDataException("ERROR en el ISBN del libro");
        }

    }

    /**
     * metodo que sirve para introducir una nueva revista
     */
    private static void introducirRevista(){
        // TODO la parte correspondiente a la Revista
    }

    /**
     * metodo que sirve para crear una publicacion
     */
    private static Publicaciones crearPublicacion() throws IncorrectDataException{
        //creacion de la instancia contenedor
        Publicaciones publicacion = new Publicaciones();
        // creacion del contenedor de la fecha
        int anno, dia, mes;
        // introduccion del titulo
        System.out.println("introduce el titulo de la publicacion");
        publicacion.setTitulo(key.nextLine());

        // introduccion del editor
        System.out.println("introduce el editor");
        publicacion.setEditor(key.nextLine());

        // introduccion de la fecha
        System.out.println("introduce el anno");
        anno = key.nextInt();
        System.out.println("introduce el mes");
        mes = key.nextInt();
        System.out.println("introduce el dia");
        dia = key.nextInt();
<<<<<<< HEAD
        GregorianCalendar calen = new GregorianCalendar(anno,mes,dia);
        


=======
        // instanciacion del calendario
        GregorianCalendar calendario = new GregorianCalendar(anno,mes,dia);
        // agregacion del calendario
        publicacion.setFecha(calendario);
        return publicacion;
>>>>>>> master


    }
    private static boolean valCalendario(int anno, int mes, int dia) {
    	
    	if() {
    		
    	}
    	
    }

}











