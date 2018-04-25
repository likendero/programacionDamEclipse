package ej5;

import java.io.OutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectCreado extends ObjectOutputStream  {
    /**
     * constructor
     * @param escritor
     * @throws IOException
     */
    public ObjectCreado(OutputStream escritor) throws IOException {
        super(escritor);
    }
    @Override
    public void writeStreamHeader(){

    }
}
