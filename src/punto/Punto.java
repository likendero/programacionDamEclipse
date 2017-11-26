
package punto;
/*
 * cuadranteActual();
 * 
 */
/**
 * clase que establece las coordenadas x e y de un punto y opera con ellas
 * @author diurno
 */
public class Punto {
    private int x;
    private int y;
    /**
     * cnstructor por defecto, establece x e y a 0
     */
    public Punto(){
        super();
        this.x=0;
        this.y=0;
    }
    /**
     * Constructor de clase, establece todos los atributos
     * @param x valor de la coordenada del punto en x
     * @param y valor de la coordenada del punto en y
     */
    public Punto(int x, int y){
        super();
        this.x=x;
        this.y=y;
    }
    /**
     * Constructor de copia, coge los atributos de otro punto
     * @param punto2 punto a copiar
     */
    public Punto(Punto punto2){
        super();
        this.x=punto2.x;
        this.y=punto2.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString(){
        return "("+this.getX()+","+this.getY()+")";
    }
    /**
     * clase que compara dos puntos para saber si son el mismo tanto
     * por su espacio en memoria como por sus parametros
     * @param punto2 punto con que comparar
     * @return verdadero si son iguales falso si no lo son
     */
    public boolean equal(Punto punto2) {
    	if(this==punto2)
    		return true;
    	else if (this.getX()== punto2.getX() && this.getY()==punto2.getY())
    		return true;
    	else return false;
    }
    /**
     * calcula la distancia entre dos puntos 
     * @param punto2 punto a donde se calcula la distancia
     * @return distancia con valor real
     */
    public double distanciaPunto(Punto punto2){
        return Math.pow(Math.pow((punto2.getX()-this.getX()),2)+
                Math.pow((punto2.getY()-this.getY()), 2),(1.0/2.0) );
    }
    /**
     * calcula el punto medio entre dos puntos
     * @param punto2 segundo punto
     * @return un nuevo punto, el puto medio
     */
    public Punto puntoMedio(Punto punto2){
        Punto medio=new Punto();
        medio.setX( (this.getX()+punto2.getX())/2 );
        medio.setY((this.getX()+punto2.getX())/2);
        return medio;
    }
    /**
     * dice en que cuadrante esta el punto
     * @return una cadena indicando el cuadrante
     */
    public String cuadranteAcrual() {
    	if (this.getX()<=0) {
			if(this.getY()<0) {
				return "tercer cuadrante";
			}else return "segundo cuadrante";
		}else {
			if(this.getY()<0) {
				return "cuarto cuadrante";
			}else return "primer cuadrante";
		}
    }
}
