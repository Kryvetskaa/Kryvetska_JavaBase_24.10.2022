package com.hillel.kryvetska.homework.homework5;public class Main {
    public static void main(String[] args) {

        int liWarrior = 13;
        int liBowman = 24;
        int liRider = 46;
        int numberOfLi1Type = 860;

        int minWarrior = 9;
        int minBowman = 35;
        int minRider = 12;

        int numberOfMin1Type = (int) (numberOfLi1Type * 1.5);

        int generalIndicatorOfLi = (numberOfLi1Type * liWarrior) + (numberOfLi1Type * liBowman) + (numberOfLi1Type * liRider);
        int generalIndicatorOfMin = (numberOfMin1Type * minWarrior) + (numberOfMin1Type * minBowman) + (numberOfMin1Type + minRider);
        int general = generalIndicatorOfLi + generalIndicatorOfMin;

        System.out.println("Загальний показник атаки Лі = " + generalIndicatorOfLi);
        System.out.println("Загальний показник атаки Мінь = " + generalIndicatorOfMin);
        System.out.println("Загальний показник атаки обох династій = " + general);
    }
}

