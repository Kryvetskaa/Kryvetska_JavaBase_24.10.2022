package com.hillel.kryvetska.homework.homework11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter two positive numbers:");

        int n;
        while (true) {
            System.out.println("the 1st one:");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                System.out.println("");
                scanner.nextLine();
                if (n >= 1) {
                    System.out.println("accepted");
                    break;
                } else {
                    System.out.println("You entered negative number, try again");
                }
            } else {
                System.out.println("Wrong data, try again!");
                scanner.nextLine();
            }
        }

        System.out.println();
        System.out.println();

        int m;
        while (true) {
            System.out.println("the 2nd one:");
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                System.out.println("");
                scanner.nextLine();
                if (m >= 1) {
                    System.out.println("accepted");
                    break;
                } else {
                    System.out.println("You entered negative number, try again");
                }
            } else {
                System.out.println("Wrong data, try again!");
                scanner.nextLine();
            }
        }

        int[][] array = new int[n][m];
        int[][] array2 = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("Before:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array[j][i];
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("After:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");

            }
            System.out.println();








        }
    }
}
