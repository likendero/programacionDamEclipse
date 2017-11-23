
package entrega_Obligatoria_P02;

/**
 *
 * @author liken
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        int actual=0;
        // un bucle for que controla por que numero se encuentra el programa
        for(int i=1900;i<=2000;i++){
            actual=i;
            System.out.println(i+"###############################################################");
            //el segundo bucle lleva la cuenta del numero por el que se divide
            for (int j = 2; actual>1 ; j++) {
                //el while realiza las operaciones 
                    while(actual%j==0 && actual!=0){
                        System.out.println(actual+" / "+j+" = "+(actual/j));
                        actual=actual/j;
                    }
            }
        }
    }
}
