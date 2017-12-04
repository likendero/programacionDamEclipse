package ajedrez;
	
public class Rey {
	Color color;
	private Posicion posicion;
	/**
	 * constructor por defecto
	 */
	public Rey() {
		super();
		this.posicion= new Posicion();
		color=Color.BLANCO;
	}
	/**
	 * constructor de clase, al asingnar el color asigna automaticamente la posicion
	 * @param color
	 */
	public Rey(Color color) {
		if(color==Color.BLANCO) {
			this.posicion=new Posicion(1,'e');
		}
		this.posicion= new Posicion(8,'e');
	}
	public Color getColor() {
		return color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	@Override
	public String toString() {
		return posicion.toString() + " " + this.getColor().toString();
	}
	
	public void mueve(Direccion direccion) {
		boolean alerta=false;
		switch(direccion) {
		case NORTE: 
			if(this.getPosicion().getFila()!=8) {
				this.getPosicion().setFila(this.getPosicion().getFila()+1);
			}else alerta=true;
			break;
		case ESTE:
			if(this.getPosicion().getColumna()!='a') {
				this.getPosicion().setColumna((char)((int)this.getPosicion().getColumna()-1));
			}else alerta=true;
			break;
		case SUR:
			if(this.getPosicion().getFila()!=1) {
				this.getPosicion().setFila(this.getPosicion().getFila()-1);
			}alerta=true;
			break;
		case OESTE:
			if(this.getPosicion().getColumna()!='h') {
				this.getPosicion().setColumna((char)((int)this.getPosicion().getColumna()+1));
			}else alerta=true;
			break;
		case NORESTE:
			if(this.getPosicion().getColumna()!='a' && this.getPosicion().getFila()!=8) {
				this.getPosicion().setColumna((char)((int)this.getPosicion().getColumna()-1));
				this.getPosicion().setFila(this.getPosicion().getFila()+1);
			}else alerta=true;
			break;
		case NOROESTE:
			
		}
	}
	
}


