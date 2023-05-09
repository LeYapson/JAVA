package Exercice4;

public class Exo4 {

    public static int sumArray(int[] arr) {
        try {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        } catch (Exception e) {
            System.out.println("Le tableau est vide."+ e.getMessage());
            return 0; // Ou une autre valeur d'erreur appropriée.
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = null;

        int sum1 = sumArray(arr1);
        int sum2 = sumArray(arr2);

        System.out.println("Somme du tableau 1 : " + sum1);
        System.out.println("Somme du tableau 2 : " + sum2);
    }

}
