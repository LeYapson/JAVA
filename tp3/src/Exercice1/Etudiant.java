package Exercice1;

import java.time.Year;
import java.util.Calendar;

public class Etudiant extends Personne{
    private String numeroEtudiant;
    private double noteMoyenne;

    public Etudiant(String nom, String prenom, int age, String numeroEtudiant, double noteMoyenne) {
        super(nom, prenom, age);
        this.numeroEtudiant= numeroEtudiant;
        this.noteMoyenne= noteMoyenne;
    }


    public String getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(String numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    public double getNoteMoyenne() {
        return noteMoyenne;
    }

    public void setNoteMoyenne(double noteMoyenne) {
        this.noteMoyenne = noteMoyenne;
    }

    public boolean haveMoyenne() {
        return this.noteMoyenne > 10;
    }

    public boolean numeroValide() {
        // Vérifie que le numéro contient exactement 8 caractères
        if (numeroEtudiant.length() != 8) {
            return false;
        }
        // Vérifie que le numéro commence par l'année scolaire en cours
        String currentYear = Integer.toString(Year.now().getValue());
        if (!numeroEtudiant.startsWith(currentYear)) {
            return false;
        }

        // Si toutes les vérifications ont réussi, le numéro est valide
        return true;
    }


    public static void main(String[] args) {
        Etudiant edgar = new Etudiant("Chevalier","Edgar",18,"20231418",14.18);
        System.out.println(edgar.getNom());
        System.out.println(edgar.getPrenom());
        System.out.println(edgar.getAge());
        System.out.println(edgar.getNumeroEtudiant());
        System.out.println(edgar.getNoteMoyenne());
        System.out.println(edgar.haveMoyenne());
        System.out.println(edgar.numeroValide());
    }
}
