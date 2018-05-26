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

import ej29Personas.Persona;
import java.io.*;
/**
 * clase que sirve para la lectura del archivo de personas
 * @author Javier Gonzalez Rives
 */
public class ej29Lectura {
    private static File archivo = new File("personas.obj");
    /**
     * metodo que devuelve una cadena de la persona que coincide en el fichero
     * @param nif
     * @return 
     */
    public static ej29Personas.Persona lectorPersonas(String nif){
        Persona persona = new Persona();
        try{
            
           FileInputStream flujoLector = new FileInputStream(archivo);
           ObjectInputStream lector = new ObjectInputStream(flujoLector);
           // primera lectura
           Persona aux = (Persona)lector.readObject();
           
           while(true){
                
               // en el caso que el nif sea igual se coge la informacion
               if(aux.getNif().equals(nif) ){
                  return aux;
               }
               // lectura siguiente 
               aux = (Persona)lector.readObject();
           }
        }catch(IOException io){
             return null;
        }catch(Exception ex){
            ex.printStackTrace();
             return persona;
        }
        
    }
}
