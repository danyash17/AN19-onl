package ivan_m.Exceptions.SmartHome;

public class LightAlreadyOffException extends RuntimeException {
    public LightAlreadyOffException(String message) {
        super(message);
    }
}
