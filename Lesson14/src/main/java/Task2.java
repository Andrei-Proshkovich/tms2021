import java.io.*;


public class Task2 {

    public static final String INTPUT_FILE = "Lesson14/src/main/resources/input2";
    private static final String FILE_NAME_OUTPUT = "Lesson14/src/main/resources/output2.txt";

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new FileReader(new File(INTPUT_FILE)));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(FILE_NAME_OUTPUT)));
        String str;

        while ((str = bf.readLine()) != null) {
            String[] arrayWords = str.split("[-!?.]\\s");

            for (String s : arrayWords) {
                if (countWords(s) >= 3 && countWords(s) <= 5 | isPalindrom(s)) {
                    bw.write(s + "\n");

                    System.out.println(s);
                }
            }

        }
        bw.close();

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

    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    public static boolean isPalindrom(String q) {
        String[] w = q.split(" ");
        for (String s : w) {
            for (int i = 0; i < w.length; i++) {
                s = w[i];
                i++;

            }
            if (s.equals(reverseString(s))) {

                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
    

