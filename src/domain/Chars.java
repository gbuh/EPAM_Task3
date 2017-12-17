package domain;

public class Chars {
    private String type;
    private byte places;
    private Ammunition ammunition;
    private boolean radar;

    public Chars() {}

    public Chars(String type, byte places, Ammunition ammunition,
            boolean radar) {
        this.type = type;
        this.places = places;
        this.ammunition = ammunition;
        this.radar = radar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte getPlases() {
        return places;
    }

    public void setPlases(byte places) {
        this.places = places;
    }

    public Ammunition getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(Ammunition ammunition) {
        this.ammunition = ammunition;
    }

    public boolean isRadar() {
        return radar;
    }

    public void setRadar(boolean radar) {
        this.radar = radar;
    }

    @Override
    public String toString() {
        return "chars:" + "\n\ttype = " + type + "\n\tplaces = " + places
                + "\n\tammunition = " + ammunition + "\n\tradar = " + radar;
    }
}
