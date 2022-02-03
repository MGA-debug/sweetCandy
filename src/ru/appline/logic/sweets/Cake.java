package ru.appline.logic.sweets;

public class Cake extends Candy {
    private String name;
    private double cost;
    private int weight;
    private String caloricContent;

    public Cake(String type, double cost, int weight, String caloricContent) {
        super(type, cost, weight);
        this.caloricContent = caloricContent;
    }

    public void setCaloricContent(String caloricContent) {
        this.caloricContent = caloricContent;
    }

    public String getCaloricContent() {
        return caloricContent;
    }

    @Override
    public String toString() {
        return "Торт: " + super.toString() + ", " + "калорийность=" + this.caloricContent;
    }
}
