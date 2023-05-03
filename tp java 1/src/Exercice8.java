import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez saisir des chiffres séparés par des espaces :");
        String nombre = scanner.nextLine();
        String[] values;
        values = nombre.split(" ");
        Map<Integer, Integer> occurrences = new HashMap<>();
        int total = values.length;
        for (String s: values) {
            Integer sInt = Integer.valueOf(s);
            if(occurrences.containsKey(sInt)) {
                occurrences.put(sInt, occurrences.get(sInt) + 1);
            } else {
                occurrences.put(sInt, 1);
            }
        }
        for (Map.Entry<Integer, Integer> valueInteger : occurrences.entrySet()) {
            int value = valueInteger.getKey();
            int nbOcc = valueInteger.getValue();
            System.out.printf("le nombre %d apparait %d fois \n", value, nbOcc);
        }
        System.out.println("nombre total d'entrées: " + total);

    }
}
