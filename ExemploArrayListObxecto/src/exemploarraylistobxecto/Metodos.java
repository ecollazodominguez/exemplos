/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistobxecto;

import Utilidades.PedirDatos;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ecollazodominguez
 */
public class Metodos {

    public void engadir(ArrayList<Alumno> lista) {
//    String n=PedirDatos.string("nome");
//    String dni=PedirDatos.string("dni");
//    int not=PedirDatos.enteiro("nota");
//    Alumno al = new Alumno(n,dni,not);
//    lista.add(al);
//    }

        /* tamén se pode facer 
    Alumno al=crearAlumno();
    lista.add(al); */
        lista.add(new Alumno(PedirDatos.string("nome"), PedirDatos.string("dni"), PedirDatos.enteiro("nota")));
    }

    public Alumno crearAlumno() {
        String n = PedirDatos.string("nome");
        String dni = PedirDatos.string("dni");
        int not = PedirDatos.enteiro("nota");
        Alumno al = new Alumno(n, dni, not);
        return al;
    }

    public void verForEach(ArrayList<Alumno> lista) {
        for (Alumno ele : lista) {
            System.out.println(ele);
        }
    }

    public void forIterator(ArrayList<Alumno> lista) {
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public Alumno borrarPosicion(int pos, ArrayList<Alumno> lista) {
        return lista.remove(pos);
    }

    public void borrarPorDni(String dni, ArrayList<Alumno> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDni().equalsIgnoreCase(dni)) {
                lista.remove(i);
            }
//            
//      for(Alumno al: lista)
//            if(dni.equalsIgnoreCase(al.getDni())){
//                lis.remove(al);
//                break;
//            }

//        Alumno a= new Alumno();
//        Iterator it = lis.iterator();
//        while(it.hasNext()){
//            a=(Alumno)it.next(); //Next ao ser Object se castea a Alumno
//            if(dni.equalsIgnoreCase(a.getDni()))
//                lis.remove(a);
//        }
        }
    }

    public void buscar(String dni, ArrayList<Alumno> lista) {
        for (Alumno alumno : lista) {
            if (dni.equalsIgnoreCase(alumno.getDni())) {
                System.out.println(alumno.toString());
            }
        }
    }

}
