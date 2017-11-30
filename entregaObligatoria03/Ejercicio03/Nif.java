package Ejercicio03;
	import java.util.Scanner;
public class Nif {
	private int numero;
	private char letra;
	/**
	 * constructor por defecto, numero=0, letra=' '
	 */
	public Nif() {
		super();
		this.numero=0;
		this.letra=' ';
	} 
	/**
	 * constructor de clase, este constructor solo necesita el numero ya que la letra de autocalcula
	 * @param numero numero del DNI
	 */
	public Nif(int numero) {
		super();
		this.numero=numero;
		this.calculoLetra();
	}

	public int getNumero() {
		return numero;
	}

	public char getLetra() {
		return letra;
	}

	public void setNumero(int numero) {
		this.numero = numero;
		this.calculoLetra();
	}
	
	public String toString() {
		String salida="";
		//comprobacion, validez del numero
		if(Integer.toString(this.getNumero()).length()<=8 && Integer.toString(this.getNumero()).length()>0 
				&& this.getNumero()>0 ) {
			//añadir 0os en el caso que la longitud en caracteres del numero no sea la correcta
			for(int i=Integer.toString(this.getNumero()).length(); i < 8;i++) {
				salida+=0;
			}
			//proceso de añadir el numero y letra
			salida+=this.getNumero()+ "-" +this.getLetra();
			//vuelta del resultado
			return salida;
		}
		//vuelta en el caso que el numero no fuese valido
		return "numero no valido ";
	}
	
	/**
	 * metodo que permite cambiar el numero del dni pasandole un valor por consola
	 * @param key valor introducido por consola(realmente solo es el objeto que permite la entrada de datos)
	 */
	public void leer(Scanner key) {
		System.out.println("por favor escribe un numero entero de no mas de 8 caracteres para el DNI/NIF");
		this.setNumero(key.nextInt());
		this.calculoLetra();
	}
	/**
	 * metodo que sirve para establecer la letra del dni a partir del numero ya que a 
	 * cierto numero solo hay una letra posible.
	 */
	private void calculoLetra() {
		//el numero de dni tiene que ser positivo
		if(this.numero>=0) {
			int resto;
			resto=this.numero%23;
			switch(resto) {
			case 0:
				this.letra=' ';
				break;
			case 1:
				this.letra='T';
				break;
			case 2:
				this.letra='R';
				break;
			case 3:
				this.letra='W';
				break;
			case 4:
				this.letra='A';
				break;
			case 5:
				this.letra='G';
				break;
			case 6:
				this.letra='M';
				break;
			case 7:
				this.letra='Y';
				break;
			case 8:
				this.letra='F';
				break;
			case 9:
				this.letra='P';
				break;
			case 10:
				this.letra='D';
				break;
			case 11:
				this.letra='X';
				break;
			case 12:
				this.letra='B';
				break;
			case 13:
				this.letra='N';
				break;
			case 14:
				this.letra='J';
				break;
			case 15:
				this.letra='Z';
				break;
			case 16:
				this.letra='S';
				break;
			case 17:
				this.letra='Q';
				break;
			case 18:
				this.letra='V';
				break;
			case 19:
				this.letra='H';
				break;
			case 20:
				this.letra='L';
				break;
			case 21:
				this.letra='C';
				break;
			case 22:
				this.letra='K';
				break;
			default:
				this.letra='E';
				}
		}
	}
	
	
}
