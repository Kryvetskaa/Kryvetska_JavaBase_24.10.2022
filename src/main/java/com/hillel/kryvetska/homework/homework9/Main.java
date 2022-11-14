package com.hillel.kryvetska.homework.homework9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * 22 + 18);
        }

        System.out.println("age of the 1st team" + " "+ Arrays.toString(team1));

        int result1 = 0;

        for (int i : team1) {
            result1 += i;
        }
        System.out.println("Average age = " + " " + result1 / team1.length);

        int[] team2 = new int[25];
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) (Math.random() * 22 + 18);
        }

        System.out.println("age of the 2nd team" + " "+ Arrays.toString(team2));

        int result2 = 0;

        for (int i : team2) {
            result2 += i;
        }
        System.out.println("Average age = " + " " + result2 / team2.length);























    }
}
