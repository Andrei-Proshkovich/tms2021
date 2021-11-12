public class Task1_2 {
    public static void main(String[] args) {

        String name = "Andrew Proshkovich";
        int start = 0;
        int end = 6;
        char str[] = new char[end - start];
        name.getChars(start, end, str, 0);
        System.out.println(str);

        String hello1 = "hello";
        System.out.println(swapChars(hello1, 0, 2));
    }

    public static String swapChars(String input, int lIdx, int rIdx) {
        StringBuilder sb = new StringBuilder(input);
        sb.setCharAt(lIdx, input.charAt(rIdx));
        sb.setCharAt(rIdx, input.charAt(lIdx));
        return sb.toString();
    }

}
