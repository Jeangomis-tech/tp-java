package com.jc;

public class Main {
    public static void main(String[] args) {

         int p = 10;
         int f = calcullateNiemeFibonacci(p);
         System.out.println("Le nombre de fibonacci à la position: " + p + " est " + f) ;
    }
    /*
     Écrire une méthode récursive Java pour calculer le nième nombre de Fibonacci.
     */
    public static int calcullateNiemeFibonacci(int n) {

        // Cas de base: Les nombres de Fibonacci aux positions 0 et 1
        // sont respectivement 0 et 1.
        if(n == 0) return 0;
        else if(n == 1) return 1;

        // Cas recursif: somme de deux nombres de Fibonacci précédents
        return calcullateNiemeFibonacci(n-1) + calcullateNiemeFibonacci(n-2);
    }
}