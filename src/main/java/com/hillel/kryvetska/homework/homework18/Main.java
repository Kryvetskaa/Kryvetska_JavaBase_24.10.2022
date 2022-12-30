package com.hillel.kryvetska.homework.homework18;

public class Main {

    private static double average1 = 0;
    int m;
    int n;
    private int[][] array = new int[n][m];

    public static double averageArray(int[] array) {
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;
        }
        return average;
    }


    public static boolean squareArray(int[][] array, int m, int n){
    if (n==m){
        return true;
    }
        return false;
    }
}



