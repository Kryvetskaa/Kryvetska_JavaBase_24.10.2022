package com.hillel.kryvetska.homework.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runApp();
        Scanner scanner = new Scanner(System.in);
        boolean a = true;//условие для цикла
        boolean moreDrinks = true;//условие для цикла
        while (moreDrinks) {
            System.out.println("Do you want something else? Yes/No");
            String answer = scanner.nextLine();
            if (answer.equals("NO") || answer.equals("No") || answer.equals("no")) {
                moreDrinks = false;
                a = false;
            } else if (answer.equals("YES") || answer.equals("Yes") || answer.equals("yes")) {
                moreDrinks = true;
                a = true;
                runApp();

            } else {
                System.out.println("please answer - Yes or No");
            }
        }
    }

    static void runApp (){
        DrinksMachine[] drinksMachines = DrinksMachine.values();
//        DrinksMachine drinksMachine = null;
        Scanner scanner = new Scanner(System.in);
        Drinks drinks = new Drinks();

        boolean a = true;//условие для цикла
        while (a) {
            System.out.println("Choose a drink : ");
            System.out.println(Arrays.toString(DrinksMachine.values()));//список напитков
            String drink = scanner.nextLine().toUpperCase();

            DrinksMachine drinksMachine = DrinksMachine.valueOf(drink);//выбор напитка
            switch (drinksMachine) {
                case COFFEE:
                    System.out.println(drinks.coffeePrepare());
                    break;
                case TEA:
                    System.out.println(drinks.teaPrepare());
                    break;
                case LEMONADE:
                    System.out.println(drinks.lemonadePrepare());
                    break;
                case MOJITO:
                    System.out.println(drinks.mojitoPrepare());
                    break;
                case MINERAL_WATER:
                    System.out.println(drinks.waterPrepare());
                    break;
                case COCA_COLA:
                    System.out.println(drinks.cocaColaPrepare());
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            } break;


        }





























        //        DrinksMachine[] drinksMachines = DrinksMachine.values();
//        DrinksMachine drinkType = null;


//            case TEA: {
//                System.out.println("You choosed tea." + "it costs: " + drinks.coffeePrice() + "for " + drinks.coffeeCups() + "cups");
//                break;
//            }
//            case LEMONADE: {
//                System.out.println("You choosed coffee." + "it costs: " + drinks.coffeePrice() + "for " + drinks.coffeeCups() + "cups");
//                break;
//            }
//            case MOJITO: {
//                System.out.println("You choosed coffee." + "it costs: " + drinks.coffeePrice() + "for " + drinks.coffeeCups() + "cups");
//                break;
//            }
//            case MINERAL_WATER: {
//                System.out.println("You choosed coffee." + "it costs: " + drinks.coffeePrice() + "for " + drinks.coffeeCups() + "cups");
//                break;
//            }
//            case COCA_COLA: {
//                System.out.println("You choosed coffee." + "it costs: " + drinks.coffeePrice() + "for " + drinks.coffeeCups() + "cups");
//                break;
//            }

            }
        }



