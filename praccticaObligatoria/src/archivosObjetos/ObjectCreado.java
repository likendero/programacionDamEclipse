package archivosObjetos;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectCreado extends ObjectOutputStream  {
    /**
     * constructor
     * @param escritor
     * @throws IOException
     */
    public ObjectCreado(FileOutputStream escritor) throws IOException {
        super(escritor);
    }
    @Override
    public void writeStreamHeader(){

    }
}
