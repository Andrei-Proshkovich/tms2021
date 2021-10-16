public class Lesson4Massivenechet {
    public static void main(String[] args) {
        flippingOdds();
        System.out.println();
    }

    public static void flippingOdds() {
        int[] mass = {3, 4, 1, 62, 7, 8, 4, -5, 7, 62, 13, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0) {
                System.out.print(mass[i] + " ");
            }
        }
        System.out.println();

        for (int i = mass.length - 1; i >= 0; i--) {
            if (mass[i] % 2 != 0) {
                System.out.print(mass[i] + " ");
            }
        }
    }
}
