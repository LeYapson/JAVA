package Exercice3;

public class Exo3 {

    public static int convertStringToInt(String chain) throws Exception {
        return Integer.parseInt(chain);
    }

    public static void main(String[] args) {
        try {
            System.out.println(convertStringToInt("pp145"));
        } catch (Exception e) {
            System.out.println("La chaîne n'est pas un nombre valide." + e.getMessage());
        }
    }
}
