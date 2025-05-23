package com.jc;

public class Main {
    public static void main(String[] args) {

        double base = 2;
        int exposant = 4;
        double res = puissanceSimple((int) base, exposant);
        System.out.println(base  + " La puissance de " + exposant + " = " + res);
    }

    /*
    Écrire une méthode récursive Java pour calculer l'exponentiation d'un nombre (base) à une puissance (exposant).
     */
    public static long puissanceSimple(int base, int exposant){
        //Cas de base tout nombre à la puissance 0 égale 1;
        if(exposant == 0){
            return 1;
        }
        //Cas  de base: base à la puissance 1 = base
        if(exposant == 1){
            return base;
        }
        //Recursion : base * base(exposant -1)
        return base * puissanceSimple(base, exposant-1);
    }
}