import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String s = "cab, ccab, cccab";
        Pattern pattern = Pattern.compile("c.+?b");

        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(s.substring(matcher.start(), matcher.end()));
        }

    }
}
