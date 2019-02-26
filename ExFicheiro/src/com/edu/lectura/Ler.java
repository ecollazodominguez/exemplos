/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.lectura;

import exficheiro.Alumno;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ecollazodominguez
 */
public class Ler {

    Scanner sc;

    public void lerPalabras(File fich) {
        try {
            sc = new Scanner(fich);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro1" + ex.getMessage());
        } finally {
            sc.close();
        }

    }

    public void lerLineas(File fich) {
        try {
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro2" + ex.getMessage());
        } finally {
            sc.close();
        }
    }

    public void delimitador(File fich) {
        try {
            sc = new Scanner(fich).useDelimiter(",\\s*"); // \\s* indica que puede haber un carácter más aparte del delimitador ','
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro3" + ex.getMessage());
        } finally {
            sc.close();
        }

    }

    public ArrayList<Integer> lerNumeros(File fich, ArrayList<Integer> lista) {
        try {
            sc = new Scanner(fich).useDelimiter(",\\s*");
            while (sc.hasNextInt()) {
                lista.add(sc.nextInt());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro4" + ex.getMessage());
        } finally {
            sc.close();
        }
        return lista;
    }

    public void lerObxectos(File fich) {
        try {
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                String[] alum = sc.nextLine().split(" ");
                System.out.println(alum[0] + " " + alum[1]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro5" + ex.getMessage());
        } finally {
            sc.close();
        }

    }

    public ArrayList<Alumno> meterArray(ArrayList<Alumno> lista, File fich) throws FileNotFoundException {
        sc = new Scanner(fich);
        int nota;
        while (sc.hasNextLine()) {
            Alumno al = new Alumno();
            String[] alum = sc.nextLine().split(" ");
            al.setNome(alum[0]);
            nota = Integer.parseInt(alum[1]);
            al.setNota(nota);
            lista.add(al);
        }
        return lista;
    }
}
