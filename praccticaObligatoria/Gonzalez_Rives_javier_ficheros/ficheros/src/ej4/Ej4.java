package ej4;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * clase que sirve para copiar la informacion de un fichero de ej4 aportado por el usuario
 * a otro (tambien aportado por el)
 * @author Javier Gonzalez Rives
 */
public class Ej4 {
    private static Scanner key = new Scanner(System.in);
    private static File archivoCopiar = null;
    private static File archivoPegado = null;

    public static void main(String[] args){
        boolean control = false;
        do {
            try{
                // introduccion del directorio a copiar
                do{
                    System.out.println("introduce el directorio del archivo");
                    archivoCopiar = new File(key.next());
                    key.nextLine();
                    if(!archivoCopiar.exists()){
                        System.out.println("el archivo no existe, por favor infroduce un directorio valido");
                    }
                    // fin del bucle
                    else
                        control = true;
                }while(!control);
                control = false;
                // introduccion del directorio a pegar (me cae mal)
                do {
                    System.out.println("introduce el directorio a pegar");
                    archivoPegado = new File(key.next());
                    key.nextLine();
                    // en el caso que sea un directorio
                    /*if (archivoPegado.isDirectory()) {
                        if(!archivoPegado.exists()) {
                            archivoPegado.mkdirs();
                            System.out.println("el directorio se ha creado");
                        }
                        control = true;
                    }*/
                    if(!archivoPegado.exists()) {
                            if(archivoPegado.mkdirs())
                                System.out.println("directorio creado");
                    }
                    control = true;
                }while(!control);
                // resteo control
                control = false;
                // intro nombre del archivo
                do{
                    System.out.println("introduce el nombre del archivo a pegar sin extension");
                    String nombre = key.next();
                    key.nextLine();
                    File aux  = new File(nombre.concat(".txt"));
                    archivoPegado = new File(archivoPegado,nombre.concat(".txt"));
                    control = true;

                }while(!control);
                // en el caso de error en la intro por teclado
            }catch(InputMismatchException in){
                System.out.println("Error en la introduccion");
                key.nextLine();
                // errores no controlados
            }catch(Exception ex){
                ex.printStackTrace();
            }

        }while(!control);
        copiado(archivoCopiar,archivoPegado);

    }

    /**
     * metodo que copia el ej4 de un archivo de ej4 a otro
     * @param archivo1 archivo copiado
     * @param archivo2 archivo pegado
     */
    public static void copiado(File archivo1, File archivo2){
        // flujo de lectura
        try(FileReader lector = new FileReader(archivo1)){
            // buffer de lectura
            BufferedReader bufLector = new BufferedReader(lector);
            // flujo de escritura
            FileWriter escritor = new FileWriter(archivo2);
            // buffer de escritura
            PrintWriter prin = new PrintWriter(escritor);
            String intermedio = bufLector.readLine();
            while(intermedio != null){
                prin.println(intermedio);
                intermedio = bufLector.readLine();
            }
            prin.close();
            bufLector.close();
        }catch(FileNotFoundException fi){
            System.out.println("archivo no encontrado");
        }catch(IOException io){
            System.out.println("error en la lectura/escritura");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
