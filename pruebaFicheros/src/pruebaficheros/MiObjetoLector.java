/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaficheros;

import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author liken
 */
public class MiObjetoLector extends java.io.ObjectOutputStream {
    /**
     * constructor por defecto
     * @throws IOException 
     */
    public MiObjetoLector() throws IOException {
        super();
    }
    /**
     * constructor parametrizado
     * @param out
     * @throws IOException 
     */
    public MiObjetoLector(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // na de na
    }
    
}
