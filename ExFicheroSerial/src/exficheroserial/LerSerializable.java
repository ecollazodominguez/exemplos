/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exficheroserial;

import java.io.*;

/**
 *
 * @author ecollazodominguez
 */
public class LerSerializable {

    ObjectInputStream fich = null;
    FileInputStream f = null;
    Alumno al= null;

    public void lerSerializado(String nomeFich) throws FileNotFoundException, IOException, ClassNotFoundException {
        f = new FileInputStream(nomeFich + ".dat");
        fich = new ObjectInputStream(f);
        try{
        al = (Alumno) fich.readObject();
        while (al != null) {
            System.out.println(al);
            al = (Alumno) fich.readObject();
        }
        } catch (EOFException ex){
        }finally{
            fich.close();
            f.close();
        }
    }
}
