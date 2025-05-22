package com.jc;

public class Main {
    public static void main(String[] args) {
 int n = 10;
 int result = calculSomme(n);
 System.out.println("La somme de tous les nombres de 1 à "+ n + " est " + result);

    }
     /*
        Écrire une méthode récursive Java pour calculer la somme de tous les nombres de 1 à n./
         */
    public static int calculSomme(int n){
        if( n== 0){
            return 0;
        }
        return  n + calculSomme(n-1);
    }


}