/*
 * Copyright (C) 2018 Javier Gonzalez Rives
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ej29IO;
import java.io.*;
/**
 * clase que se encarga de escribir en un fichero la informacion
 * de la persona
 * @author Javier Gonzalez Rives
 * 
 */
public class ej29Escritura {
    private static File archivo = new File("personas.obj");
    /**
     * metodo que prepara la escritura segun el estado del fichero
     * @param persona 
     */
    public static void escribirPersona(ej29Personas.Persona persona){
        // en el caso que exista el fichero 
        if(archivo.exists()){
            escribirExiste(persona);
         // en el caso que el fichero no exista   
        }else{
            escribirNoExiste(persona);
        }
    }
    /**
     * metod que escribe en el archivo la persona deseada si el fichero existe
     * previamente
     */
    private static void escribirExiste(ej29Personas.Persona persona){
        try{
            // creacion del canal de escritua
            FileOutputStream flujoEscritor = new FileOutputStream(archivo,true);
            MiObjetoEscritor escritor = new MiObjetoEscritor(flujoEscritor);
            // escritura
            escritor.writeObject(persona);
            // cierre
            escritor.close();
            flujoEscritor.close();
        }catch(IOException io){
            System.out.println("error en la escritura");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    /**
     * metodo que escribe una persona en un fichero nuevo
     * @param persona 
     */
    private static void escribirNoExiste(ej29Personas.Persona persona){
        try{
            // creacion del canal de escritua
            FileOutputStream flujoEscritor = new FileOutputStream(archivo);
            ObjectOutputStream escritor = new ObjectOutputStream(flujoEscritor);
            // escritura
            escritor.writeObject(persona);
            // cierre
            escritor.close();
            flujoEscritor.close();
        }catch(IOException io){
            System.out.println("error en la escritura");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
