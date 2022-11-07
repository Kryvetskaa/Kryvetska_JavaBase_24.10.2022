package com.hillel.kryvetska.homework.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = (int) (Math.random() + 11);

        System.out.println("Guess the number from 0 to 10");

        while (true) {
            if (scanner.hasNextInt()) {
                System.out.println(" ");
                break;
            }  else {
                System.out.println("Wrong data, try again!");
                scanner.nextLine();
            }
        }
        int number1  = scanner.nextInt();
        scanner.nextLine();
        if ( number1 == a) {
                System.out.println("Congratulations!!!!!");
            } else {
            System.out.println("You entered number: " + number1 + "    " + "2 tries left");
            scanner.nextLine();
            }

        while (true) {
            if (scanner.hasNextInt()) {
                System.out.println(" ");
                break;
            }  else {
                System.out.println("Wrong data, try again!");
                scanner.nextLine();
            }
        }

        int number2  = scanner.nextInt();
        scanner.nextLine();
        if ( number2 == a) {
            System.out.println("Congratulations!!!!!");
            scanner.nextLine();
        } else {
            System.out.println("You entered number: " + number1 + "    " + "1 trie left");
            scanner.nextLine();
        }

        while (true) {
            if (scanner.hasNextInt()) {
                System.out.println(" ");
                break;
            }  else {
                System.out.println("Wrong data, try again!");
                scanner.nextLine();
            }
        }
        int number3  = scanner.nextInt();
        scanner.nextLine();
        if ( number3 == a) {
            System.out.println("Congratulations!!!!!");
        } else {
            System.out.println("You entered number: " + number1 + "    " + "0 tries left");
            scanner.nextLine();
        }



//        int number1  = scanner.nextInt();
//        scanner.nextLine();
//            if (number1 == a) {
//                System.out.println("Congratulations!!!!!");
//                break;
//            } else if (number1 != a){
//                System.out.println("You entered number: " + number1 + "    " + "2 tries left");
//            } else {
//                System.out.println("Wrong data, try again!");
//                scanner.nextLine();
//            }

//
//        while (true) {
//            if (scanner.hasNextInt() && number1 == a) {
//                System.out.println("Congratulations!!!!!");
//                break;
//            } else if (number1 != a){
//                System.out.println("You entered number: " + number1 + "    " + "2 tries left");
//            } else {
//                System.out.println("Wrong data, try again!");
//                scanner.nextLine();
//            }
//        }
//        for (;;) {
//            if (scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                System.out.println("You entered number: " + number);
//                break;
//            } else {
//                System.out.println("Wrong data, try again!");
//                scanner.nextLine();
//            }
        }
    }


