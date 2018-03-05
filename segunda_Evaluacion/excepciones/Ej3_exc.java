package excepciones;
import java.util.Scanner;
public class Ej3_exc {
	public static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		boolean control = false;
		do {
			try {
				System.out.println("introduce una fecha como un numero entero de 8 digitos");
				String resultado = fecha(key.nextInt());
				System.out.println(resultado);
				control = true;
			}
			catch(FormateoEnteroException formEx) {
				System.out.println("error en la introduccion: " + formEx.getMessage());
				key.nextLine();
			}
			catch(IllegalArgumentException illEx) {
				System.out.println("error en los datos introducidos: " + illEx.getMessage() );
			}
			catch(Exception ex) {
				System.out.println("ha sucedido un error inesperado: " );
				ex.printStackTrace(System.out);
			}
			
		}while(!control);
	}
	
	public static String fecha(int fechaEntera) throws FormateoEnteroException, IllegalArgumentException {
		String cadena = "",salida = "";
		int dia,mes,anno;
		cadena += fechaEntera;
		//solucion al caso de que el primer digito sea 0
		if(cadena.length() == 7)
			cadena = "0"+ cadena;
		// comprobacion del numero de digitos
		if(cadena.length() != 8)
			throw new FormateoEnteroException("numero de digitos incorrecto");
		dia = Integer.parseInt(cadena.substring(0, 2));
		mes = Integer.parseInt(cadena.substring(2, 4));
		anno = Integer.parseInt(cadena.substring(4, 8));
		//validacion numeros de dias
		if(dia < 0 || dia >= diasDelMes(mes, anno) )
			throw new IllegalArgumentException("numero de dias fuera re rango");
		salida += dia + " de " + mesDelAnno(mes) + " " +anno;
			
		return salida;
	}
	
	
	// este metodo esta copiado de internet
	//http://www.programandoconcafe.com/2010/09/metodo-utilizado-para-obtener-el-numero_24.html
	public static int diasDelMes(int mes, int anno)throws IllegalArgumentException{
		switch(mes){
		case 0:  // Enero
		case 2:  // Marzo
		case 4:  // Mayo
		case 6:  // Julio
		case 7:  // Agosto
		case 9:  // Octubre
		case 11: // Diciembre
		return 31;
		case 3:  // Abril
		case 5:  // Junio
		case 8:  // Septiembre
		case 10: // Noviembre
		return 30;
		case 1:  // Febrero
		if ( ((anno%100 == 0) && (anno%400 == 0)) ||
		((anno%100 != 0) && (anno%  4 == 0))   )
		return 29;  // Año Bisiesto
		else
		return 28;
		default:
		throw new java.lang.IllegalArgumentException(
		                "numero de mes incorrecto");
		}
		}
	/**
	 * metodo que devuelve una cadena con el nombre del mes
	 * @param mes
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static String mesDelAnno(int mes)throws IllegalArgumentException {
		switch(mes){
		case 1: 
			return "enero";
		case 2:
			return "febrero";
		case 3:
			return "marzo";
		case 4:
			return "abril";
		case 5:
			return "mayo";
		case 6:
			return "junio";
		case 7:
			return "julio";
		case 8:
			return "agosto";
		case 9:
			return "septiembre";
		case 10:
			return "octubre";
		case 11:
			return "noviembre";
		case 12:
			return "diciembre";
		default:
			throw new IllegalArgumentException("numero de mes incorrecto");
		}
	}
	
}
