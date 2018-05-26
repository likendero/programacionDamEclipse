package pruebaficheros;

import java.io.Serializable;

/**
 *  clase persona con atributos propios de una persona 
 *   y sus metodos para acceder
 * @author liken
 */
public class Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    String nombre;
    short edad;
    int altura;
    /**
     * cosntructor por defecto
     */
    public Persona() {
        super();
    }

    public Persona(String nombre, short edad, short altura) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    // GETTERS SETTERS//////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    ////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + '}';
    }
    
}
