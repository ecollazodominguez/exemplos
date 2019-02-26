/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exficheroserial;

import Utilidades.PedirDatos;
import java.io.*;

/**
 *
 * @author ecollazodominguez
 */
public class EscribirSerializable {
    
    ObjectOutputStream fich;
    FileOutputStream f;
    
    public void escribirObxectos(String nomeFich) throws FileNotFoundException, IOException{
        f = new FileOutputStream(nomeFich+".dat");
        fich = new ObjectOutputStream(f);
//            fich = new ObjectOutputStream(new FileOutputStream(nomeFich+".dat"));
            for(int i=0;i<3;i++){
            Alumno al = new Alumno(PedirDatos.string("nome"),PedirDatos.enteiro("nota"));
            fich.writeObject(al);
            }
            fich.close();
            f.close();
            
    }
    
    
    
}
