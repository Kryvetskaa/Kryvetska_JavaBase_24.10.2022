package com.hillel.kryvetska.homework.homework10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array1 = new int[7] ;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }

        int[] array2 = new int[7] ;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(array1);
        System.out.println("Numbers you need to guess: " + Arrays.toString(array1));

        Arrays.sort(array2);
        System.out.println("Numbers you guessed: " + Arrays.toString(array2));

        System.out.println();

        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (array1[i]==array2[i]) {
                System.out.println(i + " " + "element coincided");
                count++;
            }
        }

        System.out.println();

        System.out.println("Number of coincidence: " + count);
















    }
}
