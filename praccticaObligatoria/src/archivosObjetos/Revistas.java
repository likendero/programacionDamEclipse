package archivosObjetos;

import java.util.GregorianCalendar;

public class Revistas extends Publicaciones {
    private static long serialVersionUID = 1L;
    private int numerosPorAnno;
    public long circulacion;

    // constructores

    /**
     * cosntructor por defecto
     */
    public Revistas(){
        super();
    }

    public Revistas(int numerosPorAnno, long circulacion) {
        this.numerosPorAnno = numerosPorAnno;
        this.circulacion = circulacion;
    }

    public Revistas(String titulo, String editor, GregorianCalendar fecha, int numerosPorAnno, long circulacion) {
        super(titulo, editor, fecha);
        this.numerosPorAnno = numerosPorAnno;
        this.circulacion = circulacion;
    }
    public Revistas(Publicaciones publicaciones,Revistas revistas){
        super(publicaciones.getTitulo(),
              publicaciones.getEditor(),
              publicaciones.getFecha());

        this.circulacion = revistas.getCirculacion();
        this.numerosPorAnno = revistas.getNumerosPorAnno();
    }
    // GETTERS SETTERS
    public int getNumerosPorAnno() {
        return numerosPorAnno;
    }

    public void setNumerosPorAnno(int numerosPorAnno) {
        this.numerosPorAnno = numerosPorAnno;
    }

    public long getCirculacion() {
        return circulacion;
    }

    public void setCirculacion(long circulacion) {
        this.circulacion = circulacion;
    }
    //////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return  super.toString() + '\n' + "Revistas{" +
                "numerosPorAnno=" + numerosPorAnno +
                ", circulacion=" + circulacion +
                '}';
    }
}
