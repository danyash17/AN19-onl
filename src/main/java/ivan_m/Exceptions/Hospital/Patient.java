package ivan_m.Exceptions.Hospital;

public class Patient {
    private String name;
    private boolean isRegistered = false;

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
