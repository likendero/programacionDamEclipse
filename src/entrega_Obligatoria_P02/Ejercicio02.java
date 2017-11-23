/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrega_Obligatoria_P02;
    import java.util.Scanner;
/**
 *
 * @author liken
 */
/*
en este programa se iran introduciendo numeros enteros, se contaran los pares 
in pares la suma de estos y el porcentaje de cada uno
*/
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        //variables
        int pares,impares,entrada,cont;
        pares=0;
        impares=0;
        entrada=0;
        cont=0;
        /*
        voy a usar un bucle que no terminara hasta que se introduzca un 0
        */
        do{
            System.out.println("introduce un numero entero positivo");
            entrada=key.nextInt();
            /*
            en primer lugar comprueba si es un numero valido, si lo es comprueba si es par
            o impar, si no es valido si es negativo preguntando otro numero y no haciendo registro
            si es 0 acaba el bucle
            */
            if(entrada>0){
                cont++;
                if(entrada%2==0){
                    pares++;
                }else impares++;
            }else if(entrada!=0)System.out.println("no se permiten numeros negativos");
        }while(entrada!=0);
        /*
        una vex terminado el bucle formatea la salida y calcula todo lo pedido
        primero los pares con su porcentaje y el segun los impares
        */
        System.out.println("hay "+pares+" pares, el "+pares*100/cont+"%");
        System.out.println("hay "+impares+" impares, el "+impares*100/cont+"%");
        System.out.println("el total de numeros ha sido de "+ cont);
        key.close();
    }
}
