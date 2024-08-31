package ivan_m.Exceptions.SmartHome;

public class LightAlreadyOnException extends RuntimeException {
    public LightAlreadyOnException(String message) {
        super(message);
    }
}
