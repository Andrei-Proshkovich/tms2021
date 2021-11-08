public class WrongLoginException extends Exception {
    String login;

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super("WrongLoginException");
    }
}
