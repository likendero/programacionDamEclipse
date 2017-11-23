package temaTres;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
/*
estos son los ejercicos de clase de bucles, hay que hacerlos con los 3 bucles
*/
public class ejerciciosClaseBucles {
    public static void main(String[] args) {
        try (Scanner ent=new Scanner(System.in)){
            //numerosHastaDiez();
            //notasHastaCero(ent);
            primosEntreIntroducidos(ent);
            ent.close();
        }
    }
    public static void numerosHastaDiez(){
        //variables
        int cont=1;
        while(cont<=10){
            System.out.println(cont++);
        }
        System.out.println("fin while");
        cont=0;
        do{
            System.out.println(cont++);
        }while(cont<=10);
        System.out.println("fin do while");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("fin for");
    }
    public static void notasHastaCero(Scanner ent){
        //variables
       int notas,suma,cont;
        notas=1;
        suma=0;
        cont=0;
        //cuerpo
        while(notas>0){
            System.out.println("introduce una nota");
            notas=ent.nextInt();
            if(notas>0 && notas<=10){
                suma+=notas;
                cont++;
            }
            if(notas>10)System.out.println("nota no valida");
        }
        System.out.println("la nota media es "+(double)suma/(double)cont);
        cont=0;
        suma=0;
        System.out.println("fin while");
        do{
            System.out.println("introduce una nota");
            notas=ent.nextInt();
            if(notas>0 && notas<=10){
                suma+=notas;
                cont++;
            }
            if(notas>10)System.out.println("nota no valida");
        }while(notas>0);
        System.out.println("la nota media es "+(double)suma/(double)cont);
        cont=0;
        suma=0;
        System.out.println("fin do while");
        for (;notas>0;) {
            System.out.println("introduce una nota");
            notas=ent.nextInt();
            if(notas>0 && notas<=10){
                suma+=notas;
                cont++;
            }
            if(notas>10)System.out.println("nota no valida");
        }
        System.out.println("la nota media es "+(double)suma/(double)cont);
        System.out.println("fin for");
    }
    public static void primosEntreIntroducidos(Scanner ent){
        //variables
        int primoInf,primoSup,cont;
        boolean esPrimo;
        primoInf=0;
        primoSup=0;
        cont=2;
        esPrimo=true;
        //cuerpo
        /*
        bucle que pide y verifica la cota superior e inferior
        el inferiror debe ser mayor de dos y menor que el superior, miesntras que 
        estas condiciones no se cumplan el programa no continuara
        */
        while(primoInf>=primoSup || primoInf<2){
            System.out.println("introduce la cota inferior(mayor que 2)");
            primoInf=ent.nextInt();
            System.out.println("Introduce la cota superior(mayor que la inferior)");
            primoSup=ent.nextInt();
        }
        //inicio bucle while, este continuara hasta que se recorra todos los numeros
        // de inf hasta sup incluyendolos
        System.out.println("inicio while");
        while(primoInf<=primoSup){
            //este bucle comprueba si un numero es primo, si no lo fuese el bucle
            //acaba al instante
            while(cont<primoInf){
                if(primoInf%cont==0){
                    esPrimo=false;
                    cont=primoInf;
                }
                cont++;
            }
            //cada vez que el bucle superior acaba completo es que el nuemero es primo
            //si esto es asi imprime que es primo en caso contrario esPrimo=false 
            //y e imprime que no lo es
            if(esPrimo)System.out.println(primoInf+"es primo");
            cont=2;
            primoInf++;
            esPrimo=true;
        }
        System.out.println("fin while");
        //bis
        while(primoInf>=primoSup || primoInf<2){
            System.out.println("introduce la cota inferior(mayor que 2)");
            primoInf=ent.nextInt();
            System.out.println("Introduce la cota superior(mayor que la inferior)");
            primoSup=ent.nextInt();
        }
        //lo mismo pero las comprobaciones van al final
        System.out.println("inicio do while");
        do{
            //calculo de primos
            while(cont<primoInf){
                if(primoInf%cont==0){
                    esPrimo=false;
                    cont=primoInf;
                }
                cont++;
            }
            //salida si son primos
            if(esPrimo)System.out.println(primoInf+"es primo");
            cont=2;
            primoInf++;
            esPrimo=true;
        }while(primoInf<=primoSup);
        System.out.println("fin do while");
        //introduccion de datos anti error
        while(primoInf>=primoSup || primoInf<2){
            System.out.println("introduce la cota inferior(mayor que 2)");
            primoInf=ent.nextInt();
            System.out.println("Introduce la cota superior(mayor que la inferior)");
            primoSup=ent.nextInt();
        }
        System.out.println("inicio for");
        for(int i=2;primoInf<=primoSup;primoInf++){
            while(i<primoInf){
                if(primoInf%cont==0){
                    esPrimo=false;
                    i=primoInf;
                }
                i++;
            }
            if(esPrimo)System.out.println(primoInf+"es primo");
            i=2;
            esPrimo=true;
        }
        System.out.println("fin for");
    }
  }
    

