package pruebaAccesoAleatorio;
import java.io.*;
/**
 *
 * @author liken
 */
public class PruebaAccesoAleatorio {
    private static File archivo = new File("c:/ficheros/aleatorio.data");
    public static void main(String[] args) {
        String cadena = "";
        int numCar=20;
        int tamReg = 20*2+2;
        try{
           RandomAccessFile escritor = new RandomAccessFile(archivo,"rw");
            for(int i = 0; i < 5; i++){
                escritor.seek(i*tamReg);
                escritor.writeUTF(cadena);
            }
            escritor.seek(3*tamReg);
            escritor.writeUTF("hola que tal");
            escritor.seek(0*tamReg);
            escritor.writeUTF("ajajajaj");
            escritor.close();
        }catch(IOException io){
            System.out.println("ERROR");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
