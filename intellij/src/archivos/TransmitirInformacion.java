package archivos;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * clase que sirve para transmitir la informacion de un archivo
 * a otro
 */
public class TransmitirInformacion {
    private static Scanner key = new Scanner(System.in);
    /**
     * main
     * @param args
     */
    public static void main(String[] args){
        String nombreDirectorio;
        boolean control = false;
        File archivo = null, archivo2 =  null;
        // entrada y verificacion de la ruta introducida
        try{
            do{
                System.out.println("introduce el directorio del archivo");
                nombreDirectorio = key.next();
                archivo = new File(nombreDirectorio);
                if(archivo.isFile()) control = true;
            }while(!control);
        }
        // control teclado
        catch(InputMismatchException in){
            System.out.println("error en la introduccion por teclado");
            key.nextLine();
        }
        // control general
        catch (Exception ex){
            ex.printStackTrace();
            key.nextLine();
        }
        // reseteo control
        control = false;
        try{
            do{
                System.out.println("introduce el directorio del segundo archivo");
                nombreDirectorio = key.next();
                archivo2 = new File(nombreDirectorio);
                if(archivo2.isFile()) control = true;
            }while(!control);
        }
        // control teclado
        catch(InputMismatchException in){
            System.out.println("error en la introduccion por teclado");
            key.nextLine();
        }
        // control general
        catch (Exception ex){
            ex.printStackTrace();
            key.nextLine();
        }
        ///////////////////////////////////////////////////////////////////////////
        //lectura y escritura                                                    //
        ///////////////////////////////////////////////////////////////////////////
        traspaso(archivo,archivo2);
    }

    /**
     * metodo que sirve para pasar la informacion de un archivo de texto a otro
     * @param archivo1 archivo a copiar
     * @param archivo2 archivo a pegar
     */
    public static void traspaso(File archivo1,File archivo2){
        String intermedio = "";
        // entrada al intermedio
        try(FileReader primerFlujo = new FileReader(archivo1)){
            // flujo creado con embudo
            BufferedReader auxiliarEntrada = new BufferedReader(primerFlujo);
            // bucle de lectura
            while(true){
                intermedio.concat(auxiliarEntrada.readLine());
            }
        }
        catch(NullPointerException nu){
            System.out.println("fin de la lectura");
        }
        catch(IOException io){
            System.out.println(io.getMessage());
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        // salida de intermedio
        try(FileOutputStream segundoFlujo = new FileOutputStream(archivo2)){
            PrintStream auxiliarSalida = new PrintStream(segundoFlujo);
            // escritura final
            auxiliarSalida.print(intermedio);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
