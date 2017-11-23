
package entrega_Obligatoria_P02;
    import java.util.Scanner;
/**
 *
 * @author liken
 */
/*
en este ejercicio se calculara el suelde de un trabajador teniendo en cuenta:
hasta 38 las horas seran laborales, despues seran extras y se valoraran con un 
50% mas
no habra un impuesto hasta sobrepasar los 750€ brutos y este sera del 10%
*/
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int horas;
        double valorHora;
        valorHora=0;
        horas=0;
        //autentificar el valor de la hora
        do{
            System.out.println("introduce el sueldo por hora laboral");
            valorHora=key.nextDouble();
            System.out.println(valorHora<1?"el valor de la hora tiene que ser positivo":"");
        }while(valorHora<1);
        //validar la hora
        do{
            System.out.println("introduce el numero de horas trabajadas");
            horas=key.nextInt();
            System.out.println(horas<1?"el numero de horas tiene que ser positivo":"");
        }while(horas<1);
        /*
        dependiendo de la cantidad de tiempo y el valor de las horas el programa
        va tomando un camino para el calculo
        */
        //si se superan las horas laborales
        if(horas>38){
            //si estas sobrepasa el valor limite de los impuestos
            if(38*valorHora+(horas-38)*(valorHora+valorHora*0.5)>750){
                System.out.println(" el sueldo final es de "+((38*valorHora+
                        (double)(horas-38)*(valorHora+valorHora*0.5))-(38*valorHora+
                                (double)(horas-38)*(valorHora+valorHora*0.5))*0.1));
            //en el caso de no superalo
            }else System.out.println("el sueldo final es de "+(38*valorHora+
                    (double)(horas-38)*(valorHora+valorHora*0.5)));
        //si no supera las horas laborales y si el sueldo supera el limite de los impuestos
        }else if(horas*valorHora>750){
            System.out.println("el sueldo final es de "+ ((double)horas*valorHora
                    -(double)horas*valorHora*0.1));
         //si no se superan las horas ni el limite de los impuestos
        }else System.out.println("el sueldo final es de "+(double)horas*valorHora);
    }
}
