package Exercice5;

public class Calculatrice {

        public static double diviser(double a, double b) {
            if (b == 0) {
                throw new IllegalArgumentException("Le deuxième nombre ne peut pas être zéro.");
            }
            return a / b;
        }


        public static void main(String[] args) {
            double a = 10;
            double b = 2;
            double resultat = Calculatrice.diviser(a, b);
            System.out.println(resultat); // affiche 5.0

            b = 0;
            try {
                resultat = Calculatrice.diviser(a, b);
                System.out.println(resultat);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // affiche "Le deuxième nombre ne peut pas être zéro."
            }
        }
    }
