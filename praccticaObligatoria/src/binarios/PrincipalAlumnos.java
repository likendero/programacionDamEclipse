package binarios;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PrincipalAlumnos {
    private static Scanner key = new Scanner(System.in);
    public static void main(String[] args){
        int rep = 1;
        boolean control = false;
        File archivo = new File("registroAlumnos.bin");
        // introduccion numero de repeticiones
        do
            try {
                System.out.println("introduce el numero de alumnos");
                rep = key.nextInt();
                // control para que halla almenos una repeticion
                if(rep > 0)
                    control = true;
            } catch (InputMismatchException in) {
                System.out.println("ERROR EN LA INTRODUCCION");
                key.nextLine();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        while(!control);
        // introduccion de datos y escritura de alumnos
        for(int i = 0 ; i < rep ; i++) {
            Alumnos alumno = new Alumnos();
            boolean bandera = false;
            if(i > 0) bandera = true;
            try {
                // introduccion del nombre

                do {
                    System.out.println("introduce el nombre del alumno");
                    alumno.setNombre(key.next());
                    //se controla que no tenga numeros en el nombre (ser rey no lo cambia)
                } while (!alumno.getNombre().matches("^[a-z A-Z]+"));
                key.nextLine();

                //introduccion de la direccion
                System.out.println("introduce la direccion del alumno");
                alumno.setDireccion(key.nextLine());

                // introduccion de la edad
                do{
                    System.out.println("introduce la edad del alumno (menor a 30)");
                    alumno.setEdad(key.nextShort());
                }while(alumno.getEdad() == 0);

                // introduccion de la nota media
                do{
                    System.out.println("introduce la nota media del alumno");
                    alumno.setNotaMedia(key.nextShort());
                }while(alumno.getNotaMedia() == 0);

                // ESCRITURA /////////
                // creacion de flujo
                try( FileOutputStream salida = new FileOutputStream(archivo,bandera)) {
                    DataOutputStream formato = new DataOutputStream(salida);
                    // nombre
                    formato.writeUTF(alumno.getNombre());
                    // direccion
                    formato.writeUTF(alumno.getDireccion());
                    // edad
                    formato.writeShort(alumno.getEdad());
                    // nota media
                    formato.writeShort(alumno.getNotaMedia());

                    formato.close();
                    salida.close();
                }catch(IOException io){
                    System.out.println("ERROR EN LA ESCRITURA");
                }

            } catch (InputMismatchException in) {
                System.out.println("ERROR EN LA INTRODUCCION");
                key.nextLine();
                i--;
            } catch (Exception ex) {
                ex.printStackTrace();
                key.nextLine();
                i--;
            }
        }// for
        lecturaAlumno(archivo);
    }

    /**
     * metodo que sirve para leer la informacion de los alumnos de un archivo
     * @param archivo fichero a leer
     */
    public static void lecturaAlumno(File archivo) {

        try (FileInputStream flujo = new FileInputStream(archivo)) {
            // formateo de la saldida
            DataInputStream formato = new DataInputStream(flujo);
            while (true) {
                // lectura del nombre
                System.out.println("nombre del alumno: " + formato.readUTF());
                // direccion
                System.out.println("la direccion del alumno es: " + formato.readUTF());
                // edad
                System.out.println("la edad del alumnos es: " + formato.readShort());
                // nota media
                System.out.println("la nota media del alumno es: " + formato.readShort());
            }

        }catch(IOException io){
            System.out.println("fin lectura");
        }catch(NullPointerException nu){
            System.out.println("NULOOOOOO");// no tiene razones para existir
        }/*catch(FileNotFoundException nf){
            System.out.println("el archivo no se encuntra");
        }*/catch(Exception ex){
            ex.printStackTrace();
        }

    }

}

/**
 * clase que sirve para almacenar la informacion de los alumnos y validarla
 */
class Alumnos{

    private String nombre,direccion;
    private short edad, notaMedia;

    /**
     * constructor por defecto
     */
    public Alumnos() {
        super();
        nombre = null;
        direccion = null;
        edad = (short)0;
        notaMedia = 0;
    }

    /**
     * constructor parametrizado
     * @param nombre del alumno
     * @param direccion del alumno
     * @param edad del alumno
     * @param notaMedia del alumno
     */
    public Alumnos(String nombre, String direccion, short edad, short notaMedia) {
        if(nombre.matches("^[a-z A-Z]*"))
            this.nombre = nombre;
        this.direccion = direccion;
        if(edad > 0 && edad < 30 ) {
            this.edad = edad;
        }
        else{
            this.edad = 0;
        }
        if(notaMedia > 0 && notaMedia <= 10 )
            this.notaMedia = notaMedia;

    }
    // GETTERS SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.matches("^[a-z A-Z]*"))
            this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        if(edad > 0 && edad < 30 )
            this.edad = edad;
    }

    public short getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(short notaMedia) {
        if(notaMedia > 0 && notaMedia <= 10 )
            this.notaMedia = notaMedia;
    }
    ///////////////////////////////////////////////////////

}