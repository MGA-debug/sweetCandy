package ru.appline.logic.sweets;

public class Lollipop extends Candy {

    private String name;
    private double cost;
    private int weight;
    private String taste;

    public Lollipop(String name, double cost, int weight, String taste) {
        super(name, cost, weight);
        this.taste = taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        return "Леденцы: " + super.toString() + ", " + "вкус=" + this.taste;
    }
}
