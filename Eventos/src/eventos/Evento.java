/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ecollazodominguez
 */
public class Evento extends JFrame implements ActionListener {
    JPanel panel;
    JButton bVermello,bVerde,bAmarelo;
    
    public void crearVentana(){
        this.setTitle("*** EVENTOS ***");
        panel = new JPanel();
        bVermello = new JButton("vermello");
        bVerde = new JButton("verde");
        bAmarelo = new JButton("amarelo");
        this.setSize(400, 200);
        panel.add(bVermello);
        panel.add(bVerde);
        panel.add(bAmarelo);
        this.add(panel);
        //xestión de eventos
        bVermello.addActionListener(this);
        bVerde.addActionListener(this);
        bAmarelo.addActionListener(this);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bVermello)
            panel.setBackground(Color.red);
        else if(e.getSource() == bVerde)
            panel.setBackground(Color.green);
        else
            panel.setBackground(Color.yellow);
    }
}
