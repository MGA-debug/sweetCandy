package ru.appline.logic.sweets;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SweetGift {

    private List<Candy> sweetBox = new ArrayList<>();

    public SweetGift collectGift(Candy... candies) {
        sweetBox = Stream
                .of(candies)
                .collect(Collectors.toList());
        return this;
    }

    public void getInformation() {
        System.out.println("Подарок содержит: ");
        sweetBox.forEach(System.out::println);
        System.out.println("Общий вес: " + sweetBox.stream()
                .map(Candy::getWeight)
                .reduce(0, Integer::sum));
        System.out.println("Общая стоимость: " + sweetBox.stream()
                .map(Candy::getCost)
                .reduce(0.0, Double::sum));
    }
}
