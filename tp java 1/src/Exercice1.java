import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("veuillez saisir votre nom :");
        String nom=scanner.nextLine();
        System.out.println("veuillez saisir votre âge :");
        String age= scanner.nextLine();
        System.out.println("Bienvenue :" + nom + " tu as donc : "+ age + " ans " + "t trop bg mec" );
    }
}
