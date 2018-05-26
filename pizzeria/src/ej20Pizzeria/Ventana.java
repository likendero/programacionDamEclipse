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
/**
 *  clase que crea una ventana para las pizzas
 * @author Javier Gonzalez Rives
 */
public class Ventana extends JFrame implements ActionListener {
    private JButton peque,mediana, grande, calcular;
    private static JTextArea comanda;
    private static ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
    private JTextField resultado,conIva;
    /**
     * constructor de la ventana con todos sus atributos y dimensiones
     */
    public Ventana(){
        super("pizzeria");
        setSize(550, 300);
        setLocation(200,200);
        setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // creacion paneles
        JPanel pTamanno = new JPanel();
        JPanel pTexto = new JPanel();
        JPanel pResultado = new JPanel();
        //tammanno
        peque = new JButton("PEQUENNA");
        peque.addActionListener(this);
        mediana = new JButton("MEDIANA");
        mediana.addActionListener(this);
        grande = new JButton("GRANDE");
        grande.addActionListener(this);
        pTamanno.add(peque);
        pTamanno.add(mediana);
        pTamanno.add(grande);
        //texto
        comanda = new JTextArea(100,40);
        comanda.setEditable(false);
        comanda.setLineWrap(true);
        pTexto.add(comanda);
        
         // resultado
         calcular = new JButton("calcular");
         calcular.addActionListener(this);
         resultado = new JTextField(10);
         resultado.setEditable(false);
         conIva = new JTextField(10);
         conIva.setEditable(false);
         pResultado.add(calcular);
         pResultado.add(new JLabel("sin iva: "));
         pResultado.add(resultado);
         pResultado.add(new JLabel("con iva: "));
         pResultado.add(conIva);
         // annadir paneles
         add(pTamanno);
         add(pTexto);
         add(pResultado);
    }
    /**
     * metodo para annadir una pizza a la lista de pizzas
     * @param pizza 
     */
    public  static void annadirPizza(Pizza pizza){
        pizzas.add(pizza);
        refrescarTexto();
    }
    /**
     * metodo que refresca la informacion del cuadro de texto con las 
     * comandas
     */
    private static void refrescarTexto(){
        String PizzasSalida = "";
        int con = 0;
        for(Pizza i: pizzas){
            if(con % 2 == 0)
            PizzasSalida += i.toString();
        con++;
        }
        comanda.setText(PizzasSalida + "\n" + pizzas.size()/2);
        
    }
    /**
     * metodo que calcula el precio de todas las pizzas
     */
    private void Calculo(){
        int con = 0;
        // bucle que recorre la coleccion de pizzas y saca el valor
        double valor = 0,valorIva = 0;
        for(Pizza i: pizzas){
            if(con % 2 == 0)
            switch(i.getTamanno()){
                // PIZZAS PEQUEÑAS
                case "PEQUEÑA":
                    // comprovacion del numero de ingredientes
                    if(i.numIngredientes() < 4){
                        // en el caso de 3 o menos el valor de la pizza
                        valor += 5;
                    }else{
                        // en el caso de mas de 3 0.5 por cada extramnj
                        valor += 5;
                        valor += 0.50*(i.numIngredientes()-3);
                    }
                    break;
                    //PIZZAS MEDIANAS
                case "MEDIANA":
                    // comprovacion del numero de ingredientes
                    if(i.numIngredientes() < 4){
                        // en el caso de 3 o menos el valor de la pizza
                        valor += 10;
                    }else{
                        // en el caso de mas de 3 0.5 por cada extramnj
                        valor += 10;
                        valor += 0.50*(i.numIngredientes()-3);
                    }
                    break;
                    //PIZZAS GRAMDES
                case "GRANDE":
                    // comprovacion del numero de ingredientes
                    if(i.numIngredientes() < 4){
                        // en el caso de 3 o menos el valor de la pizza
                        valor += 15;
                    }else{
                        // en el caso de mas de 3 0.5 por cada extramnj
                        valor += 15;
                        valor += 0.50*(i.numIngredientes()-3);
                    }
                    break;
            }
            resultado.setText(valor + "");
            conIva.setText((valor + valor*0.21) + "");
            con++;
       }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // caso que se pulse el boton de pizza pequenna
        if(e.getSource() == peque){
            Ingredientes ingre = new Ingredientes(this, "PEQUEÑA");
            ingre.setVisible(true);
        }
        // caso que se pulse el boton de pizza mediana
        if(e.getSource() == mediana){
            Ingredientes ingre = new Ingredientes(this, "MEDIANA");
            ingre.setVisible(true);
        }
        // caso que se pulse el boton de pizza grande
        if(e.getSource() == grande){
            Ingredientes ingre = new Ingredientes(this, "GRANDE");
            ingre.setVisible(true);
        }
        // caso que se pulse calcular
        if(e.getSource() == calcular){
            Calculo();
        }
    }
}
