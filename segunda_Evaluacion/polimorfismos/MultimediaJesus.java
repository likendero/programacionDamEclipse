package polimorfismos;

/**
 * Almacena información de los objetos de tipo multimedia: pelis, discos, mp3,
 * mp4...
 * Atributos:
 * título, autor, formato y duración como atributos.
 * formatos:
 *  wav, mp3, midi, avi, mov, mpg, cdAudio y dvd.
 *
 * El valor de todos los atributos se pasa como parámetro en el momento de
 * crear el objeto. Esta clase tiene además un método toString que devuelve
 * la información del objeto.
 * método igual que recibe un Multimedia y devuelve si el título y el autor
 * son iguales
 */
public class MultimediaJesus {
    private String titulo, autor, formato, duracion;
    /**
     * constructor parametrizado
     * @param titulo
     * @param autor
     * @param formato
     * @param duracion
     */
    public MultimediaJesus(String titulo, String autor, String formato,
        String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        if (validaFormato(formato))
            this.formato = formato;
        else
            this.formato = "desconocido";
    }
    /**
     * 
     * @param formato
     * @return
     */
    private static boolean validaFormato(String formato){
        switch(formato){
            case "wav": case "mp3": case "midi": case "avi": case "mov":
            case "mpg": case "cdAudio": case "dvd":
                return true;
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        return "Canción: " + titulo + " - autor: " + autor + "\nFormato: " +
        formato + " - duración: " + duracion;
    }

    public boolean igual(MultimediaJesus cancion){
        return this.titulo.equalsIgnoreCase(cancion.titulo) &&
        this.autor.equalsIgnoreCase(cancion.autor);
    }
}
