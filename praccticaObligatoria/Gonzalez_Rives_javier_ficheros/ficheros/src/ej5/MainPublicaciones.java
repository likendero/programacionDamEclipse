package ej5;
import java.io.*;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * clase que guarda registros de publicaciones
 * @author Javier Gonzalez Rives
 */
public class MainPublicaciones {
    // Almacen de objetos

    private static Scanner key = new Scanner(System.in);
    /**
     * main
     * @param args
     */
    public static void main(String[] args){
        int introduccion;
        boolean control =  false;
        do {
            try {
                // menu para seleccionar si , intro , ver o fin
                System.out.println("MENU");
                System.out.println("1. introducir nueva publicacion");
                System.out.println("2. mostrar publicaciones");
                System.out.println("0. salir del programa");
                introduccion = key.nextInt();
                key.nextLine(); // limpieza buffer
                switch (introduccion){
                    case 1:
                        // menu para introduccir datos
                        menuIntroduccion();
                        break;
                    case 2:
                        //  salida por pantalla de la informacion
                        lectura();
                        break;
                    // FIN DEL PROGRAMA
                    case 0:
                        control = true;
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                }
            }
            // control de teclado
            catch(InputMismatchException in){
                System.out.println("error en la introduccion");
                key.nextLine();
            }
            // control general
            catch (Exception ex){
                ex.printStackTrace();
                key.nextLine();
            }
        }while(!control);
    }

    /**
     * metodo que sirve para mostrar un menu en el que seleccionar
     * que tipo de publicacion se trata
     */
    private static void menuIntroduccion(){
        int introduccion;
        boolean control = false;
        do{
            try{
                System.out.println("1. libro 2. revista 3. volver");
                introduccion = key.nextInt();
                key.nextLine();
                switch (introduccion){
                    // introducir libros
                    case 1:
                        introducirLibro();
                        break;
                    // introducir revista
                    case 2:
                        introducirRevista();
                        break;
                    case 3:
                        control = true;
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                }
            }
            catch(InputMismatchException in){
                System.out.println("entrada incorrecta");
                key.nextLine();
            }
            catch(Exception ex){
                ex.printStackTrace();
                key.nextLine();
            }
        }while(!control);
    }

    /**
     * metodo que sirve para introducir un objeto del tipo libro en
     */
    private static void introducirLibro()throws IncorrectDataException {
        boolean control = false;
        do {
            try {

                Libros libro = new Libros();
                Publicaciones pub = crearPublicacion();
                // INTRODUCCIONES
                do {
                    // ISBN
                    System.out.println("introduce isbn(solo 10 numeros)");
                    libro.setIsbn(key.next());
                    key.nextLine(); // limpieza buffer
                } while (!libro.getIsbn().matches("^[0-9]{10}"));
                do {
                    // AUTOR
                    System.out.println("introduce el nombre del autor");
                    libro.setAutor(key.next());
                    key.nextLine();
                } while (!libro.getAutor().matches("^[a-z A-Z]+"));
                // creacion del libro final
                libro = new Libros(pub, libro);
                // escritura en el archivo
                preEscritorPubliacion(libro);
                control = true;
            } catch (InputMismatchException in) {
                System.out.println("error en la introduccion");
                key.nextLine();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }while(!control);
    }

    /**
     * metodo que sirve para introducir una nueva revista
     * con todos sus datos
     */
    private static void introducirRevista(){
        boolean control = false;
        do {
            try {
                // creacion de la revista y de la publicacion
                Revistas revista = new Revistas();
                Publicaciones pub = crearPublicacion();
                // introduccion de la circulacion
                do{
                    System.out.println("introduce el numero de la circulacion");
                    revista.setCirculacion(key.nextLong());
                }while(revista.getCirculacion() <= 0);
                // introduccion nº tirada
                do{
                    System.out.println("introduce numero de ejemplares por anno");
                    revista.setCirculacion(key.nextLong());
                }while(revista.getNumerosPorAnno() < 0);
                revista = new Revistas(pub,revista);
                preEscritorPubliacion(revista);
                control = true;
            } catch (InputMismatchException in) {
                System.out.println("error en la introduccion");
                key.nextLine();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }while(!control);

    }

    /**
     * metodo que sirve para crear una publicacion
     */
    private static Publicaciones crearPublicacion()  {
        //creacion de la instancia contenedor
        Publicaciones publicacion = new Publicaciones();
        // creacion del contenedor de la fecha
        int anno, dia, mes;
        // introduccion del titulo
        System.out.println("introduce el titulo de la publicacion");
        publicacion.setTitulo(key.nextLine());

        // introduccion del editor
        System.out.println("introduce el editor");
        publicacion.setEditor(key.nextLine());

        // introduccion de la fecha
        System.out.println("introduce el anno");
        anno = key.nextInt();
        System.out.println("introduce el mes");
        mes = key.nextInt();
        System.out.println("introduce el dia");
        dia = key.nextInt();
        // instanciacion del calendario
        GregorianCalendar calendario = new GregorianCalendar(anno,mes,dia);
        // agregacion del calendario
        publicacion.setFecha(calendario);
        return publicacion;
    }

    /**
     * metodo que crea la ruta y prepara el flujo
     * @param pub
     */
    public static void preEscritorPubliacion(Publicaciones pub){
        try{
            // creacion del objeto fichero
            File archivo = new File("c:/ficheros","publicaciones.obj");
            // en el caso que exista crea el flujo
            if(archivo.exists()){
                FileOutputStream flujo = new FileOutputStream(archivo,true);
                escritorPublicacionesExiste(flujo,pub);
                System.out.println("escrito");
                flujo.close();
            }else{
                // creacion del directorio
                if(new File(archivo.getParent()).mkdirs()){
                    System.out.println("directorio creado");
                }
                // creacion del flujo
                FileOutputStream flujo = new FileOutputStream(archivo);
                escritorPublicacionesNoEx(flujo,pub);
                System.out.println("escrito");
                flujo.close();
            }
        }catch (FileNotFoundException fi){
            System.out.println("archivo no encontrado");
        }catch(IOException io){
            System.out.println("error escritura");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * metodo que escribe la publicacion creada en el caso que todabia no exista el archivo
     * @param flujo salida de byts al archivo
     * @param pub publicacion anteriormente creada
     * @throws IOException
     * @throws FileNotFoundException
     */
    private static void escritorPublicacionesExiste(FileOutputStream flujo,Publicaciones pub)throws IOException,FileNotFoundException{
        // creacion del escritor objeto
        ObjectCreado escritor = new ObjectCreado(flujo);
        // escritura
        escritor.writeObject(pub);
        // cerrado
        escritor.close();
    }

    /**
     * metodo que escribe la publicacion creada pero en el caso que el fichero ya exista
     * @param flujo salida de bites al archivo
     * @param pub publicacion creada
     * @throws IOException
     * @throws FileNotFoundException
     */
    private static void escritorPublicacionesNoEx(FileOutputStream flujo,Publicaciones pub)throws IOException,FileNotFoundException{
        // creacion del escritor objeto
        ObjectOutputStream escritor = new ObjectOutputStream(flujo);
        // escritura
        escritor.writeObject(pub);
        // cerrado
        escritor.close();
    }
    // LECTURA /////////////////////////
    public static void lectura(){
        try{
            // creacion del flujo
            File archivo = new File("c:/ficheros","publicaciones.obj");
            lecturaPublicaciones lector = new lecturaPublicaciones(archivo);
            // lectura de la cadena
            String aux = lector.toString();

            /*
            caso de error de entrada salida,
            en el caso que no se halla hecho ninguna introduccion dara error
            por no encontrar el fichero
             */
        }catch (IOException io){
            System.out.println(io.getMessage());
        }
    }
}

/**
 * clase que se encarga de la lectura de publicaciones de un fichero
 */
class lecturaPublicaciones{
    private FileInputStream flujo;
    private ObjectInputStream pub;
    /**
     * constructor indicando ruta
     * @param archivo ruta con nombre del archivo para las publicaciones
     */
    public lecturaPublicaciones(File archivo)throws IOException{
        super();
        // en el caso que no exista el fichero y/o directorio
        if(archivo.exists()) {
            /*
             * creacion del flujo
             */
            this.flujo = new FileInputStream(archivo);
            /*
             * formateo del objeto
             */
            this.pub = new ObjectInputStream(this.flujo);
        } else
            throw new IOException("no existe nigun fichero o introduccion");
    }

    public Publicaciones siguientePublicacion()throws IOException,ClassNotFoundException{
        return (Publicaciones)pub.readObject();
    }

    /**
     * metodo que sirve para pasar a cadena la informacion de las publicaciones
     * @return cadena con la informacion
     */
    public String toString(){
        // cadena para la salida
        String salida = "";
        Publicaciones publi;
        try{

            // bucle lector
            while(true){
                publi = (Publicaciones) pub.readObject();
                salida += publi.toString();
            }
        }catch (ClassNotFoundException cl){
            System.out.println("clase no encontrada");
        }catch  (IOException io){
            System.out.println("fin lectura");

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return salida;
    }
}








