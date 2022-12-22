package com.hillel.kryvetska.homework.homework17;

import java.util.Arrays;
import java.util.Scanner;

import static com.hillel.kryvetska.homework.homework17.Drinks.*;

public class Main {
    public static void main(String[] args) {
        Start start = new Start();
        Start.runApp();
        Scanner scanner = new Scanner(System.in);
        boolean moreDrinks = true;
        while (moreDrinks) {
            System.out.println("Do you want something else? Yes/No");
            String answer = scanner.nextLine();
            if (answer.equals("NO") || answer.equals("No") || answer.equals("no")) {
                moreDrinks = false;
                //                System.out.println(totalSum);
            } else if (answer.equals("YES") || answer.equals("Yes") || answer.equals("yes")) {
                Start.runApp();

            } else {
                System.out.println("please answer - Yes or No");
            }
        }
    }
}



