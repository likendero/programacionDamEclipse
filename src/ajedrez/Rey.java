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
	/**
	 * metodo que sirve para hacer el desplazamiento del rey, no permite hacer 
	 * movimientos invalidos
	 * @param direccion
	 */
	public void mueve(Direccion direccion) {
		/*
		 alerta sirve como switch de aviso en el caso 
		 que se haga un movimiento no valido
		*/
		boolean alerta=false;
		switch(direccion) {
		case NORTE: 
			//comprobacion que no este en el tope norte
			if(this.getPosicion().getFila()!=8) {
				this.getPosicion().setFila(this.getPosicion().getFila()+1);
			}else alerta=true;
			break;
		case ESTE:
			//comprobacion que no este en el tope este
			if(this.getPosicion().getColumna()!='a') {
				this.getPosicion().setColumna((char)((int)this.getPosicion().getColumna()-1));
			}else alerta=true;
			break;
		case SUR:
			//comprobacion que no este en el tope sur
			if(this.getPosicion().getFila()!=1) {
				this.getPosicion().setFila(this.getPosicion().getFila()-1);
			}alerta=true;
			break;
		case OESTE:
			// comprobacion que no este en el tope oeste
			if(this.getPosicion().getColumna()!='h') {
				this.getPosicion().setColumna((char)((int)this.getPosicion().getColumna()+1));
			}else alerta=true;
			break;
		case NORESTE:
			//comprobacion que no este ni en el tope norte y este
			if(this.getPosicion().getColumna()!='a' && this.getPosicion().getFila()!=8) {
				this.getPosicion().setColumna((char)((int)this.getPosicion().getColumna()-1));
				this.getPosicion().setFila(this.getPosicion().getFila()+1);
			}else alerta=true;
			break;
		case NOROESTE:
			//comprobacion que no este en el tope norte y este
			if(this.getPosicion().getColumna()!='h' && this.getPosicion().getFila()!=8) {
				this.getPosicion().setColumna((char)((int)this.getPosicion().getColumna()+1));
				this.getPosicion().setFila(this.getPosicion().getFila()+1);
			}else alerta=true;
			break;
		case SURESTE:
			//comprobacion que no este en el tope sur y este
			if(this.getPosicion().getColumna()!='a' && this.getPosicion().getFila()!=1) {
				this.getPosicion().setColumna((char)((int)this.getPosicion().getColumna()-1));
				this.getPosicion().setFila(this.getPosicion().getFila()-1);
			}else alerta=true;
			break;
		case SUROESTE:
			//comprobacione que no este en el tope sur y oeste
			if(this.getPosicion().getColumna()!='h' && this.getPosicion().getFila()!=1) {
				this.getPosicion().setColumna((char)((int)this.getPosicion().getColumna()+1));
				this.getPosicion().setFila(this.getPosicion().getFila()-1);
			}else alerta=true;
			break;
			default:
				System.out.println("dato no valido");
				break;
		}
		if(alerta)
			System.out.println("movimiento no valido");
	}
	
}


