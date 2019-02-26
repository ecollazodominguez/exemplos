/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exficheiro;

/**
 *
 * @author ecollazodominguez
 */
public class Alumno {
    private int nota;
    private String nome;

    public Alumno(int nota, String nome) {
        this.nota = nota;
        this.nome = nome;
    }

    public Alumno() {
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", nota: " + nota;
    }
    
    
}
