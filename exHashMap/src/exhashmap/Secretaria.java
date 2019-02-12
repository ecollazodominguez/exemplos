/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exhashmap;

import Utilidades.PedirDatos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Secretaria {
    public static int refe= 6000;
    Alumno al;
    
    public void engadir(HashMap <String,Alumno> alum,String dni){
        if(alum.containsKey(dni))
            JOptionPane.showMessageDialog(null, "xa esta no listado");
        else
            alum.put(dni, new Alumno(PedirDatos.string("nome"),PedirDatos.enteiro("nota")));
    }
    
    public void amosar(HashMap <String,Alumno> alum){
//        System.out.println(alum);
        
        Iterator it = alum.keySet().iterator();
        while(it.hasNext())
            System.out.println(alum.get(it.next()));

    }
    
    public void hashToArray(HashMap<String,Alumno> alum, ArrayList<Alumno> lista){
//         ArrayList<Alumno> lista = new ArrayList<>(alum.values());
            lista.addAll(alum.values());
         
         for (Alumno alumno : lista) {
             System.out.println(alumno);
            
        }
    }
    
    
    public void baixa(HashMap<String,Alumno> alum, String dni){
        if(!alum.containsKey(dni))
            JOptionPane.showMessageDialog(null, "non listado");
        else
            alum.remove(dni);
    }
    
    public void modificar(HashMap<String,Alumno> alum, String dni, int nota){
        if(!alum.containsKey(dni))
            JOptionPane.showMessageDialog(null, "non listado");
        else
            alum.get(dni).setNota(nota);
    }
    
    public void consulta(HashMap<String,Alumno> alum, String dni){
        if(!alum.containsKey(dni))
            JOptionPane.showMessageDialog(null, "non listado");
        else
            System.out.println(alum.get(dni));
    }
    }
