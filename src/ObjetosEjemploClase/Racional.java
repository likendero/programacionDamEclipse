
package ObjetosEjemploClase;

/**
 * @author Bego�a
 *
 */
import java.util.Scanner;
public class Racional {
	private int numerador, denominador;
	
	//Constructores
	//************ por defecto
	public Racional() {
		this.numerador=0;
		this.denominador=1;
	}
	
	//*********** de clase
	public Racional(int numerador, int denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
		this.simplificar();
	}
	
	//*********** de copia
	public Racional(Racional r) {
		this.numerador=r.numerador;
		this.denominador=r.denominador;
	}
	
	//getter y setter
	//************* set (dar valores a los atributos)
	public void setNumerador(int numerador) {
		this.numerador=numerador;
	}
	
	/**
	 * 
	 * @param denominador OJO NO PUEDE SER 0
	 * 			O BIEN AQU� O EN LA LLAMADA HAY QUE HACER ESA VALIDACI�N
	 * 			YO VOY A HACERLO AQU�
	 */
	public void setDenominador(int denominador) {
		Scanner entrada=new Scanner(System.in);
		while (denominador==0) {
			System.out.println("EL DENOMINADOR NO PUEDE SER O, INTRODUZCALO DE NUEVO");
			denominador=entrada.nextInt();			
		}
		this.denominador=denominador;
		this.simplificar();
		entrada.close();		 
	}
	
	//***************************get (obtiene los valores de los atributos)
	public int getNumerador() {
		return this.numerador;
	}
	
	public int getDenominador() {
		return this.denominador;
	}
	//TOSTRING
	public String toString() {
		return this.numerador+"/"+this.denominador;
	}
	
	// OPERACIONES
	//*******************suma
	/**
	 * suma la fracci�n invocadora y la que se pasa como par�metro y deja el resultado en la 
	 * fracci�n invocadora
	 * @param rar 
	 */
	public void suma(Racional rar) {
		this.numerador=this.numerador*rar.denominador+this.denominador*rar.numerador;
		this.denominador=this.denominador*rar.denominador;
		this.simplificar();
		
		
	}
	
	//*******************suma sobrecargado
	/**
	 * Invoca a la funci�n suma devuelve un objeto en el que guardar� la suma de rar1 y rar2
	 * ejemplo de m�todo est�tico
	 * @param rar1 primer sumando Racional
	 * @param rar2 segundo sumando Racional
	 * @return Un objeto Racional
	 */
	
	public /*static*/ Racional suma(Racional rar1, Racional rar2) {
		Racional objRes=new Racional();
		objRes.setNumerador(rar1.numerador*rar2.denominador+rar1.denominador*rar2.numerador);
		objRes.setDenominador(rar1.denominador*rar2.denominador);
		objRes.simplificar();
		return objRes;
		
	}
	
	//*************************resta
	
		/**
		 * resta la fracci�n invocadora y la que se pasa como par�metro y deja el resultado en la 
		 * fracci�n invocadora
		 * @param rar Racional
		 */
		public void resta(Racional rar) {
			this.numerador=this.numerador*rar.denominador-this.denominador*rar.numerador;
			this.denominador=this.denominador*rar.denominador;
			
			this.simplificar();		
		}
		
		//*******************resta sobrecargado
		/**
		 * Invoca a la funci�n resta devuelve un objeto en el que guardar� la resta de rar1 y rar2
		 * ejemplo de m�todo est�tico
		 * @param rar1 minuendo Racional
		 * @param rar2 sustraendo Racional
		 * @return Un objeto Racional
		 */
		
		public /*static*/ Racional resta(Racional rar1, Racional rar2) {
			Racional objRes=new Racional();
			objRes.setNumerador(rar1.numerador*rar2.denominador-rar1.denominador*rar2.numerador);
			objRes.setDenominador(rar1.denominador*rar2.denominador);
			objRes.simplificar();
			return objRes;
			
		}
		
		//*************************producto
		
			/**
			 * multiplica la fracci�n invocadora y la que se pasa como par�metro y deja el resultado en la 
			 * fracci�n invocadora
			 * @param rar Racional
			 */
			public void producto(Racional rar) {
				this.numerador=this.numerador*rar.numerador;
				this.denominador=this.denominador*rar.denominador;
				this.simplificar();
			}
			
			//*******************producto sobrecargado
			/**
			 * Invoca a la funci�n producto devuelve un objeto en el que guardar� el producto de rar1 y rar2
			 * ejemplo de m�todo est�tico
			 * @param rar1 minuendo Racional
			 * @param rar2 sustraendo Racional
			 * @return Un objeto Racional
			 */
			
			public /*static*/ Racional producto(Racional rar1, Racional rar2) {
				Racional objRes=new Racional();
				objRes.setNumerador(rar1.numerador*rar2.numerador);
				objRes.setDenominador(rar1.denominador*rar2.denominador);
				objRes.simplificar();
				return objRes;
				
			}
			
			//*************************Divisi�n
			
			/**
			 * divide la fracci�n invocadora y la que se pasa como par�metro y deja el resultado en la 
			 * fracci�n invocadora Ojo divisi�n por cero hab� que decidir que hacer en este caso 
			 * MI decisi�n: ESCRIBE UN MENSAJE DE ERROR Y EL NUEVO DENOMINADOR ES 1
			 * @param rar Racional
			 */
			public void division(Racional rar) {
				this.numerador=this.numerador*rar.denominador;
				this.denominador=this.denominador*rar.numerador;
				if(this.denominador==0) {
					System.out.println("EL DENOMINADOR NO PUEDE SER 0; HACEMOS QUE SEA 1");
					this.denominador=1;
				}
				this.simplificar();
			}
			
			//*******************divisi�n sobrecargado
			/**
			 * Invoca a la funci�n producto devuelve un objeto en el que guardar� el producto de rar1 y rar2
			 * si denominador es 0, escribimos error y asignamos 1 al nuevo denominador
			 * ejemplo de m�todo est�tico
			 * @param rar1 minuendo Racional
			 * @param rar2 sustraendo Racional
			 * @return Un objeto Racional
			 */
			
			public /*static*/ Racional division(Racional rar1, Racional rar2) {
				Racional objRes=new Racional();
				objRes.setNumerador(rar1.numerador*rar2.denominador);
				objRes.setDenominador(rar1.denominador*rar2.numerador);
				if(objRes.getDenominador()==0) {
					System.out.println("EL DENOMINADOR NO PUEDE SER 0; HACEMOS QUE SEA 1");
					objRes.setDenominador(1);
					
				}
				objRes.simplificar();
				return objRes;
				
			}
			
			//********* simplificar fracciones 
			// realizamos un m�todo que obtenga el mcd de dos n�meros en nuestro caso del numerador y denominador
			/**
			 *  
			 * @return devuelve un entero que es el mcd entre el numerador y el denominador
			 */
			private int mcd(){
			     int u=Math.abs(this.numerador);
			     int v=Math.abs(this.denominador);
			     int r;
			     while(v!=0){
			          r=u%v;
			          u=v;
			          v=r;
			     }
			     return u;
			  }
			
			/**
			 * 
			 * @return devuelve el propio objeto (this)
			 */
			public Racional simplificar(){
		     int dividir=mcd();
		     this.numerador/=dividir;
		     this.denominador/=dividir;
		     return this;
		  }
}
