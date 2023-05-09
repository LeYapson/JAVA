import Exercice2.Cercle;
import Exercice2.Forme;
import Exercice2.Triangle;

public class Main {
    public static void afficherAire(Forme forme) {
       System.out.println(forme.aire());
    }
    public static void main(String[] args) {
        Forme cercle = new Cercle(4);
        afficherAire(cercle);
    }
}


