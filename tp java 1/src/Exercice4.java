public class Exercice4 {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6,7,8,9,10};
        int i;
        int x = 0;
        for(i = 0; i < tab.length; i++) {
            if(tab[i]%2 == 0) {
                x += tab[i];
            }
        }
        System.out.println(x);
    }
}
