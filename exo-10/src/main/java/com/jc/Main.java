package com.jc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nbres = {78,1,95,2,12,28,};

        System.out.println("Tableau original " + Arrays.toString(nbres));
        int max = calculElementMaxTab(nbres);
        System.out.println("L'élément maximal du tableau est: " + max);
    }
    /*
    Écrire une méthode récursive Java pour trouver l'élément maximum dans un tableau.
     */
    public static int calculElementMaxTab(int[] tab, int index, int taille){

        // Cas de base: Si on arrive au  dernier element du tableau

        if(index == taille-1){
            return tab[index];
        }
        //Appelle recursif pour obtenir le maximum du reste du tableau
        int maxReste = calculElementMaxTab(tab, index+1, taille);
        //Retourner le reste entre l'element courant et le maximum du reste

        return Math.max(maxReste, tab[index]);
    }
    public static int calculElementMaxTab(int[] tab){
        return calculElementMaxTab(tab, 0, tab.length);
    }
}