package Exercice2;

import java.util.Scanner;

public class Exo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Entrez un entier: ");
            int num = scanner.nextInt();
            int square = num * num;
            System.out.println("Le carré de " + num + " est " + square + ".");
        } catch (Exception e) {
            System.out.println("La valeur entrée ne peut pas être convertie en entier.");
        }
    }
}
