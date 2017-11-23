
package entrega_Obligatoria_P02;
    import java.util.Scanner;
/**
 *
 * @author liken
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        // variables
        double a,b,c;
        a=0;
        b=0;
        c=0;
        /*
        el programa pedira los datos y al final dara los reasultados, en primer 
        lugar si es una ecuacion cuadraica y despues hara el calculo
        */
        System.out.println("este programa resuelve ecuaciones de segundo grado del tipo"
                + "ax^2+bx+c=0");
        /*
        en esta parte se hace la introduccion de los datos
        */
        System.out.println("introduce un valor para a");
        a=key.nextDouble();
        System.out.println("introduce un valor para b");
        b=key.nextDouble();
        System.out.println("introduce un valor para c");
        c=key.nextDouble();
        //comprobacion de la ecuacion,(que ni a ni b sean 0)
        if(a>0 || a<0 || b>0 || b<0){
            //construccion de la salida para ver la ecuacion introdcida
            System.out.print("la ecuacion es ");
            // no importa si a es negativa
            System.out.print(a+"x^2");
            //si b es negativa para que se vea correctamente y no como +-b
            if(b<0) System.out.print(b+"x");
            else System.out.print("+"+b+"x");
            //lo mismo para c
            if(c<0)System.out.print(c);
            else System.out.print("+"+c);
            //una vez impreso se muestra el resultado de la operacion
            System.out.println("");
            System.out.println("x vale:"+((-b+Math.sqrt(Math.pow(b, 2))-4*a*c)/(2*a))
            +" x2 vale: "+((-b-Math.sqrt(Math.pow(b, 2))-4*a*c)/(2*a)));
            //en caso de que a y b sean 0
        }else System.out.println("la ecuacion no es cuadratica");
        
   }
}
