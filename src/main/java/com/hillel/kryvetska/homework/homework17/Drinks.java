package com.hillel.kryvetska.homework.homework17;

import java.util.Arrays;
import java.util.Scanner;

import static com.hillel.kryvetska.homework.homework17.DrinksMachine.COFFEE;

public class Drinks {

    private static final int COFFEE_PRICE = 31;
    public static final int TEA_PRICE = 25;
    public static final int LEMONADE_PRICE = 25;
    public static final int MOJITO_PRICE = 32;
    public static final int MINERAL_WATER_PRICE = 15;
    public static final int COCA_COLA_PRICE = 20;


//    DrinksMachine transportType = null;

    Scanner scanner = new Scanner(System.in);

        public String coffeePrepare(){
        System.out.println("A cup of coffee costs : " + COFFEE_PRICE + "грн");
        int cups;
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
                System.out.println("Wrong data, please enter integer");
                scanner.nextLine();
            }
        }
            return "You choosed coffee. " + "it costs: " + cups * COFFEE_PRICE + " for " + cups + " cups";
        }


        public String teaPrepare(){
        System.out.println("A cup of tea costs : " + TEA_PRICE + "грн");
        int cups;
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
                System.out.println("Wrong data, please enter integer");
                scanner.nextLine();
            }
        }
            return "You choosed tea. " + "to pay: " + cups * TEA_PRICE + " for " + cups + " cups";
    }


    public String lemonadePrepare(){
        System.out.println("A cup of lemonade costs : " + LEMONADE_PRICE + "грн");
        int cups;
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
                System.out.println("Wrong data, please enter integer");
                scanner.nextLine();
            }
        }
        return "You choosed lemonade. " + "to pay: " + cups * LEMONADE_PRICE + " for " + cups + " cups";

    }


    public String mojitoPrepare(){
            System.out.println("A cup of mojito costs : " + MOJITO_PRICE + "грн");
        int cups;
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
                System.out.println("Wrong data, please enter integer");
                scanner.nextLine();
            }
        }
        return "You choosed mojito. " + "to pay: " + cups * MOJITO_PRICE + " for " + cups + " cups";

    }


    public String waterPrepare(){
        System.out.println("A cup of mineral water costs : " + MINERAL_WATER_PRICE + "грн");
        int cups;
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
                System.out.println("Wrong data, please enter integer");
                scanner.nextLine();
            }
        }
        return "You choosed mineral water. " + "to pay: " + cups * MINERAL_WATER_PRICE + " for " + cups + " cups";

    }


    public String cocaColaPrepare(){
        System.out.println("A cup of coca cola costs : " + COCA_COLA_PRICE + "грн");
        int cups;
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
                System.out.println("Wrong data, please enter integer");
                scanner.nextLine();
            }
        }
        return "You choosed coca cola. " + "to pay: " + cups * COCA_COLA_PRICE + " for " + cups + " cups";

    }



}