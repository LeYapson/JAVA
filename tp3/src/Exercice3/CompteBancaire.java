package Exercice3;

public class CompteBancaire {
    double solde;
    private String numeroCompte;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double depot(double amount) {
        solde += amount;
        return solde;
    }

    public double retrait(double amount) {
        solde -= amount;
        return solde;
    }

}
