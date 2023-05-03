import java.util.Scanner;
import java.util.Stack;

public class Exercice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entre des mots random avec des virgules entre, comme Edgard :");
        String words = scanner.nextLine();
        String[] tabWords = words.split(",");
        Stack<String> pile = new Stack<String>();
        for (String tabWord : tabWords) {
            pile.push(tabWord);
        }
        while (!pile.isEmpty()) {
            String result  = pile.pop();
            System.out.println(result);
        }
    }
}
