/*
 * Copyright (C) 2018 liken
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
package ej20Pizzeria;

import java.util.ArrayList;

/**
 *
 * @author liken
 */
public class Pizza {
    private String tamanno;
    private ArrayList<String> ingredientes;
    /**
     * cosntructor por defecto que inicializa la coleccion
     * para los ingredientes
     */
    public Pizza() {
        ingredientes = new ArrayList<String>();
    }
    /**
     * cosntructor parametrizado completo
     * @param tamanno
     * @param ingredientes 
     */
    public Pizza(String tamanno, ArrayList<String> ingredientes) {
        this.tamanno = tamanno;
        this.ingredientes = ingredientes;
    }
    /**
     * cosntructor parametrizado solo con el tamanno pero inicializa el arrayList de 
     * ingredientes
     * @param tamanno 
     */
    public Pizza(String tamanno) {
        this.tamanno = tamanno;
        ingredientes = new ArrayList<String>();
    }
    //GETTERS SETTERS
    public String getTamanno() {
        return tamanno;
    }

    public void setTamanno(String tamanno) {
        this.tamanno = tamanno;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    ///////////////////////////
    @Override
    public String toString(){
        // creacion de variable de salida
        String cadena = "";
        cadena += "tamanno: " + tamanno + "\ningredientes:\n";
        for(String i: ingredientes){
            cadena += i+'\n';
        }
        return cadena;
        
    }
    /**
     * metodo qeu devuelve el numero de ingredientes que hay en la 
     * pizza
     * @return 
     */
    public int numIngredientes(){
        return ingredientes.size();
    }
    /**
     * metodo que devuelve en forma de cadena los ingredientes de la pizza
     * @return 
     */
    public String ingredientes(){
    String cadena = "";
    for(String i: ingredientes){
            cadena += i+'\n';
        }
        return cadena;
    }
    /**
     * metodo que sirve para annadir un ingrediente a la pizza
     * @param ing 
     */
    public void addIng(String ing){
        ingredientes.add(ing);
    }
}
