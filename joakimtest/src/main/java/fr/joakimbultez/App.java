package fr.joakimbultez;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Ecrivez le nom 1");
        String NOM1 = clavier.next();
        System.out.println("Ecrivez le nombre");
        int NOMBRE = clavier.nextInt();
        System.out.println("Ecrivez le nom 2");
        String NOM2 = clavier.next();
        System.out.println("Ecrivez l'adjectif");
        String ADJECTIF = clavier.next();
        System.out.println("Il était une fois " + NOM1 + " qui avait " + NOMBRE + " " + NOM2 + ". Cela le rendait très "
                + ADJECTIF + ".");
    }

}
