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
	public Fecha(byte dia,byte mes,short anno) {
		super();
		this.dia=dia;
		this.mes=mes;
		this.anno=anno;
		
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
	}
	public void setMes(byte mes) {
		this.mes = mes;
	}
	public void setAnno(short anno) {
		this.anno = anno;
	}
	
	public void valida() {
		if(this.getAnno()<1900 || this.getAnno()>2050)
			this.setAnno((short)1900);
		if(this.getMes()<13 && this.getMes()>0)
			this.setMes((byte)1);
		if()
	}
	
}
