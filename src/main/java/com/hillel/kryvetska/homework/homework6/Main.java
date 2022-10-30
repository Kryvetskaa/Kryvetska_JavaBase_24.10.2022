package com.hillel.kryvetska.homework.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the name of the 1st team:");
        String teamName1 = scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 1st player:");
        int name1  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 2nd player:");
        int name2  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 3d player:");
        int name3  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 4th player:");
        int name4  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 5th player:");
        int name5  = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        System.out.println();

        System.out.println("Please, enter the name of the 2nd team:");
        String teamName2 = scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 1st player:");
        int name01  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 2nd player:");
        int name02  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 3d player:");
        int name03  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 4th player:");
        int name04  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter the number of frags for the 5th player:");
        int name05  = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        System.out.println();


        System.out.println("Arithmetic average for" + " " + teamName1 + ":" + ((double) name1 + name2 + name3 + name4 + name5)/5);
        System.out.println("Arithmetic average for" + " " + teamName2 + ":" + ((double) name01 + name02 + name03 + name04 + name05)/5);








    }
}
