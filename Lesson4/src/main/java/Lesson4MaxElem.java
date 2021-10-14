import java.util.Arrays;

public class Lesson4MaxElem {
    public static void main(String[] args) {

        int arr []={4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (x<arr[i]) {
                x = arr[i];
                arr[0]=x;

            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
