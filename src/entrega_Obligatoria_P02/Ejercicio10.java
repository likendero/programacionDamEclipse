
package entrega_Obligatoria_P02;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
//entrega realizada con exito
// otro comentario por la cara
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        byte selector;
        boolean on;
        on=true;
        
        do{
        //menu##############################
        System.out.println("menu");
        System.out.println("1. numeros primos");
        System.out.println("2. suma sucesion");
        System.out.println("3. mayor menos");
        System.out.println("4. raiz cuadrada");
        System.out.println("5. salir");
        //entrada
        selector=key.nextByte();
        //selector
        switch(selector){
            // ver si un numero es primo
            case 1:
                esPrimo(key);
                break;
            //sucesion 1/1+1/2+...1/n-1+1/n
            case 2:
                sumaSucesion(key);
                break;
            // comprobar cual es el mayor menor y cuantos 0
            case 3:
                mayorMenor(key);
                break;
            case 4:
                raizResto(key);
                break;
            case 5:
                on=false;
                break;
            default:
                System.out.println("eso no es una opcion");
                break;
        }
        }while(on);
        System.out.println("fin del programa");
    }
    /*
    este metodo calcula si un numero es primo
    */
    public static void esPrimo(Scanner key){
        int numero;
        boolean esPrimo=true;
        
        do {
        System.out.println("introduce un numero entero positivo distinto de 0");
        System.out.println("para ver si es primo");
        //entrada del numero
        numero=key.nextInt();
        }while(numero<=0);
        
        //este bucle divide por todos los numeros desde el 2, en el caso de ser dibisible no es primo
        // si el numero fuera 1 directamente diria que no es primo
        
        if(numero!=1)
        for(int i=2;i<numero;i++){
            if(numero%i==0)
                esPrimo=false;
        }
        else esPrimo=false;
        System.out.println(esPrimo?"el numero es primo":"el numero no es primo");
    }
    /*
    suma de una sucesion 
    */
    public static void sumaSucesion(Scanner key){
        int numero;
        double suma;
        suma=0;
        numero=0;
        //entrada con validacion
        do {            
            System.out.println("introduce un numero entero positivo");
            numero=key.nextInt();
        } while (numero<=0);
        //a traves de numero se controla las repeticiones del bucle
        for (int i = 1; i <= numero; i++) {
            //en suma se va sumando la sucesion
            suma+=(double)1/i;
        }
        //salida 
        System.out.println("la sumatoria es = "+suma);
    }
    /*
    mayor y menor de una serie de numeros y cuantos 0 se han introducido
    */
    public static void mayorMenor(Scanner key){
        int  entrada,numero,mayor,menor,ceros;
        entrada=0;
        numero=0;
        mayor=0;
        menor=0;
        ceros=0;
        //entrada del numero de numeros a introducir
        do {            
            System.out.println("introduce un numero entero positivo");
            numero=key.nextInt();
        } while (numero<=0);
        // el bucle controlado por el numero de numeros deseado
        for (int i = 1; i <= numero; i++) {
            System.out.println("numero: "+i+" =");
            entrada=key.nextInt();
            //comprobacion si es el mayor
            if (entrada>mayor) {
                mayor=entrada;
            }
            //comprobacion si es el menor distinto de 0
            if(entrada<menor && entrada!=0){
                menor=entrada;
            }
            //comprobacion si ha habido 0os
            if(entrada==0){
                ceros++;
            }
        }
        System.out.println("el mayor es "+mayor);
        System.out.println("el menor es "+menor);
        System.out.println("ha habido "+ceros+" ceros");
    }
    /*
    calculo de la raiz de un numero y su resto
    */
    public static void raizResto (Scanner key){
        int raiz,numero;
        // entrada con validacion
        do {            
            System.out.println("introduce un numero entero");
            numero=key.nextInt();
        } while (numero<=0);
        //guardar el vaor de la raiz
        raiz= (int)Math.sqrt((double)numero);
        //salida de la raiz
        System.out.println("la raiz es "+raiz);
        //salida del resto
        System.out.println("el resot es "+(numero-raiz*raiz));
    }
    
    
}
