/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Metodos {
    int tamaño = 8;
    int []notas = new int [tamaño];
    int []repetidos = new int [tamaño];
    
    public int darValor(){
        return Integer.parseInt(JOptionPane.showInputDialog("valor"));
    }
    public void crearArray(){
        for(int i=0;i<notas.length;i++){
            notas[i]=darValor();
                    }
    }
    public void amosar(){
        for(int i=0;i<notas.length;i++)
            System.out.println(notas[i]);
    }
    
    public void amosarForEach(){
        for(int ele : notas){
            System.out.println(ele);
        }
    }
    
    public void eleBuscar(){
        int ele= darValor();
        int atopado = 0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]==ele){
                System.out.println("O elemento está na posición: "+ (i+1));
                atopado=1;
                break;
                }
        }
        if(atopado ==0){
            System.out.println("Non está o elemento");
        }
    }
    public void eleBuscarRepe(){
        int ele= darValor();
        int j = 0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]==ele){
                repetidos[j] = i+1;
                j++;
                }
        }
        if(j==0)
            System.out.println(ele+ " non esta na lista");
        else if (j==1)
            System.out.println(ele+ " non se repite");
        else
        for(int i=0;i<j;i++)
            System.out.println("**"+ repetidos[i]);
    }
    
    public void prueba(){
        int j = 0;
        int ele = 0;
        int contador = 0;
        for(int c=0;c<9;c++,ele++){
            contador = 0;
            for(int i=0;i<notas.length;i++){
                if(notas[i] == ele){
                    contador++;
                    if(contador >= 2){
                        repetidos[j] = notas[i];
                        j++;
                                        
                    }
                }
                
        }
        }
    }
        public void amosarForEach2(){
        for(int ele : repetidos){
            System.out.println(ele);
        }
    }
        public void ordenarDirecto(){
            int aux=0;
            for(int i=0;i<notas.length-1;i++)
                for(int j=i+1;j<notas.length;j++)
                    if (notas[i] > notas[j]){
                        aux=notas[i];
                        notas[i]=notas[j];
                        notas[j]=aux;
                    }
        }
        public void ordenarSort(){
            Arrays.sort(notas);
        }
        public void eliminar(){
            int eleBorrar = darValor();
            for(int i=0;i<notas.length;i++)
                if(eleBorrar == notas[i]){
                    for(int pos=i;pos<notas.length-1;pos++)
                        notas[pos] = notas[pos+1];
                    tamaño--;
                }
        }
}
