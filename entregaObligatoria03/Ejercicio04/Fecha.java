package Ejercicio04;

public class Fecha {
	byte dia,mes;
	short anno;
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
	public Fecha(byte dia,byte mes,short anno) {
		super();
		this.dia=dia;
		this.mes=mes;
		this.anno=anno;
		this.valida();
		
	}
	public byte getDia() {
		return dia;
	}
	public byte getMes() {
		return mes;
	}
	public short getAnno() {
		return anno;
	}
	public void setDia(byte dia) {
		this.dia = dia;
		this.valida();
	}
	public void setMes(byte mes) {
		this.mes = mes;
		this.valida();
	}
	public void setAnno(short anno) {
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
			this.setAnno((short)1900);
		//caomprobacion que el mes esta en rango
		if(this.getMes()<13 && this.getMes()>0)
			this.setMes((byte)1);
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
            	this.setDia((byte)1);
            break;
        case 4:
        case 6:
        case 9:
        case 11:
        	//comprobacion del rango de los dias de 30
        	if(this.getDia()<1 && this.getDia()>30)
            	this.setDia((byte)1);
            break;
        case 2:
        	// comprobacion de año bisiesro
            if(this.getAnno()%400==0 || this.getAnno()%4==0 && this.getAnno()%100!=0) {
            	//comprobacion del rango de los dias de 29
            	if(this.getDia()<1 && this.getDia()>29)
                	this.setDia((byte)1);
            	//comprobacion del rango de los dias de 28
            }else if(this.getDia()<1 && this.getDia()>28)
            	this.setDia((byte)1);
            break;
        default:
            this.setDia((byte)1);
            break;
	}
	}
	
}
