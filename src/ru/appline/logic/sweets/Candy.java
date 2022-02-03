package ru.appline.logic.sweets;

public class Candy {
    private String name;
    private double cost;
    private int weight;

    public Candy(String name, double cost, int weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "наименование=" + this.name + ", цена=" + this.cost + ", вес=" + this.weight;
    }
}
