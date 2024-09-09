package slava_n.lesson12.exceptions;

public class InvalidAuthorNameException extends RuntimeException {
    public InvalidAuthorNameException(String message) {
        super(message);
    }
}
