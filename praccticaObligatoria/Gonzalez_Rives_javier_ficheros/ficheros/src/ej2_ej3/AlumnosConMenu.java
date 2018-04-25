package ej2_ej3;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * clase que sirve para guardar la informacion de alumnos en un fichero
 * despues rescatarla y ver:
 * - nota media del curso
 * - alumnos con mejor nota
 * - alumnos con peor nota
 * - Fin del programa
 * @author Javier Gonzalez Rives
 */
public class AlumnosConMenu {
    private static  Scanner key = new Scanner(System.in); // Scanner lector
    private static  ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>(); // Almacen de alumnos en memoria
    /**
     * MAIN
     * @param args
     */
    public static void main(String[] args){
        int introduccion = 0;
        boolean control = false;
        File archivo = PrincipalAlumnos.cogerArchivo();
        if(archivo.exists()) {
            cargarAlumnos(archivo);
            do
                try {

                    // menu
                    System.out.println("introduce el la opcion deseada");
                    System.out.println("1. mostrar media del curso");
                    System.out.println("2. alumnos con mejor nota");
                    System.out.println("3. alumnos con peor nota");
                    System.out.println("0. fin del programa");
                    // intro
                    introduccion = key.nextInt();

                    // switch
                    switch (introduccion) {
                        // media del curso
                        case 1:
                            mediaCurso();
                            break;
                        // alumnos con mejor nota
                        case 2:
                            mayorNota();
                            break;
                        // alumnos con peor nota
                        case 3:
                            menorNota();
                            break;
                        case 0:
                            control = true;
                            break;
                        default:
                            System.out.println("opcion no valida");
                            break;
                    }
                } catch (InputMismatchException in) {
                    System.out.println("error en la introduccion");
                    key.nextLine();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            while (!control);
        }else
            System.out.println("el archivo no existe");
    }

    /**
     * metodo que sirve para cargar el registro de los alumnos en memoria
     * @param archivo que contiene el archivo a cargar
     */
    public static void cargarAlumnos(File archivo){
        Alumnos alumno = null;
        try(FileInputStream flujo = new FileInputStream(archivo)){
            DataInputStream formateo = new DataInputStream(flujo);
            while(true){
                // cogiendo la informacion de los alumnos
                alumno = new Alumnos(formateo.readUTF(),formateo.readUTF(),formateo.readShort(),formateo.readShort());
                // cargando el alumno en el arrayList
                alumnos.add(alumno);
            }
        }catch(IOException io){
            System.out.println("alumnos cargados");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * metodo que saca por pantalla la nota media del curso
     */
    public static void mediaCurso(){
        // guardar la suma de las notas
        int sumatoria = 0;
        // guardar el numero de alumnos sumados(se podria usar el numero de elementos del ArrayList)
        int contador = 0;
        // recorrido sobre los alumnos
        for(Alumnos al: alumnos){
            contador++;
            sumatoria += al.getNotaMedia();
        }
        // salida por pantalla
        System.out.printf("la nota media es %d\n",(sumatoria/contador));
    }

    /**
     * metodo que saca por pantalla el alumno/os con la nota mas alta
     */
    public static void mayorNota(){
        // variable para controlar la mayor nota
        short notaDominante = Short.MIN_VALUE;
        // lectura de las notas
        for(Alumnos al: alumnos) {
            // comparacion de nota actual
            if(al.getNotaMedia() > notaDominante)
                notaDominante = al.getNotaMedia();

        }
        System.out.println("alumnos con las notas mas altas");
        // salida de las notas mas altas
        for(Alumnos al: alumnos){
            if(al.getNotaMedia() ==  notaDominante)
                System.out.printf("nombre: %s nota: %d \n2",al.getNombre(),al.getNotaMedia());
        }
    }

    /**
     * metodo que saca por pantalla el alumno con la menor nota
     */
    public static void menorNota(){
        // variable para controlar la mayor nota
        short notaDominante = Short.MAX_VALUE;
        // lectura de las notas
        for(Alumnos al: alumnos) {
            // comparacion de nota actual
            if(al.getNotaMedia() < notaDominante)
                notaDominante = al.getNotaMedia();

        }
        System.out.println("alumnos con las notas mas bajas");
        // salida de las notas mas altas
        for(Alumnos al: alumnos){
            if(al.getNotaMedia() ==  notaDominante)
                System.out.printf("nombre: %s nota: %d \n2",al.getNombre(),al.getNotaMedia());
        }
    }

}
