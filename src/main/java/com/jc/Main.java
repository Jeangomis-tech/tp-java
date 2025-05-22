package com.jc;

public class Main {
    public static void main(String[] args) {
 int n = 4;
 int f = calculFactorielle(n);
        System.out.println("Factorielle  de : " + n + " est: " + f + "\n");
    }
    /*
    / Écrire une méthode récursive Java pour calculer la factorielle d’un entier positif donné.
     */
    public static int calculFactorielle(int n){
        //Cas de base : la factorielle de 0 est égale à 1
        if(n ==0){
       return 1;
        }
        // Cas recursif: multiplier n par le factorielle de (n-1)
        return n * calculFactorielle(n-1);
    }
}