package Exercice1;

public class Exo1 {
    public static int getElement(int[] array, int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("L'index est en dehors des limites du tableau.");
            return -1;
        }
    }

    public static void main(String[] args) {
        getElement(new int[] {4,1,0,2,4,5}, 8);
    }
}
