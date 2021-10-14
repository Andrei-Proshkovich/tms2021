public class Lesson4Povtory {
    public static void main(String[] args) {

    int[] mass = new int[]{1, 3, 4, 5, 6, 8, 9};
    for (int i = 0; i < mass.length; i++) {
        for (int j = i + 1; j < mass.length; j++) {
            if (mass[i] == mass[j]) {
                System.out.println(mass[j]);
            }


        }
    }
    System.out.println("Massive have no povtorov");
}
}
