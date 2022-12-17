package com.hillel.kryvetska.homework.homework15;

public class Main {
    public static void main(String[] args) {

    Androids androids = new Androids();
    System.out.println("Androids");
    androids.getOperationSystem();
    androids.call();
    androids.sms();
    androids.internet();

        System.out.println();
        System.out.println();

    Iphones iphones = new Iphones();
    System.out.println("iPhones");
    iphones.getOperationSystem();
    iphones.call();
    iphones.sms();
    iphones.internet();





    }
}
