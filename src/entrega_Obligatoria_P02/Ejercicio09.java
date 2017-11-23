
package entrega_Obligatoria_P02;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        //variables para almacenar todos los datos
        int dia,mes ,agno;
        dia=0;
        mes=0;
        agno=0;
        /*
        este programa indica si una fecha es correcta, en primer lugar el año
        tiene que ser mayor a 1800, despues se comprobara el dia y el mes
        */
        System.out.println("este programa indica si una fecha es correcta siendo "
                + "el año mayor a 1800");
        System.out.println("introduce el año");
        agno=key.nextInt();
        System.out.println("Introduce el mes");
        mes=key.nextInt();
        System.out.println("introduce el dia");
        dia=key.nextInt();
        //comprobacion del año
        if (agno>=1800) {
            //comprobacion del mes
            if(mes<=12 && mes>0){
                switch(mes){
                    //comprobacion dias meses de 31
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if(dia<=31 && dia>0)
                            System.out.println("fecha correcta");
                        else System.out.println("dia incorrecto");
                        break;
                    //comprobacion dias meses de 30
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (dia<=30 && dia>0) {
                            System.out.println("fecha correcta");
                        }else System.out.println("dia incorrecto");
                        break;
                    //comprobacion dias febrero
                    case 2:
                        //comprobacion bisiesto
                        if (agno%400==0 || agno%4==0 && agno%100!=0) {
                            if (dia<=29 && dia>0) {
                                System.out.println("fecha correcta");
                            }else System.out.println("dia incorrecto");
                        }else {
                            if (dia<=28 && dia>0) {
                                System.out.println("fecha correcta");
                            }else System.out.println("dia incorrecto");
                        }
                        break;
                }   
            }else System.out.println("mes no valido");
        }else System.out.println("año invalido");
    }
}
