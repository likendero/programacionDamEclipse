
package ej29Interfaz;
import ej29Personas.Persona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
/**
 * clase que sirve para crear la ventana principal con todas las
 * caracteristicas de esta
 * @author liken
 */
public class Ventana extends JFrame implements ActionListener{
    //  componentes entrada
    private JTextField nombre;
    private JTextField apellidos;
    private JTextField telefono;
    private JTextField nif;
    private JButton botonGuardar;
    // componentes salida
    private JTextField buscarNif;
    private JTextArea salidaTexto;
    private JButton botonBuscar;
    /**
     * constructor que crea la ventana y todos sus
     * parametros
     */
    public Ventana(){
        super("perosnas");
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));
        // tamanno
        setSize(550, 275);
        // posicion
        setLocation(200, 200);
        // caso de cierre
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //paneles contenedores
        JPanel pIntro = new JPanel();
        pIntro.setLayout(new BoxLayout(pIntro, BoxLayout.Y_AXIS)); // vertical
        JPanel pSalida = new JPanel();
        pSalida.setLayout(new BoxLayout(pSalida, BoxLayout.Y_AXIS)); // vertical
        // paneles interiores
        JPanel pNombre = panelEstandar("nombre: "/*, nombre, 10*/);
        nombre = new JTextField(10);
        pNombre.add(nombre);
        JPanel pApellidos = panelEstandar("apellidos: "/*, apellidos, 20*/);
        apellidos = new JTextField(20);
        pApellidos.add(apellidos);
        JPanel pTelefono = panelEstandar("telefono: "/*, telefono, 20*/);
        telefono = new JTextField(20);
        pTelefono.add(telefono);
        JPanel pNif = panelEstandar("nif: "/*, nif, 10*/);
        nif = new JTextField(10);
        pNif.add(nif);
        // componentes intro
        botonGuardar = new JButton("guardar");
        botonGuardar.addActionListener(this);
        
        pIntro.add(new JLabel("INTRODUCCION PERSONA: "));
        pIntro.add(pNombre);
        pIntro.add(pApellidos);
        pIntro.add(pTelefono);
        pIntro.add(pNif);
        pIntro.add(botonGuardar);
        // compoenentes Salida
        JPanel pSNif = panelEstandar("nif buscar: ");
        buscarNif = new JTextField(10);
        pSNif.add(buscarNif);
        JLabel etiquetaSalida = new JLabel("Salida: ");
        salidaTexto = new JTextArea(4,20);
        salidaTexto.setEditable(false);
        botonBuscar = new JButton("buscar");
        botonBuscar.addActionListener(this);
        
        pSalida.add(pSNif);
        pSalida.add(etiquetaSalida);
        pSalida.add(salidaTexto);
        pSalida.add(botonBuscar);
        
        // add contenedores
        add(pIntro);
        add(pSalida);
        
        
    }
    private JPanel panelEstandar(String titulo/*, JTextField texto,int intro*/){
        JPanel panel = new JPanel();
        // Jlabel + titulo
        JLabel etiqueta  = new JLabel(titulo);
        // introduccion
        //texto = new JTextField(intro);
        // add comp
        panel.add(etiqueta);
        //panel.add(texto);
        // vueta
        return panel;
    }
     /**
      * metodo que comprueba si todos los campos son correctos y no existe una persona 
      * con el mismo dni
      * @throws Exception 
      */
    private void guardarPersona()throws Exception{
        Persona persona = new Persona();
       if(nombre.getText().equals("") || apellidos.getText().equals("") || telefono.getText().equals("")
           || nif.getText().equals("")){
           throw new Exception("faltan campos por rellenar"); 
    }
        // comprobacion del nombre
        if(!nombre.getText().matches("^[a-z A-Z]+")){
            throw new Exception("caracteres no validos en el nombre");
        }
        // comprobacion de los apellidos
        if(!apellidos.getText().matches("^[a-z A-Z][a-z A-Z \\s]+")){
            throw new Exception("caracteres no validos en los apellidos");
        }
        // comprobacion del numero de telefono
        if(!telefono.getText().matches("^[+ 0-9][0-9]{4,11}")){
            throw new Exception("el numero de telefono no es valido");
        }
        // comprobacion del nif
        if(!nif.getText().matches("^[A-Z a-z 0-9][0-9]{7,8}[A-Z a-z]")){
            throw new Exception("nif no valido");
        }
        // en el caso qeu el fichero de guardado ya exista
        if(new File("personas.obj").exists()){
            // en el caso que el nif del registro ya exista
            if(ej29IO.ej29Lectura.lectorPersonas(nif.getText().toUpperCase()) != null &&
                ej29IO.ej29Lectura.lectorPersonas(nif.getText().toUpperCase()).getNif().equals(nif.getText().toUpperCase())    ){
                throw new Exception("ya existe una persona con ese nif");
            }
        }
        // definiendo apartados
        persona.setNombre(nombre.getText());
        persona.setApellidos(apellidos.getText());
        persona.setTelefono(telefono.getText());
        persona.setNif(nif.getText().toUpperCase());
        
        // guardado en el fichero
        ej29IO.ej29Escritura.escribirPersona(persona);
    }
    /**
     * metodo que sirve para buscar a una persona en el ficchero
     * @throws Exception 
     */
    private void buscarPersona()throws Exception{
        // metodo que comprueba si el dni introducido es correcto
        if(!buscarNif.getText().matches("^[A-Z a-z 0-9][0-9]{7,8}[A-Z a-z]")){
            throw new Exception("dni a buscar no valido");
        }
        Persona per = ej29IO.ej29Lectura.lectorPersonas(buscarNif.getText().toUpperCase());
        if(per != null){
            salidaTexto.setText(per.toString());
        }
        else{
            salidaTexto.setText("no encontrado");
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // boton de guardar
        if(e.getSource() == botonGuardar){
            try{
                guardarPersona();
            }/*catch(NullPointerException nu){
                
            }*/catch(Exception ex){
                //ex.printStackTrace();
                System.out.println(ex.getLocalizedMessage());
                JDialog ventanaError = new JDialog(this,true);
                ventanaError.setAlwaysOnTop(true);
                ventanaError.setSize(300,100);
                ventanaError.setLocation(200,200);
                JPanel panelMensaje = new JPanel();
                panelMensaje.add(new JLabel(ex.getLocalizedMessage()));
                ventanaError.add(panelMensaje);
                ventanaError.setVisible(true);
            }
            // boton de buscar
            if(e.getSource() == botonBuscar){
            try{
                buscarPersona();
            }/*catch(NullPointerException nu){
                
            }*/catch(Exception ex){
                //ex.printStackTrace();
                System.out.println(ex.getLocalizedMessage());
                JDialog ventanaError = new JDialog(this,true);
                ventanaError.setAlwaysOnTop(true);
                ventanaError.setSize(300,100);
                ventanaError.setLocation(200,200);
                JPanel panelMensaje = new JPanel();
                panelMensaje.add(new JLabel(ex.getLocalizedMessage()));
                ventanaError.add(panelMensaje);
                ventanaError.setVisible(true);
            }
        }
        }
        if(e.getSource() == botonBuscar){
            try{
                buscarPersona();
            }/*catch(NullPointerException nu){
                
            }*/catch(Exception ex){
                //ex.printStackTrace();
                System.out.println(ex.getLocalizedMessage());
                JDialog ventanaError = new JDialog(this,true);
                ventanaError.setAlwaysOnTop(true);
                ventanaError.setSize(300,100);
                ventanaError.setLocation(200,200);
                JPanel panelMensaje = new JPanel();
                panelMensaje.add(new JLabel(ex.getLocalizedMessage()));
                ventanaError.add(panelMensaje);
                ventanaError.setVisible(true);
            }
        }
}}
