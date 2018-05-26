package ej6;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * EJERCICIO NO ACABADO
 * clase que crea un fichero con los cursos de una academia
 * @author Javier Gonzalez Rives
 */
public class mainCursos {
    private static  Scanner key = new Scanner(System.in);
    private static File archivo = new File("c:/ficheros","cursos.dat");
    private static RandomAccessFile acceso = null;
    /**
     * main donde se encuentra el menu principal
     * @param args
     */
    public static void main(String[] args){
        boolean control = false;
        int introduccion = 0;
        do{
            try{
                // creacion del directorio de la entrega si no existe
                File directroio = new File("c:/ficheros");
                if(!directroio.exists())
                    if(directroio.mkdirs())
                        System.out.println("se ha creado el directorio");
                acceso = new RandomAccessFile(archivo,"rw");

                ////////////////////////////////////////
                // MENU
                System.out.println("menu");
                System.out.println("1. crear Fichero");
                System.out.println("2. annadir cursos");
                System.out.println("3. cosnulta");
                System.out.println("4.borrado");
                System.out.println("5. compactar fichero");
                System.out.println("6. salir programa");
                // introduccion de la opcion
                introduccion = key.nextInt();

                // selector
                switch (introduccion){
                    case 1:
                        if(!archivo.exists()){
                            introducirCursos();
                        }else {
                            System.out.println("ya ha sido usado");
                        }
                        break;
                    case 2:
                        if(!archivo.exists()){
                            System.out.println("entra primero al apartado 1");
                        }
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        control = true;
                        acceso.close();
                        break;
                    default:
                        System.out.println("opcion no valida");

                        break;
                }
            }catch(InputMismatchException in){
                System.out.println("error en la introduccion por teclado");
                key.nextLine();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }while(!control);
    }

    /**
     * metodo que sirve para crear el fichero con 15 cursos
     * (en este caso se ha hecho para poner nombres genericos)
     */
    private static void introducirCursos(){
        Cursos curso[] = new Cursos[15];
        // creacion de cursos
        for (int i = 0; i < curso.length ; i++){
            curso[i] = new Cursos(i+1,"curso" + (i+1),(double) i +1);
        }
        // introduccion cursos
        for(int i = 0; i < curso.length ; i++ ){
            escribirCurso(curso[i]);
        }
    }
    private static void escribirCurso(Cursos curso){
        try {
            acceso.seek(acceso.length());
            // escritura del nombre
            acceso.writeUTF(curso.getNombre());
            // escritura del precio
            acceso.writeDouble(curso.getPrecio());
            // escritura del orden
            acceso.write(curso.getOrden());
        }catch(IOException io){
            System.out.println("error escritura");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
