package ru.appline.logic.sweets;

public class Chocolate extends Candy {

    private String type;
    private double cost;
    private int weight;
    private String countryOfOrigin;

    public Chocolate(String type, double cost, int weight, String countryOfOrigin) {
        super(type, cost, weight);
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Шоколад: " + super.toString() + ", " + "страна производитель=" + this.countryOfOrigin;
    }
}
