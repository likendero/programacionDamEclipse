
package temaTres;
    import java.util.Scanner;
/**
 *
 * @author liken
 */
public class BuclesPrueba {
    public static void main(String[] args) {
        try(Scanner key = new Scanner(System.in)){
            //mediaNotas(key);
            //mediaNotasControlado(key);
            sumaCentinela(key);
            key.close();
        }
    }
    public static void sumarHastaDiez(){
        int x=0;
        while(x<=10){
            System.out.println("x= "+x++);
        }
    }
    public static void mediaNotas(Scanner key){
        //se debe hacer hasta cierto numero, sin control centinela
        //variables
        double suma,nota;
        int cont;
        suma=0;
        cont=0;
        nota=0;
        //cuerpo
        while(cont<5){
            System.out.println("introduce una nota");
            nota=key.nextDouble();
            
            if(nota>0 && nota<=10){
                suma+=nota;
                cont++;
            } else{ 
                System.out.println("nota no valida");
            }
        }
        //salida
        System.out.println("nota media "+suma/cont);
        
    }
    public static void mediaNotasControlado(Scanner key){
        //variables
        double nota,suma;
        int cont;
        nota=1;
        suma=0;
        cont=0;
        //cuerpo
        //System.out.println("introduce nota");
        //nota=key.nextDouble();        
        while(nota>0){
            System.out.println("introduce nota");
            nota=key.nextDouble();
            if(nota>0 && nota<=10){
                suma+=nota;
                cont++;
            }else if(nota>10){
                System.out.println("nota no valida");
            }
        }
        if(suma>0 && cont>0)System.out.println("la nota media es"+suma/(double)cont);
        else System.out.println("no hay notas");
        System.out.println(cont);
    }
    public static void sumaCentinela(Scanner key){
        //variables
        int cont,numero,suma;
        boolean negativo;
        numero=0;
        suma=0;
        negativo=false;
        //cuerpo
        while(negativo==false){
            System.out.println("introduce un numero entero");
            numero=key.nextInt();
            if(numero>0){
                suma+=numero;
            }else{
                negativo=true;
            }
        }
        System.out.println("la suma de los numeros es "+suma);
    }
    
}
