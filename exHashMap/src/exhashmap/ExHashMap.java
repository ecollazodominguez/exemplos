/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exhashmap;

import Utilidades.PedirDatos;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ecollazodominguez
 */
public class ExHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Alumno> lAlumnos = new HashMap<>();
        ArrayList<Alumno> lista = new ArrayList<>();
        Secretaria obx = new Secretaria();
        int op;
        String dni;
        do{
            op = PedirDatos.enteiro("*****Menu*****\n 1: Engadir \n 2: Amosar \n 3: Pasar a Array \n 4: Baixa \n 5: Modificar \n 6: Consultar \n 7: Ordenar");
            switch(op){
                case 1: dni=PedirDatos.string("dni");
                    obx.engadir(lAlumnos,dni);
                    break;
                case 2: 
                    obx.amosar(lAlumnos);
                    break;
                case 3:
                    obx.hashToArray(lAlumnos, lista);
                    break;
                case 4:
                    obx.baixa(lAlumnos,PedirDatos.string("dni"));
                    break;
                case 5:
                    obx.modificar(lAlumnos, PedirDatos.string("dni"), PedirDatos.enteiro("nota"));
                    break;
                case 6:
                    obx.consulta(lAlumnos, PedirDatos.string("dni"));
                    break;
                    
            }
        }while (op !=0);
    }
    
}
