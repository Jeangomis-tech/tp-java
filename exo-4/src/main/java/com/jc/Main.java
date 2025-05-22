package com.jc;

public class Main {
    public static void main(String[] args) {
        String str = " madam ";
        boolean result = isPalindrome(str);
        System.out.println(str +" est un palindrome : " + result);
    }
    /*
    Écrire une méthode récursive Java pour vérifier si une chaîne donnée est un palindrome./
     */
    public static boolean isPalindrome(String s) {
        // Cas de base : une chaine vide est ou une chaine avec un seul caractére est un palinfrome
        if( s.length() <= 1) return true;


        // Cas recursif: vérifier si le premier et le dernier caractére sont égaux , et vérifier récursivement si la sous chaine qui le sépare st un palindrome
        char premChar = s.charAt(0);
        char prevChar = s.charAt(s.length() - 1);
        if (premChar != prevChar) return false;

        String reste = s.substring(1, s.length() - 1);
        return isPalindrome(reste);
    }
}

