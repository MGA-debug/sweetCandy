package ru.appline.logic.sweets;

import java.util.Arrays;

public class SweetGift {

    private Candy[] sweetBox;

    public SweetGift collectGift(Candy... candies) {
        sweetBox = candies;
        return this;
    }

    public void getInformation() {
        System.out.println("Подарок содержит: ");
        Arrays.stream(sweetBox).forEach(System.out::println);
        System.out.println("Общий вес: " + Arrays.stream(sweetBox)
                .map(Candy::getWeight)
                .reduce(0, Integer::sum));
        System.out.println("Общая стоимость: " + Arrays.stream(sweetBox)
                .map(Candy::getCost)
                .reduce(0.0, Double::sum));
    }
}
