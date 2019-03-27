/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * clase interna
 *
 * @author ecollazodominguez
 */
public class Evento2 extends JFrame {

    JPanel panel;
    JButton bVermello, bVerde, bAmarelo;

    public void crearVentana() {
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
        bVermello.addActionListener(new ExecutarEvento());
        bVerde.addActionListener(new ExecutarEvento());
        bAmarelo.addActionListener(new ExecutarEvento());

        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    }

    //Utilizando clase interna
    public class ExecutarEvento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bVermello) {
                panel.setBackground(Color.red);
            } else if (e.getSource() == bVerde) {
                panel.setBackground(Color.green);
            } else {
                panel.setBackground(Color.yellow);
            }
        }
    }

}
