import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String java = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Pattern pattern = Pattern.compile("Java\s+\\d\\d?");

        Matcher matcher = pattern.matcher(java);
        while (matcher.find()) {
            System.out.println(java.substring(matcher.start(), matcher.end()));
        }
    }
}
