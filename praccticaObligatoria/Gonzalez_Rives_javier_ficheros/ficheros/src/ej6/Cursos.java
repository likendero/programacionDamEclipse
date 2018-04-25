package ej6;

/**
 * clase que sirve para definir Cursos con sus atributos
 * @author Javier Gonzalez Rives
 */
public class Cursos {
    private int orden;
    private String nombre;
    private double precio;

    /**
     * constructor por defecto
     */
    public Cursos(int orden){
        super();
        this.orden = orden;
        this.nombre = "";
        this.precio = 1.0;
    }
    public Cursos(int orden, String nombre, double precio){
        super();
        // hay un maximo de 15 elementos sino se indica su invalidez con 0

            this.orden = orden;

            orden = 0;
        // comprueba el nombre
        if(nombre.length() <= 15){
            this.nombre = nombre;
            while(this.nombre.length() < 15){
                this.nombre += " ";
            }
        }
        else nombre = null;
        // conprol que el precio no sea negativo
        if(precio > 0){
            this.precio = precio;
        }
        else
            this.precio = 0;
    }

    /**
     * metodo que comprueba si los valores son todos  correctos
     * para una introduccion
     * @return true si son correcto false cualquier otro caso
     */
    public boolean isOk(){
        // se comprueba que no coincide con ninguno de los valores en caso de no ser valido
        if(nombre != null || nombre.length() < 15 && precio != 0){
            return true;
        }else
            return false;
    }
    // getters setters
    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    ////////////////////////////////////////////////////////////
}
