import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("veuillez saisir votre nom :");
        String nom=scanner.nextLine();
        System.out.println("veuillez saisir votre âge :");
        Integer age= Integer.valueOf(scanner.nextLine());
        if(age <= 18) {
            System.out.println("ahhhhhh " + nom + " t un mineur!!!");
        } else {
            System.out.println("Bienvenue :" + nom + " tu as donc : "+ age + " ans " + "t trop bg mec" );
        }
    }
}
