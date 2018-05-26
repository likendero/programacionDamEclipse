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
package ej20Pizzeria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author liken
 */
public class Ingredientes extends JDialog implements ActionListener{
    private JComboBox<String> selecIngredientes;
    private JButton annadir;
    private JTextArea texto;
    private JButton guardar;
    private JButton salir;
    private Pizza pizza;
    //array donde se almacenanlos ingredientes disponibles
    private static String ing[] = {"jamon york","mozzarela","tomate","peperoni","atun","chorizo"}; 
    
    public Ingredientes(Ventana ventana, String tamanno){
        super(ventana,true);
        pizza = new Pizza(tamanno);
        
        setSize(550, 300);
        setLocation(200,200);
        setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        
        // paneles
        JPanel pIntro = new JPanel();
        JPanel pTexto = new JPanel();
        JPanel pEnviar= new JPanel();
        // intro
        selecIngredientes = new JComboBox<>(ing);
        annadir = new JButton("añadir");
        annadir.addActionListener(this);
        pIntro.add(new JLabel(tamanno));
        pIntro.add(selecIngredientes);
        pIntro.add(annadir);
        // texto ingre
        texto = new JTextArea(100,40);
        texto.setEditable(false);
        pTexto.add(texto);
        //enviar
        guardar = new JButton("guardar");
        guardar.addActionListener(this);
        salir = new JButton("salir");
        guardar.addActionListener(this);
        salir.addActionListener(this);
        pEnviar.add(guardar);
        pEnviar.add(salir);
        // annadir paneles
        add(pIntro);
        add(pTexto);
        add(pEnviar);
        
        
    }
    /**
     * metodo que annade a la lista el ingrediente elegido y 
     * actualiza el texto
     */
    private void annadirIng(){
        pizza.addIng((String)selecIngredientes.getSelectedItem());
        texto.setText(pizza.ingredientes());
        texto.setText(texto.getText() + "\n numero ingredientes: " + pizza.numIngredientes() + '\n');
    }
    private void guardarPizza(){
        if(pizza.numIngredientes() > 0){
            Ventana.annadirPizza(pizza);
            this.dispose();
        }else{
            JOptionPane alerta = new JOptionPane("no hay ingredientes");
            alerta.setVisible(true);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==  salir){
            this.dispose();
        }
        if(e.getSource() == annadir){
            annadirIng();
        }
        if(e.getSource() == guardar){
            guardarPizza();
        }
    }
    
}
