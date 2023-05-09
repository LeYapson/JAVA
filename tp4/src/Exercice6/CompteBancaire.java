package Exercice6;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public void retrait(double montant) throws SoldeInsuffisantException {
        if (montant > this.solde) {
            throw new SoldeInsuffisantException("t'es trop pauvre pour retirer champion.");
        }
        this.solde -= montant;
    }

    public double getSolde() {
        return this.solde;
    }

    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(1000);

        try {
            compte.retrait(500);
            System.out.println("Retrait effectué. Nouveau solde : " + compte.getSolde());
            compte.retrait(800);
            System.out.println("Retrait effectué. Nouveau solde : " + compte.getSolde());
        } catch (SoldeInsuffisantException e) {
            System.out.println(e.getMessage());
            System.out.println("Solde actuel : " + compte.getSolde());
        }
    }
}
