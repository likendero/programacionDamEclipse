
package temaTres;

/*
->constructores
por defecto =1 de la tarde
constructor de clase
copia
->metodos
setter y getters
2 tostring, el clasico y escribe la hora con formato HH:MM:SS
validar la hora 
hora seguendo siguiente 
hora segundo anterior 
*/
/**
 *
 * @author liken
 */
public class Hora {
    private int hora;
    private int segundos;
    private int minutos;
    /**
     * constructor por defecto
     */
    public Hora(){
        super();
        this.hora=13;
        this.minutos=0;
        this.segundos=0;
    }
    /**
     * constructor completo con todos los datos, 
     * @param hora dato entero con la hora, minimo 0 y menor que 24
     * @param minutos dato entero que almacena los minutos, minimo  0 y menor que 60
     * @param segundos dato entero que almacena los segundos, minimo  0 y menor que 60 
     */
    public Hora(int hora,int minutos,int segundos){
        super();
        this.hora=hora;
        this.minutos=minutos;
        this.segundos=segundos;
    }
    /**
     * constructor que copia a otra instancia del objeto Hora
     * @param hora2 Hora a copiar
     */
    public Hora(Hora hora2){
        super();
        this.hora=hora2.hora;
        this.segundos=hora2.segundos;
        this.minutos=hora2.minutos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    @Override
    public String toString(){
        return "hora: "+hora+" minutos: "+minutos+" segundos: "+segundos;
    }
    /**
     * formateo de la hora
     * @return la hora con formato HH:MM:SS
     */
    public String mostrarHora(){
        String fh="";
        String fm="";
        String fs="";
        if(segundos>9){
            fs+=segundos;
        }else{
            fs+=0;
            fs+=segundos;
        }
        if(minutos>9){
            fm+=minutos;
        }else{
            fm+=0;
            fm+=minutos;
        }
        if(hora>9){
            fh+=hora;
        }else{
            fh+=0;
            fh+=hora;
        }
        return fh+":"+fm+":"+fs;
    }
    /**
     * comprobacion de la hora
     * @return devuelve true o false segun si la hora es valida
     */
    public boolean validarHora(){
        
        if(hora>=24 || hora<0)return false;
        if(minutos>59 || minutos<0)return false;
        if(segundos>59 || segundos<0)return false;
        return true;
    }
    /**
     * suma un segundo a la hora cuadrandola para que sea correcta
     */
    public void sumarSegundo(){
        
        if(segundos==59){
            segundos=0;
            minutos+=1;
        }else segundos+=1;
        if(minutos==60){
            minutos=0;
            hora+=1;
        }
        if( hora==24)hora=0;
    }
    /**
     * resta un segundo a la hora cuadrandola para que sea correcta
     */
    public void segundoAnterior(){
        if(segundos==0){
            segundos=59;
            minutos-=1;
        }else segundos-=1;
        if(minutos==-1){
            minutos=59;
            hora-=1;
        }
        if(hora==-1){
            hora=23;
        }
        
    }
    /**
     * esta clase calcula el tiempo restante hasta media noche
     * @return tiempo restante formateado
     */
    public String tiempoHastaMediaNoche(){
        int horilla,minutillos,segundillos;
        horilla=0;
        minutillos=0;
        segundillos=0;
        
        if(this.getSegundos()!=0){
           segundillos=60-this.getSegundos();
        }
        if(this.getMinutos()!=0){
            minutillos=60-this.getMinutos();
        }
        if(this.getHora()!=0){
            horilla=24-this.getHora();
        }
        return horilla+":"+minutillos+":"+segundillos;
    }
    /**
     * resta dos horas devolviendo la diferencia con formato
     * @param restador hora que se resta
     * @return diferencia con formato
     */
    public String restarHoras(Hora restador){
        int horilla,minutillos,segundillos;
        horilla=this.getHora();
        minutillos=this.getMinutos();
        segundillos=this.getSegundos();
        // segundo####################################################3
        if(segundillos==0 && restador.getHora()>0){
            minutillos-=1;
            segundillos=60-restador.getSegundos();
        }else if(segundillos<restador.getSegundos()){
            segundillos-= restador.getSegundos();
            segundillos+=60;
            minutillos+=segundillos;
        }else{
            segundillos-= restador.getSegundos();
        }
        //minutos###################################################
        //llevada de la anterior
        if(minutillos<0){
            minutillos+=60;
            horilla-=1;
            
        }
        //resta de los minutos
        // si los minutos son 0 y hay minutos para restar
        if(minutillos==0 && minutillos>0){
            minutillos=60-restador.getMinutos();
            horilla-=1;
        //en el caso de que los minutos no sean 0 y se reste un numero mayor a estos
        }else if(minutillos<restador.getMinutos()){
            minutillos-=restador.getMinutos();
            minutillos+=60;
            horilla-=1;
        // si no hay ningun problema en la resta
        }else{
            minutillos-=restador.getMinutos();
        }
        if(horilla<0){
            horilla+=24;
        }
        //resta de las horas
        //  si las horas son 0 y hay horas para restar
        if(horilla==0 && restador.getHora()>0){
            horilla=24-restador.getHora();
        //en el caso de que la hora no sea 0 pero esta sea menor que la resta
        }else if(horilla<restador.getHora()){
            horilla-=restador.getHora();
            horilla+=24;
        // si no hay ningun problema en la resta
        }else{
            horilla-=restador.getHora();
        }
        String salida="";
        if(horilla<10)salida+="0"+horilla+":";
        else salida+=horilla+":";
        if (minutillos<10)salida+="0"+minutillos+":";
        else salida+= minutillos+":";
        if (segundillos<10)salida+="0"+segundillos;
        else salida+=segundillos;
        
        return salida; 
        }
    /**
     * diferencia en segundos
     * @param restador hora que se quiere restar
     * @return valor entero qu erepresnta los segundos
     */
    public int restaVueltaSegundos(Hora restador){
        // pasa todo a segundos y resta la diferencia devolviendo el valor absoluto
        return Math.abs((this.getHora()*3600+this.getMinutos()*60+this.getSegundos())
                - (restador.getHora()*3600+restador.getMinutos()*60+restador.getSegundos()));
    }
    }
    

