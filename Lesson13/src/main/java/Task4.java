import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String text = " One two three раз два три one1 two2 123";
//        String[] parts = text.split("\\.");
        Pattern pattern = Pattern.compile("[a-zA-Z]+\s+?");
        int q = 0;

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            q++;
            System.out.println(text.substring(matcher.start(), matcher.end()));
            System.out.println("Количество слов, содержащих только символы латинского алфавита =" + q);
        }


    }
}

//
//        for (String s : parts) {
//
//                System.out.println(s);
//                isPalindrom(s);
