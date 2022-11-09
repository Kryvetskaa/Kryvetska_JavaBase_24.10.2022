package com.hillel.kryvetska.homework.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = (int) ( Math.random() * 11 );

        int i = 2;

        while ( i > -1) {
            if (scanner.hasNextInt()) {
                System.out.println(" ");
                int number = scanner.nextInt();
                if (number == a) {
                    System.out.println("Congratulations!!!!!!");
                    break;
                } else {
                    System.out.println("you entered:" + " " + number + "    " + i + " " + "tries left");
                    scanner.nextLine();
                } if (i == 0 && number != a) {
                    System.out.println("Game over... You lose");
                }
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
                continue;
            }
            i--;
        }














        }
    }

