package slava_n.lesson12.exceptions;

public class InvalidTitleNameException extends RuntimeException {
    public InvalidTitleNameException(String message) {
        super(message);
    }
}
