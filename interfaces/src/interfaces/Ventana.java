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
package interfaces;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.*;

/**
 * clase que sirve para definir una ventana y todos sus atributos
 * @author liken
 */
public class Ventana extends JFrame implements ActionListener{
    // combo box con el que se introducira las monedas
    private  JComboBox<String> selectorDivisa;
    // cuadro de texto don de se introduce el dinero
    private  JTextField cantidadDinero;
    /*
        0. euros
        1. dolares
        2. libras
        3. yenes
    */
    private  JButton transformarA[] = new JButton[4];
    // array que almacena las monedas disponibles para el combo
    private  String monedas[] = {"€","$","¥","£"};
    // atributos de tamaño de la ventana
    JLabel resultado ;
    private int ancho,alto;
    public Ventana(){
        super("cambiar divisas");
        // definicion de tamaño
        this.ancho = 350;
        this.alto = 400;
        this.setSize(ancho, alto);
        // definicon posicion
        this.setLocation(200, 200);
        // en cierre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // implementacion del panel1
        JPanel panelIntro = panel1Creacion();
        this.add(panelIntro);
        
        
    }
    /**
     * metodo que sirve para crear un panel con todos sus elementos
     * @return 
     */
    private  JPanel panel1Creacion(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        // igualando elementos
        selectorDivisa = selector();
        cantidadDinero = introDivisas();
        JLabel etiquetaIntro = new JLabel("introduce dinero");
        etiquetaIntro.setBounds(cantidadDinero.getX()-100, cantidadDinero.getY()
                                , 120, 20);
        botonesYResultado();
        // annadiendo elementos
        panel.add(selectorDivisa);
        panel.add(cantidadDinero);
        panel.add(etiquetaIntro);
        panel.add(resultado);
        // bucle para annadir botones
        for(int i = 0; i < 4 ; i++){
            panel.add(transformarA[i]);
        }
        return panel;
    }
    /**
     * metodo que define todos los atributos de los botones de definicion
     */
    private void botonesYResultado(){
        int auxX,auxY;
        auxX = this.getWidth()/5-60;
        auxY = this.getHeight()/2;
        for(int i = 0; i < 4 ; i++){
            transformarA[i] = new JButton();
            transformarA[i].setBounds(auxX, auxY, 70, 20);
            auxX+=80;
            transformarA[i].addActionListener(this);
        }
        // texto de los botones
        transformarA[0].setText("euros");
        transformarA[1].setText("dolares");
        transformarA[2].setText("libras");
        transformarA[3].setText("yenes");
        // annadir etiqueta resultado
        resultado = new JLabel("resultado");
        resultado.setBounds(this.getWidth()/4, auxY+40, 200, 20);
        
    }
    /**
     * metodo que sirve para definir los atributos del combobox
     * @return combobox definido
     */
    private  JComboBox<String> selector(){
        JComboBox<String> selec = new JComboBox<String>(monedas);
        // definicon del tamaño del elemento
        selec.setSize(50, 20);
        // definicon de la posicion respecto al tamaño de la ventana
        selec.setLocation(this.getWidth()/3, this.getHeight()/7);
        return selec;
    }
    /**
     * metodo que sirve para definir los atributos del cuadro de 
     * introduccion de las divisas
     * @return 
     */
    private JTextField introDivisas(){
        JTextField intro = new JTextField();
        intro.setSize(100,20);
        intro.setLocation(this.getWidth()/4 + 50, this.getHeight()/7+30);
        return intro;
    }
    /**
     * metodo que realiza las conversiones y las devuelve en forma de texto
     * @param valor el numero a convertir
     * @param entrada la moneda introduucida
     * @param salida la moneda a convertir
     * @return cadena con el resultado
     */
    private String conversion(String valor, String entrada, String salida){
        double calculable;
        try{
            calculable = Double.parseDouble(valor);
            // se pasa el valor de entrada a euros
            switch(entrada){
                case "$":// 0,8428
                    calculable = calculable * 0.8428;
                    break;
                case "£":// 1,1385
                    calculable = calculable * 1.1385;
                    break;
                case "¥":// 0,0076
                    calculable = calculable * 0.0076;
                    break;
            }
            // se pasa el valor de entrada en euros a la moneda deseada
            switch(salida){
                case "DOLARES":// 1,1869
                    calculable*= 1.1869;
                    return calculable + " $";
                case "LIBRAS":// 0,8784
                    calculable*= 0.8784;
                    return calculable + " £";
                case "YENES":// 130,781
                    calculable*= 130.781;
                    return calculable + " ¥";
                default:
                    return calculable + " €";
                    
            }
        // caso de que lo introducido no sea un numero
        }catch(NumberFormatException num){
            return "error";
        // caso de un error diferente
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "";
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == transformarA[0]){
            resultado.setText(conversion(cantidadDinero.getText(),(String)selectorDivisa.getSelectedItem(),"EUROS"));
        }
        if(e.getSource() == transformarA[1]){
            resultado.setText(conversion(cantidadDinero.getText(),(String)selectorDivisa.getSelectedItem(),"DOLARES"));
        }
        if(e.getSource() == transformarA[2]){
            resultado.setText(conversion(cantidadDinero.getText(),(String)selectorDivisa.getSelectedItem(),"LIBRAS"));
        }
        if(e.getSource() == transformarA[3]){
            resultado.setText(conversion(cantidadDinero.getText(),(String)selectorDivisa.getSelectedItem(),"YENES"));
        }
    }
    
    }
