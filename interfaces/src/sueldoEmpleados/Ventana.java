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
package sueldoEmpleados;
import com.sun.prism.j2d.J2DPipeline;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;

/**
 *
 * @author liken
 */
public class Ventana extends JFrame implements ActionListener{
    /*
    nombre: nombre del empleado
    salario: cantidad por hora
    horas: horas trabajadas
    resultado: total a pagar
    */
    JTextField nombre,salario,horas,resultado;
    JButton boton;
    /**
     * cosntructor de la ventana con todos los parametros,
     * en esta implementa todos los paneles
     */
    public Ventana () {
        super("estimacion Empleados");
        // tamaño y posicion
        setSize(500,125);
        setLocation(200, 200);
        // no redimensionable
        setResizable(false);
        // cambio de distribucion
        setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        // en caso de cierre
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //boton
        boton = new JButton("calcular");
        boton.addActionListener(this);
        // definicion paneles
        JPanel pNombre = panelNombreEmpl();
        JPanel pSalario = PanelSueldo();
        
        JPanel pHoras = panelHoras();
        JPanel pResultado = panelResultado();
        // paneles contenedores de paneles
        JPanel superior = new JPanel();
        JPanel inferior = new JPanel();
        // add paneles
        // sup
        superior.add(pNombre);
        superior.add(pSalario);
        // inf
        inferior.add(pHoras);
        inferior.add(boton);
        inferior.add(pResultado);
        //add ventana
        add(superior);
        add(inferior);
    }
    /**
     * metodo que define las caracteristicas y elementos del panel superior
     * de la ventana con etiquetas
     * 
     * @return 
     */
    private JPanel panelNombreEmpl(){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // etiqueta
        JLabel etiqueta = new JLabel("nombre del empleado:");
        //cuadro introductor
        nombre = new JTextField(30);
        //adds
        panel.add(etiqueta);
        panel.add(nombre);
        return panel;
    }
    /**
     * metodo que define los atributos del panel para introducir el sueldo
     * @return 
     */
    private JPanel PanelSueldo(){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // etiqueta
        JLabel etiqueta = new JLabel("sueldo/hora:");
        //cuadro introductor
        salario = new JTextField(10);
        //adds
        panel.add(etiqueta);
        panel.add(salario);
        return panel;
    }
    /**
     * metodo que define los atributos del panel que contiene los elementos sobre las horas
     * @return 
     */
    private JPanel panelHoras(){
        JPanel panel = new JPanel();
        // layout
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        //  etiqueta
        JLabel etiqueta = new JLabel("Horas/mes:");
        // intro texto
        horas = new JTextField(10);
        // adds
        panel.add(etiqueta);
        panel.add(horas);
        // vuelta
        return panel;
    }
    /**
     * panel que contiene los elementos donde se muestra el 
     * resultado
     * @return 
     */
    private JPanel panelResultado(){
        JPanel panel = new JPanel();
        // distro
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // etiqueta
        JLabel etiqueta = new JLabel("Sueldo:");
        // texto salida
        resultado = new JTextField(10);
        resultado.setEditable(false);
        // adds
        panel.add(etiqueta);
        panel.add(resultado);
        // vuelta
        return panel;
        
    }
    private void calculoSueldo(){
        double numHoras,canSueldo;
        try{
            numHoras = Double.parseDouble(horas.getText());
            canSueldo = Double.parseDouble(salario.getText());
            resultado.setText("" + (numHoras*canSueldo) + " €");
        }catch(NumberFormatException num){
            resultado.setText("error");
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton){
            calculoSueldo();
        }
    }
    
}
