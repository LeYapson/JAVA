import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("veuillez saisir un premier entier :");
        int entier1= Integer.parseInt(scanner.nextLine());
        System.out.println("veuillez saisir un deuxième entier :");
        int entier2= Integer.parseInt(scanner.nextLine());
        if(entier1 == entier2) {
            System.out.println("Les deux entiers sont égaux");
            return;
        }
        if(entier1 < entier2) {
            System.out.println(entier2 + " est plus grand que le premier entier");
        } else {
            System.out.println(entier1 + " est plus grand que le deuxième");
        }
    }
}
