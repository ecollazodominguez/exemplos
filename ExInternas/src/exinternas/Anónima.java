/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exinternas;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;

/**
 *
 * @author ecollazodominguez
 */

public class Anónima {
    JPanel panel;
    JButton boton;
    JFrame marco;
            
    public void Anónima(){
    marco = new JFrame();
    panel = new JPanel();
    boton = new JButton("pon cor");
    marco.setSize(500,200);
    panel.add(boton);
    marco.add(panel);
    
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.red);
            Toolkit.getDefaultToolkit().beep();
        }
    });
    
    marco.setVisible(true);
    marco.setDefaultCloseOperation(3);
    
}
}
