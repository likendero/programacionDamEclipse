/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temaTres;

import java.math.BigInteger;
/*
tiempo transcurrido entre hora 2 y hora 3
cuanto tiempo hasta la media noche hasta hora 3
cuanto tiempo hasta la media noche desde hora 3
crear metodos necesarios
*/
/**
 *
 * @author likendero
 */
public class PruebaObjetos {
    public static void main(String[] args) {
        Hora hora1=new Hora(0,0,0);
        Hora hora2=new Hora(12,30,40);
        Hora hora3=new Hora(hora2);

        System.out.println(hora1.mostrarHora());
        hora2.setHora(2);
        hora2.setMinutos(23);
        hora2.setSegundos(34);
        System.out.println(hora2.mostrarHora());
        for(int i=0; i<3600;i++){
            hora2.sumarSegundo();
            System.out.println(hora2.mostrarHora());
        }
        System.out.println("############################################S");
        System.out.println(hora2.tiempoHastaMediaNoche());
        System.out.println(hora3.mostrarHora()+"  "+hora2.mostrarHora());
        System.out.println(hora2.restarHoras(hora3));
        System.out.println(hora2.restaVueltaSegundos(hora3));
    }
}
