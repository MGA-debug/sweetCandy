package ru.appline.logic;

import ru.appline.logic.sweets.Cake;
import ru.appline.logic.sweets.Chocolate;
import ru.appline.logic.sweets.Lollipop;
import ru.appline.logic.sweets.SweetGift;

public class Base {
    public static void main(String[] args) {
        new SweetGift().collectGift(
                new Cake("Наполеон", 252, 100, "300 ккал"),
                new Chocolate("Молочный", 75, 50, "Бельгия"),
                new Lollipop("Бонпари", 25, 80, "Кислые"))
                .getInformation();
    }
}
