package Ejercicio03;

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
