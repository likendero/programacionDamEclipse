
package temaTres;

/**
 *
 * @author diurno
 */
public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;
    public Triangulo(){
        super();
        this.lado1=0;
        this.lado2=0;
        this.lado3=0;
    }
    public Triangulo(int lado1,int lado2,int lado3){
        super();
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }
    public Triangulo(Triangulo triangulo){
        super();
        this.lado1=triangulo.getLado1();
        this.lado2=triangulo.getLado2();
        this.lado3=triangulo.getLado3();
    }
    public int area(){
        int semiperimetro;
        semiperimetro=(this.getLado1()+this.getLado2()+this.getLado3())/2;
        return (int)Math.sqrt(semiperimetro*(semiperimetro-this.getLado1())
                *(semiperimetro-this.getLado2())*(semiperimetro-this.getLado3()));
    }
    public void areaVoid(){
        double semiperimetro;
        semiperimetro=(this.getLado1()+this.getLado2()+this.getLado3())/2;
        System.out.println("area = "+Math.sqrt(semiperimetro*(semiperimetro-this.getLado1())
                *(semiperimetro-this.getLado2())*(semiperimetro-this.getLado3())));
    }
    public void area(int a,int b,int c){
        double semiperimetro;
    }
    @Override
    public String toString(){
        return "triangulo: "+this.getLado1()+", "+this.getLado2()+", "+this.getLado3();
    }
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    
}
