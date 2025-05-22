package com.jc;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        String res = inverserChaine(str);
        System.out.println("Chaine originale: ! "+str);
        System.out.println("Chaine inversée :" + res);
    }
    /*
    Écrire une méthode récursive Java pour inverser une chaîne de caractères donnée.
     */

    public static String inverserChaine(String str){
        // Cas de base : chaine vide ou avec un seul caractére
        if( str == null || str.length() <= 1){
            return str;

        }
        // Recursion prendre le dernier caractére + inverser le reste
        return  str.charAt(str.length()-1) + inverserChaine(str.substring(0,str.length()-1));
    }
}