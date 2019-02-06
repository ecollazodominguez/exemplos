/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Random;

/**
 *
 * @author ecollazodominguez
 */
public class Matriz2 {

    public int[][] notas = {{3, 4, 2},
    {5, 2, 5},
    {1, 1, 1},
    {4, 6, 6}};
    public String[] nomes = {"aa", "bb", "cc", "dd"};
    public String[] modulos = {"P", "BD", "CD"};
    public int[] media = new int[notas.length];

    public void creaArray() {
        Random rand = new Random();
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = rand.nextInt(11);//generamos numeros al azar entre el 1 y 10
                System.out.println(notas[i][j]);
            }
        }
    }

    public void pedirNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + "    ");
            }
            System.out.print("|\n");
        }
    }

    public void pedirNotas(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "    ");
            }
            System.out.print("|\n");
        }
    }

    public int[] calcularMedia() {
        int f;
        int c;
        int suma;
        for (f = 0; f < notas.length; f++) {
            System.out.print("|");
            suma = 0;
            for (c = 0; c < notas[f].length; c++) {
                System.out.print(notas[f][c] + "|");
                suma = suma + notas[f][c];
            }
            media[f] = suma / notas[f].length;
            System.out.print(media[f]);

            System.out.print("|\n");
        }
        return media;
    }

    public void calcularMediaM() {
        int f = 0;
        int c = 0;
        int suma;
        for (c = 0; c < notas[0].length; c++) {
            System.out.print("|");
            suma = 0;
            for (f = 0; f < notas.length; f++) {
                System.out.print(notas[f][c] + "|");
                suma = suma + notas[f][c];
            }
            media[c] = suma / notas.length;
            System.out.print(media[c]);

            System.out.print("|\n");
        }
    }

    public void ordenarMenorMayor() {
        this.calcularMedia();
        int aux=0;
        int[]aux2={0,0,0};
        for (int i = 0; i < media.length-1; i++) {
            for (int j = i + 1; j < media.length; j++) {
                if (media[i] > media[j]) {
                    aux = media[i];
                    media[i] = media[j];
                    media[j] = aux;
                    String auxnome = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = auxnome;
                        aux2 = notas[i];
                        notas[i] = notas[j];
                        notas[j] = aux2;

                }
            }
        }
        
    }
    
    public void amosarTodo(){
        this.calcularMedia();
            System.out.print("\n");
            System.out.println("    "+modulos[0]+"   "+modulos[1]+"   "+modulos[2]+"   Media");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(nomes[i]+"  ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + "    ");
            }
            System.out.print(media[i]);
            System.out.print("\n");
        }
}
}
