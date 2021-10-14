public class Lesson4sum {
    public static void main(String[] args) {

        System.out.println(summ(7, 9));

    }

    public static int summ(int a, int b) {
        int resultat = 0;
        for (int i = 0; i < a; i++) {
            resultat += b;
        }

        return resultat;

    }
}