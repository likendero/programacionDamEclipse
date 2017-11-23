
package entrega_Obligatoria_P02;
    import java.util.Scanner;
/**
 *
 * @author liken
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String num="";
        /*
        a traves de un buble se valida que el numero es positivo
        */
        do{
            System.out.println("introduce un numero positivo");
            num=key.nextLine();
        }while(Integer.parseInt(num)<0);
        /*
        con un bucle for que se ejecuta tantas veces como caracteres como tenga el 
        String
        */
        for(int i=num.length();i>=0;i--){
            for(int j=0;j<i;j++){
                
                System.out.print(num.substring(j, j+1)+"    ");
                
            }
            System.out.println("");
        }
        System.out.println("fin del programa");
    }
    
    
}
