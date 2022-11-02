package com.hillel.kryvetska.homework.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the name of the 1st team:");
        String teamName1 = scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 1st player:");
        if (scanner.hasNextInt()) {
            System.out.println(" ");
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        int number1  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 2nd player:");
        if (scanner.hasNextInt()) {
            System.out.println(" ");
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        int number2  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 3d player:");
        if (scanner.hasNextInt()) {
            System.out.println(" ");
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        int number3  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 4th player:");
        if (scanner.hasNextInt()) {
            System.out.println(" ");
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        int number4  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 5th player:");
        if (scanner.hasNextInt()) {
            System.out.println(" ");
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        int number5  = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        System.out.println();

        System.out.println("Please, enter the name of the 2nd team:");
        String teamName2 = scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 1st player:");
        if (scanner.hasNextInt()) {
            System.out.println(" ");
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        int number01  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 2nd player:");
        if (scanner.hasNextInt()) {
            System.out.println(" ");
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        int number02  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 3d player:");
        if (scanner.hasNextInt()) {
            System.out.println(" ");
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        int number03  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 4th player:");
        if (scanner.hasNextInt()) {
            System.out.println(" ");
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        int number04  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 5th player:");
        if (scanner.hasNextInt()) {
            System.out.println(" ");
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        int number05  = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        System.out.println();


        double result1 = ((double) number1 + number2 + number3 + number4 + number5)/5;
        double result2 = ((double) number01 + number02 + number03 + number04 + number05)/5;


        System.out.println("Arithmetic average for" + " " + teamName1 + " " + ":" + " " + result1);
        System.out.println("Arithmetic average for" + " " + teamName2 + " " + ":" + " " + result2);

        double a = result1;
        double b = result2;

        if (a > b) {
            System.out.println("Team " + " " + teamName1 + " " + "has won" + "     " + "it scored" + " " + result1 + " " + "points" );
        } else if (a < b) {
            System.out.println("Team " + teamName2 + " " + "has won" + "     " + "it scored" + " " + result2 + " " + "points" );
        } else if (a == b) {
            System.out.println("Friendship has won");
        }




















    }
}
