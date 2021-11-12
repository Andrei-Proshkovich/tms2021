public class Task3 {
    public static void main(String[] args) {
        String words[] = {"ltl", "polina"};
        String a;
        reverseString("lol");


        for (int i = 0; i < words.length; i++) {

            a = words[i];
            if (a.equals(reverseString(a))) {
                System.out.println(a);
            }


        }
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

