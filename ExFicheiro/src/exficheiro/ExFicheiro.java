/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exficheiro;

import Utilidades.PedirDatos;
import com.edu.escritura.EscribirFicheiro;
import com.edu.lectura.Ler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ecollazodominguez
 */
public class ExFicheiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Alumno> listal = new ArrayList<>();
        Ler obxLer = new Ler();
        EscribirFicheiro esc = new EscribirFicheiro();
////       File f = new File("/home/local/DANIELCASTELAO/ecollazodominguez/Escritorio/nomes.txt");
//        File f = new File("numeros.txt");
//        obxLer.lerPalabras(f); //le as palabras do ficheiro

//        System.out.println("***");

//        obxLer.lerLineas(f); //le as lineas do ficheiro

////       File d = new File("nomes1.txt");
////       obxLer.delimitador(d); //marca o delimitador de "espazos"

//        File d = new File("numeross.txt");
//        obxLer.delimitador(d);
//        obxLer.lerNumeros(d, lista);
//        System.out.println(lista);

//        File g = new File("Alumno.txt");
//        obxLer.lerLineas(g);

////        obxLer.lerObxectos(g); //le os obxectos do ficheiro

//        obxLer.meterArray(listal, g); //mete o ficheiro nun array

//        System.out.println(listal);

//        esc.escribirNumeros("numero"); //escribe numeros
        
//        for (int i =0;i<4;i++){
//            Alumno a = new Alumno(PedirDatos.enteiro("nota"),PedirDatos.string("nome"));
//            listal.add(a);
//        }
//        
//        esc.escribirLineas("alumnado", listal); //escribe obxectos

          esc.engadir("alumnado"); //ENGADE
    }

}
