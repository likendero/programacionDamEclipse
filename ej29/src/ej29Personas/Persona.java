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
package ej29Personas;

import java.io.Serializable;

/**
 *  clase persona que almacena sus atributos
 * @author liken
 */
public class Persona implements Serializable{
    private String nombre;
    private String apellidos;
    private String telefono;
    private String nif;
    private static final long serialVersionUID = 1L;
    /**
     * constructor por defecto
     */
    public Persona() {
    }
    /**
     * constructor parametrizado
     * @param nombre
     * @param apellidos
     * @param telefono
     * @param nif 
     */
    public Persona(String nombre, String apellidos, String telefono, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.nif = nif;
    }
    /**
     * constructor de copia
     * @param persona 
     */
    public Persona(Persona persona){
        super();
        this.nombre = persona.getNombre();
        this.apellidos = persona.getApellidos();
        this.telefono = persona.getTelefono();
        this.nif = this.getNif();
    }
    // GETTERS SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    ////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return   "nombre=" + nombre + "\napellidos=" + apellidos + "\ntelefono=" + telefono + 
                 "\nnif=" + nif;
    }
    
}
