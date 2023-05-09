package Exercice3;

public class CompteEpargne extends CompteBancaire implements CompteRemunere{
    private double tauxInteret;

    public CompteEpargne(double solde, double tauxInteret) {
        super(solde);
        this.tauxInteret = tauxInteret;
    }

    @Override
    public void calculInterest() {
        double totalInterest = this.solde * this.tauxInteret /100;
        totalInterest += this.solde;
        System.out.println(totalInterest);
    }

    public static void main(String[] args) {
        CompteEpargne livretA = new CompteEpargne(1000,10);
        System.out.println("solde avant calcul d'interet:");
        System.out.println(livretA.getSolde());
        System.out.printf("depot sur le compte:%.2f \n",livretA.depot(150.0));
        System.out.printf("retrait sur le compte:%.2f \n",livretA.retrait(50.0));
        System.out.println("solde après calcul d'interet:");
        livretA.calculInterest();
    }
}
