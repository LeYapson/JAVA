public class Exercice6 {
    public static void main(String[] args) {
        int i;
        for(i =1; i <= 100; i++) {
            if(i%3 ==0 && i%5 ==0) {
                System.out.println(i +" : multiple de 3 et 5");
                continue;
            }
            if(i%3 ==0) {
                System.out.println(i +" : multiple de 3");
                continue;
            }
            if (i%5 ==0) {
                System.out.println(i +" : multiple de 5");
                continue;
            }
                System.out.println(i);
            }
        }
    }

