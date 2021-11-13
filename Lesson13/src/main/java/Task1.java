public class Task1 {
    public static void main(String[] args) {
        String p = "String";
        middle("vokalist");

    }

    static void middle(String str) {
        int middle = str.length() / 2;
        int v = middle - 1;
        char[] m = new char[2];
        str.getChars(v, middle + 1, m, 0);


        System.out.println(m);
    }
}
