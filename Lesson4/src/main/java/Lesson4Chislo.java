import java.util.Scanner;

public class Lesson4Chislo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            int num = (int)Math.log10(n)+1;
            System.out.println("Number polozitelnoe");
            System.out.println(num);
        } else if (n < 0) {
            int z= Math.abs(n);
            int per = (int)Math.log10(z)+1;

            System.out.println("Chislo otricatelnoe");
            System.out.println( Math.abs(per));

        } else {
            System.out.println("chislo ravno 0");
            System.out.println("0");
        }


    }
}
