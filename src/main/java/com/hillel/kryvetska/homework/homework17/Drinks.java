package com.hillel.kryvetska.homework.homework17;

import java.util.Scanner;

public class Drinks {

    private static final int COFFEE_PRICE = DrinksMachine.COFFEE.getPrice();
    public static final int TEA_PRICE = DrinksMachine.TEA.getPrice();
    public static final int LEMONADE_PRICE = DrinksMachine.LEMONADE.getPrice();
    public static final int MOJITO_PRICE = DrinksMachine.MOJITO.getPrice();
    public static final int MINERAL_WATER_PRICE = DrinksMachine.MINERAL_WATER.getPrice();
    public static final int COCA_COLA_PRICE = DrinksMachine.COCA_COLA.getPrice();

    static int totalSum ;
    static int cups;
    static Scanner scanner = new Scanner(System.in);

        public static String coffeePrepare(){
        System.out.println("A cup of coffee costs : " + COFFEE_PRICE + "грн");
        all();
            return "You chose coffee. " + "to pay: " + cups * COFFEE_PRICE + " for " + cups + " cups";
        }


        public static String teaPrepare(){
        System.out.println("A cup of tea costs : " + TEA_PRICE + "грн");
        all();
            return "You chose tea. " + "to pay: " + cups * TEA_PRICE + " for " + cups + " cups";
    }


    public static String lemonadePrepare(){
        System.out.println("A cup of lemonade costs : " + LEMONADE_PRICE + "грн");
        all();
        return "You chose lemonade. " + "to pay: " + cups * LEMONADE_PRICE + " for " + cups + " cups";

    }


    public static String mojitoPrepare(){
            System.out.println("A cup of mojito costs : " + MOJITO_PRICE + "грн");
        all();
        return "You chose mojito. " + "to pay: " + cups * MOJITO_PRICE + " for " + cups + " cups";

    }


    public static String waterPrepare(){
        System.out.println("A cup of mineral water costs : " + MINERAL_WATER_PRICE + "грн");
        all();
        return "You chose mineral water. " + "to pay: " + cups * MINERAL_WATER_PRICE + " for " + cups + " cups";

    }


    public static String cocaColaPrepare(){
        System.out.println("A cup of coca cola costs : " + COCA_COLA_PRICE + "грн");
        all();
        return "You chose coca cola. " + "to pay: " + cups * COCA_COLA_PRICE + " for " + cups + " cups";

    }

    public static void all(){
        while (true) {
            System.out.print("Number of cups: ");
            if (scanner.hasNextInt()) {
                cups = scanner.nextInt();
                if (cups > 0) {
                    break;
                } else {
                    System.out.println("Please enter positive number");
                }
            } else {
                System.out.println("Wrong data, please try again");
                scanner.nextLine();
            }
        }
    }

}

