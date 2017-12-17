package domain;

public class Ammunition {
    private boolean value;
    private byte rockets;

    public Ammunition() {}

    public Ammunition(boolean value) {
        this.value = value;
    }

    public Ammunition(boolean value, byte rockets) {
        this.value = value;
        this.rockets = rockets;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public byte getRockets() {
        return rockets;
    }

    public void setRockets(byte rockets) {
        this.rockets = rockets;
    }

    @Override
    public String toString() {
        return value + " " + rockets + " rockets";
    }
}
