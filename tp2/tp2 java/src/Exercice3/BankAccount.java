package Exercice3;

public class BankAccount {
    private double solde;
    private String courant;
    private TypeAccount compte;


    public BankAccount(String courant, double solde,TypeAccount compte) {
        this.courant = courant;
        this.solde = solde;
        this.compte = compte;
    }

    public TypeAccount getCompte() {
        return compte;
    }

    public void setCompte(TypeAccount compte) {
        this.compte = compte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getCourant() {
        return courant;
    }

    public void setCourant(String courant) {
        this.courant = courant;
    }
    public void add(double amount) {
        this.solde += amount;
    }
    public void withDraw(double amount) {
        this.solde -= amount;
    }
    public boolean isNegatif() {
        return this.solde <0;
    }
    @Override
    public String toString() {
        return String.format("Mon compte bancaire est un %s et je dispose de %.2f euros et est de type %s",getCourant(),getSolde(),getCompte());
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("compte courant", 512.236,TypeAccount.COMPTE_COURANT);
        System.out.println(myAccount);
    }
}
