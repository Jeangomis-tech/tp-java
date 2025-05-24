package com.jc;

public class Main {
    public static void main(String[] args) {
       String phr = "Hello, World!";
       int longueur= calculLongueurChaine(phr);
        System.out.println("La longueur de la chaine est: "+longueur);
    }
    /*
    Écrire une méthode récursive Java pour trouver la longueur d'une chaîne donnée.
     */
    public static int calculLongueurChaine(String str){

        // Cas de base: Vérifer si la chaine est vide
        if(str.isEmpty()){
            return 0;
        }
        //Cas recursif: 1 + longueur du reste de la chaine(sans le premier caractére)
        return 1 + calculLongueurChaine(str.substring(1));
    }
}