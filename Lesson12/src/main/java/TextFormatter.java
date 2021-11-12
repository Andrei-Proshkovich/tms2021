public class TextFormatter {
    public static void main(String[] args) {
        String text = " I mam world. I love this city. I go to school every day.";


        String[] parts = text.split("\\.");

        for (String s : parts) {
            if (countWords(s) < 6) {
                System.out.println(s);
                isPalindrom(s);

            } else {
                System.out.println("V stroke mnogo slov");
            }

        }
    }

    public static int countWords(String str) {
        int count = 0;
        String[] word = str.split(" ");
        for (String s : word) {
            for (int i = 0; i < word.length; i++) {
                s = word[i];

            }
            count++;
        }
        return count;
    }

    public static boolean isPalindrom(String q) {
        String[] w = q.split(" ");
        for (String s : w) {
            for (int i = 0; i < w.length; i++) {
                s = w[i];
                i++;

            }
            if (s.equals(reverseString(s))) {
                System.out.println(s);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;


    }


}
