package Exercice2;

public class Rectangle extends Forme{
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double aire() {

        return longueur*largeur;
    }
}
