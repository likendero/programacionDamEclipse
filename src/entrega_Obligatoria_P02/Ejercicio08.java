
package entrega_Obligatoria_P02;

/**
 *
 * @author liken
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        String actual="";
        for (int i = 1000; i <= 9999; i++) {
            actual=Integer.toString(i);
            if(Integer.parseInt(actual.substring(0,1))+Integer.parseInt(actual.substring(2, 3))==
                    Integer.parseInt(actual.substring(1,2))+Integer.parseInt(actual.substring(3,4))){
                System.out.println("actual: "+actual+": "+( Integer.parseInt(actual.substring(0,1))+
                        Integer.parseInt(actual.substring(2, 3)))+"<-->"+
                        (Integer.parseInt(actual.substring(1,2))+Integer.parseInt(actual.substring(3,4)) ));
            }
        }
    }
}
