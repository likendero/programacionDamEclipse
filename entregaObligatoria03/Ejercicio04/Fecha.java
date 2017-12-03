package Ejercicio04;
	
public class Fecha {
	int dia,mes;
	int anno;
	/**
	 * constructor por defecto, inicializa la fecha a 1-1-1900
	 */
	public Fecha() {
		super();
		this.dia=1;
		this.mes=1;
		this.anno=1900;
	}
	/**
	 * constructor de clase que crea la instancia con todos los valores
	 * ademas valida que los valores introducidos son correctos
	 * @param dia 
	 * @param mes
	 * @param anno
	 */
	public Fecha(int dia,int mes,int anno) {
		super();
		this.dia=dia;
		this.mes=mes;
		this.anno=anno;
		this.valida();
		
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnno() {
		return anno;
	}
	public void setDia(int dia) {
		this.dia = dia;
		this.valida();
	}
	public void setMes(int mes) {
		this.mes = mes;
		this.valida();
	}
	public void setAnno(int anno) {
		this.anno = anno;
		this.valida();
	}
	/**
	 * metodo que comprueba la fecha, en el caso que uno de 
	 * sus valores no fuese bueno lo sustituye por un valor por defecto
	 */
	public void valida() {
		//comprobacion que el año esta en rango
		if(this.getAnno()<1900 || this.getAnno()>2050)
			this.setAnno(1900);
		//caomprobacion que el mes esta en rango
		if(this.getMes()>12 || this.getMes()<0)
			this.setMes(1);
		// controla los meses de 30,31 y febrero pudiendo ser bisiesto o no
		switch(this.getMes()){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	//comprobacion del rango de los dias de 31
            if(this.getDia()<1 && this.getDia()>31)
            	this.setDia(1);
            break;
        case 4:
        case 6:
        case 9:
        case 11:
        	//comprobacion del rango de los dias de 30
        	if(this.getDia()<1 && this.getDia()>30)
            	this.setDia(1);
            break;
        case 2:
        	// comprobacion de año bisiesro
            if(this.getAnno()%400==0 || this.getAnno()%4==0 && this.getAnno()%100!=0) {
            	//comprobacion del rango de los dias de 29
            	if(this.getDia()<1 && this.getDia()>29)
                	this.setDia(1);
            	//comprobacion del rango de los dias de 28
            }else if(this.getDia()<1 && this.getDia()>28)
            	this.setDia(1);
            break;
        default:
            this.setDia(1);
            break;
	}
	}
	/**
	 * metodo que a traves de una entrada por teclado introduce dia,mes y año
	 * al final valida todos los datos
	 * @param key entrada por teclado
	 */
	public void leer(java.util.Scanner key) {
		System.out.print("introduce un año: ");
		this.setAnno(key.nextShort());
		System.out.print("\nintroduce mes: ");
		this.setMes(key.nextByte());
		System.out.print("\nintroduce dia: ");
		this.setDia(key.nextByte());
		//validacion para que no halla valores fuera de rango
		this.valida();
		
	}
	/**
	 * metodo que indica si el año es bisiesto o no
	 * @return true si es bisiesto false si no lo es
	 */
	public boolean bisiesto() {
		return this.getAnno()%400 == 0 || this.getAnno()%4 == 0 && this.getAnno()%100 != 0;
		/*
		 * este metodo fue hecho despues del metodo para validar, por esta razon
		 * no se encuentra integrado dentro de este
		 */
	}
	/**
	 * metodo que devuelve el numero de dias de un mes
	 * @param mes 
	 * @return numero de dias, 0 en el caso de mes no valido
	 */
	public byte diasMes(byte mes) {
		/*
		 * este metodo fue hecho despues que la clase para validar
		 * por esta razon no esta integrado en esta
		 */
		switch(this.getMes()){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	return (byte)31;
        case 4:
        case 6:
        case 9:
        case 11:
        	return 30;
        case 2:
        	// comprobacion de año bisiesto
            if(this.getAnno()%400==0 || this.getAnno()%4==0 && this.getAnno()%100!=0) 
            	return 29;
        	return 28;
            	
        default:
           return 0;
	}
	}
	/**
	 * metodo que devuelve la fecha en una cadena
	 * @return formato dia-mes-anno
	 */
	public String corta() {
		//formateo para el para añadir un cero en mes o dia si es necesario
		String salida="";
		if(Integer.toString(this.getDia()).length()==1) salida+="0"+this.getDia()+"-";
		else salida+=this.getDia()+"-";
		if(Integer.toString(this.getMes()).length()==1) salida+="0"+this.getMes()+"-";
		else salida+=this.getMes()+"-";
		//salida
		return salida+this.getAnno();
	}
	/**
	 * metodo que devuelve el numero transcurridos desde 1-1-1900 hasta
	 * la fecha instanciada
	 * @return numero dias
	 */
	public int diasTranscurridos() {
		//variable para sumar los dias acumulados
		int diasAcumulados=0;
		//bucle que suma los dias de cada año
		for(int i=1901; i<this.getAnno();i++) {
			if(i%400 == 0 || i%4 == 0 && i%100 != 0)diasAcumulados+=366;
			else diasAcumulados+=365;
		}
		//bucle que suma los dias de cada mes
		for(byte i=1; i<this.getMes();i++) {
			diasAcumulados+=this.diasMes(i);
		}
		diasAcumulados+=this.getDia();
		return diasAcumulados;
	}
	/**
	 * este metodo calcula un supuesto dia de la semana para la fecha actual
	 * @return cadena con el dia
	 */
	public String diaSemana() {
		/*
		 * para el calculo del dia he usado el resto de 7, la base de este
		 * metodo es pasar los dias del mes a un numero modulo 7
		 */
		switch (this.getDia()%7) {
		case 0:
			return "domingo";
		case 1:
			return "lunes";
		case 2:
			return "martes";
		case 3:
			return "miercoles";
		case 4:
			return "jueves";
		case 5:
			return "viernes";
		case 6:
			return "sabado";
			//en este caso el uso del default es para suprimir un habiso del ide
			//teoricamente no pude darse el caso que de un resultado no controlado
		default:
			return "";
		}
	}
	/**
	 * metodo que devuelve el nombre de un mes
	 * @return cadena con el nombre del mes
	 */
	public String nombreMes() {
		switch(this.getMes()) {
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
			return "";
		}
	}
	/**
	 * metodo que formatea una salida larga para la fecha "a modo de frase"
	 * 
	 * @return nombreDia numeroDia de nombreMes de numeroAño
	 */
	public String larga() {
		return this.diaSemana() + " " + this.getDia() + " de "
				+ this.nombreMes() + " de " + this.getAnno(); 
	}
	/**
	 * metodo que devuelve una fecha despues de un numero de dias
	 * introducidos por parametro
	 * @param numDias
	 * @return la fecha resultante
	 */
	public Fecha fechaTras(long numDias) {
		Fecha fecha2 = new Fecha();
		for(long i=0l; i<numDias;i++) {
			fecha2.siguiente();
		}
		return fecha2;
	}
	/**
	 * metodo que calcula el numero de dias que hay entre dos fechas
	 * @param fecha2 fecha hasta la que hay que llegar
	 * @return numero de dias
	 */
	public int diasEntre(Fecha fecha2) {
		if(this.corta().equals("01-01-1900"))
			return fecha2.diasTranscurridos();
		//variable para sumar los dias acumulados
				int diasAcumulados=0;
				//bucle que suma los dias de cada año
				for(int i=this.getAnno(); i<fecha2.getAnno();i++) {
					if(i%400 == 0 || i%4 == 0 && i%100 != 0)diasAcumulados+=366;
					else diasAcumulados+=365;
				}
				//bucle que suma los dias de cada mes
				/*
				 * hay que tener en cuenta el los meses y los dias ya transcurridos
				 * de la fecha desde la que se empieza
				 */
				for(byte i=1; i<12;i++) {
					if(i<fecha2.getMes())
					diasAcumulados+=fecha2.diasMes(i);
					if(i<this.getMes())
					diasAcumulados-=this.diasMes(i);
				}
				diasAcumulados+=fecha2.getDia();
				diasAcumulados-=this.getDia();
				return diasAcumulados;
	}
	/**
	 * metodo que suma un dia a la fecha
	 */
	public void siguiente() {
		this.setDia((byte) (this.getDia()+1));
		if(this.getDia()==1)
			this.setMes((byte) (this.getMes()+1));
		if(this.getMes()==1)
			this.setAnno((short) (this.getAnno()+1));
	}
	/**
	 * resta un dia a la fecha
	 */
	public void anterior() {
		//caso que se reste siendo dia 1
		if(this.getDia()-1 == 0) {
			this.setDia(this.diasMes((byte) (mes-1)));
			//caso que se reste siendo enero
			if(this.getMes()==1) {
				this.setMes((byte) 12);
				this.setAnno((short) (this.getAnno()-1));
			}else this.setMes((byte) (this.getMes()-1));
		//caso que solo se reste un dia cualquiera
		}else this.setDia((byte) (this.getDia()-1));
	}
	/**
	 * devuelve una copia de la instancia
	 * @return
	 */
	public Fecha copia() {
		return this;
	}
	/**
	 * compara una fecha con otra e indica si tienen los mismos valores
	 * @param fecha2
	 * @return true si tienen el mismo valor false en caso contrario
	 */
	public boolean igualQue(Fecha fecha2) {
		if (this.getAnno() == fecha2.getAnno() 
			&& this.getMes() == fecha2.getMes()
			&& this.getDia() == fecha2.getDia())
			return true;
		return false;
	}
	/**
	 * metodo que compara la instancia con otra fecha dice si es menor
	 * @param fecha2
	 * @return true si es menor, false en caso contrario
	 */
	public boolean menorQue(Fecha fecha2) {
		if(this.getAnno() < fecha2.getAnno())
			return true;
		if(this.getAnno() == fecha2.getAnno()) {
			if(this.getMes() < fecha2.getMes())
				return true;
			if(this.getMes() == fecha2.getMes()) {
				if(this.getDia() < fecha2.getDia())
					return true;
			}
		}
		return false;
	}
	/**
	 * metodo que compara la instancia con otra fecha e indica si es mayor que esta
	 * @param fecha2
	 * @return true si es mayor, false en caso contrario
	 */
	public boolean mayorQue(Fecha fecha2) {
		if(this.getAnno() > fecha2.getAnno())
			return true;
		if(this.getAnno() == fecha2.getAnno()) {
			if(this.getMes() > fecha2.getMes())
				return true;
			if(this.getMes() == fecha2.getMes()) {
				if(this.getDia() > fecha2.getDia())
					return true;
			}
		}
		return false;
	}	
}
