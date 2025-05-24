package com.jc;

public class Main {
    public static void main(String[] args) {
        int[] test1 = {1,2,3,4, 5,6, 7, 8, 9, 10};
        int sum = calculSommeNombreImpaire(test1);
        System.out.println("La somme des nombres paires dans [ 1,2,3,4, 5,6, 7, 8, 9, 10] est: " + sum);
    }

    /*
    Écrire une méthode récursive Java pour trouver la somme de tous les nombres impairs dans un tableau.
     */
    public static int  calculSommeNombreImpaire(int[] tab, int index){
        // Cas de base: si on a atteint la fin du tableau
        if(index >= tab.length){
          return 0;
      }

        /*
        Cas récursif: vérifier si l'élément courant  est impaire
         */
        if(tab[index] %2 != 0){
            //Si impaires l'ajouter à la somme recursive  du reste du tableau

            return tab[index] + calculSommeNombreImpaire(tab, index + 1);
        }else{
            return calculSommeNombreImpaire(tab, index + 1);
        }

    }
    public static int calculSommeNombreImpaire(int[] tab){
        return calculSommeNombreImpaire(tab, 0);
    }

}