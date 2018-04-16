package binarios;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PrincipalAlumnos {
    private static Scanner key = new Scanner(System.in);
    public static void main(String[] args){
        int rep;
        boolean control = false;
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
            try {
                do {
                    System.out.println("introduce el nombre del alumno");
                    alumno.setNombre(key.next());
                } while ();
            } catch (InputMismatchException in) {
                System.out.println("ERROR EN LA INTRODUCCION");
                key.nextLine();
                i--;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
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