/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.escritura;

import Utilidades.PedirDatos;
import exficheiro.Alumno;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author ecollazodominguez
 */
public class EscribirFicheiro {
    File fich=null;
    PrintWriter f= null;
    
    public File escribirNumeros(String nomeFich) throws FileNotFoundException{
        f = new PrintWriter(new File(nomeFich+".txt"));
        
        f.println(PedirDatos.enteiro("num"));
        f.println(PedirDatos.enteiro("num"));
        f.println(PedirDatos.enteiro("num"));
        f.close();
        return fich;
    }

    public void escribirLineas(String nomeFich, ArrayList<Alumno> lista) throws FileNotFoundException{
        f= new PrintWriter(new File(nomeFich+".txt"));
        for(Alumno al:lista){
            f.println(al.getNome()+","+al.getNota());
        }
        f.close();
    }
    
    public void engadir(String nomeFich) throws IOException{
        f= new PrintWriter (new FileWriter(nomeFich+".txt",true)); //Si true, engade no ficheiro, non sobreescribe
             Alumno a = new Alumno(PedirDatos.enteiro("nota"),PedirDatos.string("nome"));
            f.println(a);
            f.close();  
    }
}
