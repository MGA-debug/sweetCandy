package ru.appline.logic.sweets;

public class Candy {
    private String name;
    private int cost;
    private int weight;
    private String description;

    public Candy(String name, int cost, int weight, String description) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Сладость{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}
