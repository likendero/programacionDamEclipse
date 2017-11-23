/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;
import java.util.Scanner;
/**
 *
 * @author likendero
 */
public class EjemploClase {
    public static void main(String[] args) {
        //ejemploUno();
        //ejemploTres();
        //ejemploCuatro();
        //ejemploCinco();
        //ejemploSeisNoOficial();
        ejemploSiete();
    }

   
    public static void ejemploDos(){
        Scanner key=new Scanner(System.in);
        //varibles
        int nota;
        // entrada
        System.out.println("Introduce nota");
        nota=key.nextInt();
        //salida
        if(nota<0 || nota>10) System.out.println("nota no valida");
        else{
        if(nota>=5)System.out.println("aprobado");
        if(nota<5)System.out.println("");
        }
    }
    public static void ejemploTres(){
        //varibles
        try (Scanner key = new Scanner(System.in)) {
            //varibles
            double numero;
            //entrada
            System.out.println("introduce un valor para numero");
            numero=key.nextDouble();
            //salida
            if(numero<0){
                System.out.println("-");
            }
            if(numero>0){
                System.out.println("+");
            }
            if(numero==0){
                System.out.println("el cero no tiene signo");
            }
            key.close();
        }
    }
    public static void ejemploCuatro(){
        try(Scanner key=new Scanner(System.in)){
        //variables
        int edad;
        //entrada
        System.out.println("introduce una edad");
        edad=key.nextInt();
        //salida
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        key.close();
        }
    }
    public static void ejemploCinco(){
        try(Scanner key=new Scanner(System.in)){
            //variables
            //a y b son dos numeros que se compararan para saber cual es mayor
            int a,b;
            //entrada
            System.out.println("introduce el vaslor para a");
            a=key.nextInt();
            System.out.println("Introduce el valor para b");
            b=key.nextInt();
            //salida
            if(a>b)System.out.println("a es mayor que b");
            else{
                if(b>a)System.out.println("b es mayor que a");
                else{
                    System.out.println("a y b son iguales");
                }
            }
        }
    }
    public static void ejemploSeisNoOficial(){
        try(Scanner key=new Scanner(System.in)){
            //variables
            int numerador,denominador;
            //entrada
            System.out.println("Introduce el numerador");
            numerador=key.nextInt();
            System.out.println("Introduce el denominador");
            denominador=key.nextInt();
            //salida
            if(numerador%denominador==0)System.out.println("es multiplo");
            else{
                System.out.println("no es multiplo");
            }
            key.close();
        }catch(Exception ex){
            System.out.println("error");
        }
    }
    public static void ejemploSiete(){
        try(Scanner key=new Scanner(System.in)){
            //variables
            int nota;
            //entrada
            System.out.println("introduce nota");
            nota=key.nextInt();
            if(nota>0 && nota<=10){
                if(nota<5){
                    System.out.println("suspenso");
                }else{
                    System.out.println("aprobado");
                }
            }else{
                System.out.println("nota no valida");
            }
            key.close();
        }catch(Exception ex){
            System.out.println("error");
        }
    }
    //leer la edad y el sexo de una persona y escriba si es mujer entre 18 y 25 
    //u hombre con cualquier edad
    public static void hombreMujer(){
        try(Scanner key=new Scanner(System.in)){
            //variables
            byte edad;
            char sexo;
            //entrada
            System.out.println("introduce la edad");
            edad=key.nextByte();
            System.out.println("Introduce el sexo");
            sexo=key.nextLine().charAt(0);
            //salida
            if(sexo=='h'){
                System.out.println("es hombre");
                        
            }else{
                if(edad>=10);
            }
        }
    }
}
