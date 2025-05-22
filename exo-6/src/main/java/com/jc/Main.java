package com.jc;

public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 24;

        int pgcd = calculPgcd(a, b);
        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);

    }
    // Écrire une méthode récursive Java pour trouver le plus grand diviseur commun (PGCD) de deux nombres.

    /*
    Methode recursive pour calculer le PGCD(Plus grand commun diviseur)
     */
    public static int calculPgcd(int a, int b){
        // Cas de base  si b est égale à 0 le PGCD est a
     if(b == 0){
         return a;
     }
     //Cas recursif : PGCD(a, b) = PGCD(b, a%b);
        return calculPgcd(b, a % b);
    }
}