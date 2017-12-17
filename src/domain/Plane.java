package domain;

/**
 * This class describes the Plane entity
 * 
 * @version 1.2 17 Dec 2017
 * @author  Igor Lipko
 */
public class Plane{
    private String identity;
    private String model;
    private String origin;
    private Price price;
    private Chars chars;
    private Parameters parameters;

    public Plane() {}

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Chars getChars() {
        return chars;
    }

    public void setChars(Chars chars) {
        this.chars = chars;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "Plane:\nID = " + identity +"\nmodel = " + model + "\norigin = "
                + origin + "\n" + price + "\n" + chars + "\n" + parameters;
    }
}
