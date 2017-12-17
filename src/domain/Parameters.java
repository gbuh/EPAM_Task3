package domain;

/**
 * This class describes Parameters of the plane
 * 
 * @version 1.2 17 Dec 2017
 * @author  Igor Lipko
 */
public class Parameters {
    private float length;
    private float width;
    private float height;
    private String measure;

    public Parameters() {}

    public Parameters(float length, float width, float height, String measure) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.measure = measure;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "parameters: " + "\n\tmeasure = " + measure + "\n\tlength = "
                + length + "\n\twidth = " + width + "\n\theight = " + height;
    }
}
