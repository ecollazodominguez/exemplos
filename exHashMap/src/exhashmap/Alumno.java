/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exhashmap;

/**
 *
 * @author ecollazodominguez
 */
public class Alumno implements Comparable{
    private String nome;
    private int ref;
    private int nota;

    public Alumno() {
    }

    

     public Alumno(String nome, int nota) {
        this.nome = nome;
        ref= Secretaria.refe;
        this.nota = nota;
        Secretaria.refe++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "\nnome: " + nome + " ref: " + ref + " nota: " + nota;
    }
    
    
}
