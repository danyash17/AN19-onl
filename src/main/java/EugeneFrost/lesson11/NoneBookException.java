package EugeneFrost.lesson11;

public class NoneBookException extends RuntimeException {
    public NoneBookException() {
        super("Данной книги нету!");
    }
}
