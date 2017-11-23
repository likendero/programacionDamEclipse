
package entrega_Obligatoria_P02;
    import java.util.Scanner;
/**
 *
 * @author liken
 */
public class Ejercicio01 {
    /*
    este programa lee un numero por teclado y dice el numero de digitos que tiene,
    ademas lo reescribe empezando por la unidad
    */
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        //variables
        int num;
        //entrada
        System.out.println("introduce un numero entero");
        num=key.nextInt();
        
        if (num>=0){
            System.out.println("el numero de cifras es "+ Integer.toString(num).length());
            for(int i=Integer.toString(num).length();i>0;i--){
                System.out.print(Integer.toString(num).substring(i-1, i)+" ");
            }
        }else{
            System.out.println("el numero de cifras es "+ (Integer.toString(num).length()-1));
                for(int i=Integer.toString(num).length();i>1;i--){
                    System.out.print(Integer.toString(num).substring(i-1,i)+" ");
                }
        }
        System.out.println("");
        key.close();
        
        
    }
}
