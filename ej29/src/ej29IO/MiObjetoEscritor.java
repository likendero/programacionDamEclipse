
package ej29IO;

import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author liken
 */
public class MiObjetoEscritor extends java.io.ObjectOutputStream {
    /**
     * constructor por defecto
     * @throws IOException 
     */
    public MiObjetoEscritor() throws IOException {
        super();
    }
    /**
     * constructor parametrizado
     * @param out
     * @throws IOException 
     */
    public MiObjetoEscritor(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // na de na
    }
    
}
