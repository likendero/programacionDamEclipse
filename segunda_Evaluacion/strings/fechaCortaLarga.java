package strings;
	import java.util.Scanner;
	/**
	 * clase que transforma fecha en formato dd/mm/aaaa en formato dd de mesescrito de aaaa
	 * @author liken
	 *
	 */
public class fechaCortaLarga {
	private static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		String fecha, fechaLarga = "";
		int dia, mes, anno;
		do {
		System.out.println("introduce una fecha en formato DD/MM/AAAA");
		fecha = key.next();
		if(fecha.length() < 10)
			fecha = "0000000000";
		//no aacaba si las barras no estan en su sitio
		}while( !fecha.substring(2,3).equals("/") && !fecha.substring(5,6).equals("/") );
		dia = Integer.parseInt(fecha.substring(0,2));
		mes = Integer.parseInt(fecha.substring(3,5));
		anno = Integer.parseInt(fecha.substring(6,10));
		System.out.println(dia + "/" + mes + "/" + anno);
		fechaLarga += dia + " de ";
		// selector del mes
		switch(mes){
        case 1:
            fechaLarga += "enero";
            break;
        case 2:
        	fechaLarga += "febrero";
            break;
        case 3:
        	fechaLarga += "marzo";
            break;
        case 4:
        	fechaLarga += "abril";
            break;
        case 5:
        	fechaLarga += "mayo";
            break;
        case 6:
        	fechaLarga += "junio";
            break;
        case 7:
        	fechaLarga += "julio";
            break;
        case 8:
        	fechaLarga += "agosto";
            break;
        case 9:
        	fechaLarga += "septiembre";
            break;
        case 10:
        	fechaLarga += "octubre";
            break;
        case 11:
        	fechaLarga += "noviembre";
            break;
        case 12:
        	fechaLarga += "diciembre";
            break;
        default:
            System.out.println("mes inexistente");
            break;  
    }
		//formateo y salida
		fechaLarga += " de " + anno;
		System.out.println(fechaLarga);
	}
}
