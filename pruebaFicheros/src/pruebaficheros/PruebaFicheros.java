package pruebaficheros;
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;
/**
 * clase para tratar de hacer funcionar la lectura y escritura de objetos
 * @author liken
 */
public class PruebaFicheros {
private static Scanner key = new Scanner(System.in);
private static File archivo = new File("c:/ficheros/personillas.obj");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean control = false;
        int selector = 0;
        // MENU
        do{
            try{
                System.out.println("menu");
                System.out.println("1. introducir persona");
                System.out.println("2. leer persona");
                System.out.println("0. salir");
                selector = key.nextInt();
                switch(selector){
                    case 1:
                        introPersona();
                        break;
                    case 2:
                        verTodos();
                        break;
                    case 0:
                        control = true;
                        break;
                    default:
                        System.out.println("opccion no valida");
                        break;
                }
            // caso de error en la introduccion    
            }catch(InputMismatchException in){
                System.out.println("error en la introduccion");
                key.nextLine();
            // caso de error sin tratar
            }catch(Exception ex){
                ex.printStackTrace();
                key.nextLine();
            }
        }while(!control);
    }
    public static void introPersona(){
        boolean control = false;
        Persona persona = new Persona();
        do{
            try{
                // introduccion del nombre
                do{
                    System.out.println("introduce el nombre");
                    persona.setNombre(key.next());
                    // se controla con una expresion regular
                }while(!persona.getNombre().matches("^[a-z A-Z á é í ó ú]*"));
                // introduccion de la edad
                do{
                    System.out.println("introduce la edad");
                    persona.setEdad(key.nextShort());
                    // control de la edad no menor a 0 ni mayor a 120
                }while(persona.getEdad() < 0 || persona.getEdad() > 120);
                // introduccion de la altura
                do{
                    System.out.println("introduce la altura en cm");
                    persona.setAltura( key.nextInt());
                    // control de la altura, si es menor a 50 o mayor a 250
                }while(persona.getAltura() < 50 || persona.getAltura() > 250);
                control = true;
            // control de errores
            }catch(InputMismatchException in){
                System.out.println("error de introduccion");
                key.nextLine();
            }catch(Exception ex){
                ex.printStackTrace();
                //key.nextLine;
            }
        }while(!control);
        preEscritura(persona);
    }
    /**
     * metodo que realiza las comprobciones previas a la escritura
     * @param persona 
     */
    private static void preEscritura(Persona persona){
        // en el caso que el fichero ya exista
        if(new File(archivo.getParent()).mkdirs())
            System.out.println("se ha creado el directorio");
        // comprobacion de si el fichero ya existe
        if(!archivo.exists()){
            // caso no exista
            noExiste(persona);
        }else{
            // caso si exista
            existe(persona);
        }
    }
    /**
     * metodo para la escritura del objeto si existe ya 
     * el fichero
     * @param persona 
     */
    private static void existe(Persona persona){
        try{
           OutputStream flujoSalida = new FileOutputStream(archivo,true);
           MiObjetoLector escritor = new MiObjetoLector(flujoSalida);
           escritor.writeObject(persona);
        }catch(IOException io){
            System.out.println("error de escritura");
            io.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    /**
     * metodo para la escritura del objeto en el caso que 
     * el fichero todavia no existiera
     * @param persona 
     */
    private static void noExiste(Persona persona){
        try{
           OutputStream flujoSalida = new FileOutputStream(archivo);
           ObjectOutputStream escritor = new ObjectOutputStream(flujoSalida);
           escritor.writeObject(persona);
        }catch(IOException io){
            System.out.println("error de escritura");
            io.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private static void verTodos(){
        if(archivo.exists()){
           try{
               FileInputStream flujoLectura = new FileInputStream(archivo);
               ObjectInputStream lector = new ObjectInputStream(flujoLectura);
               Persona aux = (Persona)lector.readObject();
               while(true){
                   System.out.println(aux.toString());
                   aux = (Persona)lector.readObject();
               }
           } catch(IOException io){
               System.out.println("Fin lectura");
               
           }catch(Exception ex){
               ex.printStackTrace();
           }
        }else
            System.out.println("no existe el archivo");
    }
}
