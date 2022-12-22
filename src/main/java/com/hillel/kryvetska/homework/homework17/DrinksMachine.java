package com.hillel.kryvetska.homework.homework17;

public enum DrinksMachine {

    COFFEE (31),
    TEA (25),
    LEMONADE(25),
    MOJITO(32),
    MINERAL_WATER(15) ,
    COCA_COLA(20);

    private int price;

    DrinksMachine(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
