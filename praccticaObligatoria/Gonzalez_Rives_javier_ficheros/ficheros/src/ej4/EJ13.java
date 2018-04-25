package ej4;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase coge los ficheros ciudad y pais creados en el apartado anterior y
 * los fusiona preguntando por menu el orden
 * @author Javier Gonzalez Rives
 */
public class EJ13 {
    private static Scanner key = new Scanner(System.in);

    /**
     * metodo principal
     * @param args
     */
    public static void main(String[] args){
        boolean control = false;
        File directorio = null;
        File pais = null;
        File ciudad = null;
        do{
            try{
                System.out.println("introduce un directorio donde se encuentren los archivos ciudad y pais");
                directorio = new File(key.next());
                key.nextLine();

                pais = new File(directorio,"paises.txt");
                ciudad = new File(directorio,"ciudades.txt");
                // comprobacion de que existen los ficheros
                if(pais.exists() && ciudad.exists()){
                    // llamada al menu
                    menuOrden(pais,ciudad);
                }
                else{
                    System.out.println("no se han encontrado los archivos requeridos");
                }
                control = true;
            }catch(InputMismatchException in){
                System.out.println("error en la introduccion");
                key.nextLine();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }while(!control);
    }

    /**
     * metodo que muestra un menu para decidir si se quiere que aparezca primero
     * los paises o las ciuaddes
     */
    private static void menuOrden(File pais,File ciudad){
        int introduccion = 0;
        boolean control = false;
        do{
            try{
                // opciones del menu
                System.out.println("menu");
                System.out.println("1. primero ciudades (ciudades_paises.txt)");
                System.out.println("2. primero paises (paises_ciudades.txt)");
                System.out.println("0. Fin del programa");
                // introduccion del la opcion
                introduccion = key.nextInt();
                // selector
                switch (introduccion){
                    case 1:
                        // opcion primero ciudades
                        primeroCiudad(ciudad,pais);
                        break;
                    case 2:
                        // opcion primero paises
                        primeroPais(pais,ciudad);
                        break;
                    case 0:
                        // fin de programa
                        control = true;
                        System.out.println("fin de programa");
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                }

                // caso de error en la introduccion
            }catch(InputMismatchException in){
                System.out.println("error en la introduccion");
                key.nextLine();
                // fallo no controlado
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }while(!control);
    }

    /**
     * metodo que fusiona paises y cidades, primero paises
     * @param pais fichero con los paises
     * @param ciudad fichero con las ciudades
     */
    public static void primeroPais(File pais, File ciudad){
        try{
            // creacion de flujos
            FileReader flujoPais = new FileReader(pais);
            FileReader flujoCiudad = new FileReader(ciudad);
            // objeto File para paises ciudades
            System.out.println(pais.getParent());
            File paisCiudad = new File(pais.getParent(),"paises_ciudades.txt");
            // creacion flujo
            FileWriter mezcla = new FileWriter(paisCiudad);
            // impresion
            PrintWriter escritor = new PrintWriter(mezcla);
            // Buffer pais
            BufferedReader lec = new BufferedReader(flujoPais);
            // llamada al metodo escritor
            escritura(escritor, lec);
            // cierre flujo lectura paises
            lec.close();
            // apertura lectura ciudades
            lec = new BufferedReader(flujoCiudad);
            // llamada al metodo escritor
            escritura(escritor,lec);
            // cerrado
            lec.close();
            escritor.close();
            flujoCiudad.close();
            flujoPais.close();
            // si no se encuentra el fichero
        }catch(FileNotFoundException fi){
            System.out.println("archivo no encontrado :0");
            // si hay un error de entrada salida
        }catch(IOException io){
            System.out.println("error de entrada salida");
            // Un error no controlado
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * metodo que sirve para escribir con un printwriter y un buffer proporcionados
     * @param escritor
     * @param lec
     * @throws IOException
     */
    private static void escritura(PrintWriter escritor, BufferedReader lec) throws IOException {
        // cadena auxiliar
        String aux = lec.readLine();
        while(aux != null){
            // impresion de linea
            escritor.println(aux);
            // nueva lectura
            aux = lec.readLine();
        }

    }

    /**
     * metodo que fusiona paises y ciudades con ciudades primero
     * @param ciudad
     * @param pais
     */
    public static void primeroCiudad(File ciudad, File pais){
        try{
            // creacion de flujos
            FileReader flujoPais = new FileReader(pais);
            FileReader flujoCiudad = new FileReader(ciudad);
            // objeto File para paises ciudades
            System.out.println(pais.getParent());
            File paisCiudad = new File(pais.getParent(),"ciudades_paises.txt");
            // creacion flujo
            FileWriter mezcla = new FileWriter(paisCiudad);
            // impresion
            PrintWriter escritor = new PrintWriter(mezcla);
            // Buffer pais
            BufferedReader lec = new BufferedReader(flujoCiudad);
            // llamada al metodo escritor
            escritura(escritor, lec);
            // cierre flujo lectura paises
            lec.close();
            // apertura lectura ciudades
            lec = new BufferedReader(flujoPais);
            // llamada al metodo escritor
            escritura(escritor,lec);
            // cerrado
            lec.close();
            escritor.close();
            flujoCiudad.close();
            flujoPais.close();
            // si no se encuentra el fichero
        }catch(FileNotFoundException fi){
            System.out.println("archivo no encontrado :0");
            // si hay un error de entrada salida
        }catch(IOException io){
            System.out.println("error de entrada salida");
            // Un error no controlado
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
