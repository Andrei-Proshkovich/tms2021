import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        validate("asdassasdada5");


    }


    public static boolean validate(String str) {
        Pattern pattern = Pattern.compile("^[a-z].+[1]?|[5]?$");
        Matcher matcher = pattern.matcher(str);


        if (str.length() < 4) {
            System.out.println("Строка меньше 4 символов");
        } else if (str.length() > 20) {
            System.out.println("Строка больше 20 символов");
        }

        if (matcher.matches()) {

            System.out.println("Пароль правильный");
        } else {
            System.out.println("Неправильные символы");
        }
        return false;
    }
}



