package com.hillel.kryvetska.homework.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Start start = new Start();
        Start.runApp();
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
                Start.runApp();

            } else {
                System.out.println("please answer - Yes or No");
            }
        }
    }
}



