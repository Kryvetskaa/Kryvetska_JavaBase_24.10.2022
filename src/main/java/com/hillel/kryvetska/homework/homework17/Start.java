package com.hillel.kryvetska.homework.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Start extends Drinks{
    static void runApp() {
        DrinksMachine[] drinkType = DrinksMachine.values();
        DrinksMachine userType = null;

        Scanner scanner = new Scanner(System.in);
        String drink;
        while (true) {
            System.out.println("Choose a drink from list: " + Arrays.toString(drinkType));//список напитков
            while (true) {
                drink = scanner.nextLine().toUpperCase();
                for (DrinksMachine drinksMachine : drinkType) {
                    if (drink.equals(drinksMachine.toString())) {
                        userType = DrinksMachine.valueOf(drink);
                        break;
                    }
                }
                if (userType != null) {
                    break;
                } else {
                    System.out.println("Wrong data, please try again");
                }
            }

//            Drinks drinks = new Drinks();

            DrinksMachine drinksMachine = DrinksMachine.valueOf(drink);//выбор напитка
            switch (drinksMachine) {
                case COFFEE:
                    System.out.println(coffeePrepare());
                    break;
                case TEA:
                    System.out.println(teaPrepare());
                    break;
                case LEMONADE:
                    System.out.println(lemonadePrepare());
                    break;
                case MOJITO:
                    System.out.println(mojitoPrepare());
                    break;
                case MINERAL_WATER:
                    System.out.println(waterPrepare());
                    break;
                case COCA_COLA:
                    System.out.println(cocaColaPrepare());
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
            break;


        }

    }
}
