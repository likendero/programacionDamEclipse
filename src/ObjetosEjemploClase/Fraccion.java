
package ObjetosEjemploClase;

/**
 *
 * @author likendero
 */
public class Fraccion {
    private int denominador;
    private int numerador;
    //constructores
    public Fraccion(){
        super();
        this.denominador=1;
        this.numerador=1;
    }
    public Fraccion(int numerador,int denominador){
        super();
        this.numerador=numerador;
        this.denominador=denominador;
    }
    public Fraccion(Fraccion fraccion2){
        super();
        this.numerador=fraccion2.numerador;
        this.denominador=fraccion2.denominador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    @Override
    public String toString(){
        return "numerador "+numerador+" denominador "+denominador;
    }
    /**
     * suma a la fraccion instanciada otra fraccion
     * @param fraccion2 fracción que se va  a sumar
     */
    public void suma (Fraccion fraccion2){
        if(this.getDenominador()==fraccion2.getDenominador()){
            this.setNumerador(fraccion2.getNumerador()+this.getNumerador());
        }
        this.simplificar();
    }
    /**
     * metodo que resta a la instancia otra Fraccion
     * @param fraccion2 fraccion que resta
     */
    public void resta (Fraccion fraccion2){
        if(this.getDenominador()==fraccion2.getDenominador()){
            this.setNumerador(fraccion2.getNumerador()-this.getNumerador());
        }
        this.simplificar();
    }
    /**
     * metodo que multiplica la instancia por otra fraccion
     * @param fraccion2 fraccion que multiplica
     */
    public void multiplicacion (Fraccion fraccion2){
        this.setNumerador(fraccion2.getNumerador()*this.getNumerador());
        this.setDenominador(fraccion2.getDenominador()*this.getDenominador());
        this.simplificar();
    }
    /**
     * divide la Fraccion instanciada entre otra Fraccion, si el numerador es 0
     * es equivalente a 0, por eso la Fraccion divisora no puede tener el numerador==0
     * @param fraccion2 fraccion por la que se va a dividir
     */
    public void division (Fraccion fraccion2){
        //no se puede dividir entre 0
        if(fraccion2.getNumerador()!=0){
        this.setNumerador(fraccion2.getDenominador()*this.getNumerador());
        this.setDenominador(fraccion2.getNumerador()*this.getDenominador());
        }
        this.simplificar();
    }
    /**
     * metodo que simplifica la Fraccion si es posible
     */
    public void simplificar(){
        // bucle que recorre los numeros posibles para simplimficar
        for(int i=10; i>1;i--){
            //en el caso de ser divisible por numerador y denominador simplifica
            while(this.getDenominador()%i==0 && this.getNumerador()%i==0 
                    && this.getDenominador()/i>0) {
                this.setDenominador(this.getDenominador()/i);
                this.setNumerador(this.getNumerador()/i);
            }
        }
    }
}
