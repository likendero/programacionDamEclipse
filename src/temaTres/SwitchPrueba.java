
package temaTres;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
public class SwitchPrueba {
    public static void main(String[] args) {
        try(Scanner key=new Scanner(System.in)){
//            ejemploUno(key);
//            ejemploDos(key);
            ejemploTres(key);
//            ejemploCuatro(key);
            key.close();
        }       
    }
    public static void ejemploUno(Scanner key){
        // variables
        char caracter;
        //entrada
        caracter= key.next().charAt(0);
        //salida
        switch(caracter){
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                System.out.println("es vocal");
                break;
            default:
                System.out.println("no es una vocal");
                break;
        }
    }
    public static void ejemploDos(Scanner key){
        //variables
        int nota;
        //entrada
        System.out.println("introduce una nota");
        nota=key.nextInt();
        //salida
        switch(nota){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("suspenso");
                break;
            case 5:
                System.out.println("suficiente");
                break;
            case 6: 
                System.out.println("bien");
                break;
            case 7:
            case 8:
                System.out.println("notable");
                break;
            case 9:
            case 10:
                System.out.println("sobresaliente");
                break;
            default:
                System.out.println("nota no valida");
                break;
        
        }   
    }    
    public static void ejemploTres(Scanner key){
        //variable
        int mes,agno;
        //entrada
        System.out.println("introduce el mes numericamente");
        mes=key.nextInt();
        System.out.println("intoduce el año");
        agno=key.nextInt();
        //salida
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 dias");
                break;
            case 2:
                System.out.println(agno%400==0 || agno%4==0 && agno%100!=0?""
                        + "29 dias":"28 dias");
                break;
            default:
                System.out.println("numero incorrecto de mes");
                break;
        }
    }
    public static void ejemploCuatro(Scanner key){
        //variables
        int mes;
        //entrada
        System.out.println("introduce mes de forma numerica");
        mes=key.nextInt();
        //salida
        switch(mes){
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
                break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("ocnubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");
                break;
            default:
                System.out.println("mes inexistente");
                break;  
        }
    }
}
