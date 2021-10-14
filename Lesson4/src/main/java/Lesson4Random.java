import java.util.Arrays;
import java.util.Random;

public class Lesson4Random {
    public static void main(String[] args) {
        int [] arr = new int[20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= r.nextInt(20);

        }
        System.out.println(Arrays.toString(arr));
        for (int l = 1; l < arr.length; l=l+2) {
            arr[l]=0;
        }



        System.out.println(Arrays.toString(arr));
}}
