
package entrega_Obligatoria_P02;
    import java.util.Scanner;
/**
 *
 * @author liken
 */
/*
este programa solicita la hora en formato 24h y lo devuelve en formato 12h,
ademas controlara el formateo de la hora para que siempre este formado por 
los 5 caracteres: HH:MM
*/
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        String hora;
        hora="";
        System.out.println("este programa pasa de formato 24h a 12h");
        /*
        se introduce el formato de la hora desde el teclado, pide que se introduzca hasta que 
        sea correcto
        */
        do{
            System.out.println("introduce la hora, el formato tiene que ser HH:MM");
            System.out.println("hay que añadir un cero delante si solo es un digito 0H:0M");
            hora=key.nextLine();
           /*
            al final se hacen todas las comprobaciones, si se cumple alguna de las 
            conciones(que hacen que no sea el formato deseado)se repite el bucle 
            hasta tener el formato deseado
            */
        }while(hora.length()!=5 || !hora.substring(2, 3).equals(":") || Integer.parseInt(hora.substring(0,2))<0 ||
                Integer.parseInt(hora.substring(0,2))>24 || Integer.parseInt(hora.substring(4,5))<0 || 
                Integer.parseInt(hora.substring(4,5))>60);
        /*
        solo hace falta mirar las horas ya que los minutos no son relevantes
        en el cambio de formato
        */
        if(Integer.parseInt(hora.substring(0,2))>=12)
            hora=(Integer.parseInt(hora.substring(0, 2))-12)+":"+hora.substring(3, 5)+"pm";
        else hora+="am";
        System.out.println("la hora es "+hora);
        key.close();
    }
}
