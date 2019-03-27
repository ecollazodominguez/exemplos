/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author ecollazodominguez
 */
public class Compoñentes extends JFrame{
    JPanel panel;
    JButton boton1, boton2;
    JLabel etiqueta;
    JTextField liTexto;
    JComboBox comBox;
    public void crearVenta(){
        panel = new JPanel();
        boton1 = new JButton("Engadir");
        boton2 = new JButton("Eliminar");
        etiqueta = new JLabel();
        liTexto = new JTextField();
        comBox = new JComboBox();
        this.setTitle("marco");
        //damoslle caracteristicas
        this.setSize(800,400);
        panel.setSize(800,400);
        panel.setBackground(new Color(151,138,243));
        etiqueta.setText("NOME");
        etiqueta.setBounds(50,105,50,10);
        liTexto.setBounds(100,100,500,20);
        boton1.setBounds(200,300,100,40);
        boton2.setBounds(400,300,100,40);
        String prueba="a";
        comBox.addItem(prueba);
        comBox.setBounds(150, 200, 200, 30);
        panel.setLayout(null);
        //engadimos os compoñentes
        panel.add(etiqueta);
        panel.add(liTexto);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(comBox);
        this.add(panel);
        
        
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    }
}
