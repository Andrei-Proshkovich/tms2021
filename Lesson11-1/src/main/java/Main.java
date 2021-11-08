import java.util.Scanner;

public class Main {
    String login;
    String password;
    String confirmPassword;

    public static void main(String[] args) throws WrongPasswordException, WrongLoginException {

        checkAuthorization();
    }

    static boolean checkAuthorization() throws WrongPasswordException, WrongLoginException {
        Scanner scanner = new Scanner(System.in);
        String login = null;
        String password = null;
        String confirmPassword = null;

        try {

            login = scanner.nextLine();
            password = scanner.nextLine();
            confirmPassword = scanner.nextLine();
            boolean isLoginTrue = login.length() < 20;
            boolean isPasswordTrue = password.length() < 20;
            boolean isConfirmPassword = password.equals(confirmPassword);
            return true;
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;

        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}



