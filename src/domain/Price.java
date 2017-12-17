package domain;

/**
 * This class describes plane Price entity
 * 
 * @version 1.2 17 Dec 2017
 * @author  Igor Lipko
 */
public class Price {
    private int value;
    private String currency;

    public Price() {};

    public Price(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "price = " + value + " " + currency;
    }
}
