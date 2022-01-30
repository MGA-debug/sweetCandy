package ru.appline.logic;

import ru.appline.logic.sweets.Candy;
import ru.appline.logic.sweets.SweetGift;

public class Base {
    public static void main(String[] args) {
        new SweetGift().collectGift(
                new Candy("Зефир", 25, 100, "розовый"),
                new Candy("Мармелад", 50, 125, "плохо жуётся"),
                new Candy("Леденец", 15, 40, "кладенец"))
                .getInformation();
    }
}
