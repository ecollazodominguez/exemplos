/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exficheroserial;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ecollazodominguez
 */
public class ExFicheroSerial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        EscribirSerializable obxesc = new EscribirSerializable();
        LerSerializable obxler = new LerSerializable();
        
//        obxesc.escribirObxectos("notasAlum");
        obxler.lerSerializado("notasAlum");


    }
    
}
