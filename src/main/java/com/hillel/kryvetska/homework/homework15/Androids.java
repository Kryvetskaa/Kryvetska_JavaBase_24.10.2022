package com.hillel.kryvetska.homework.homework15;

public class Androids implements Smartphones, LinuxOS {

    @Override
    public void call() {
        System.out.println("Call");

    }

    @Override
    public void sms() {
        System.out.println("Sms");
    }

    @Override
    public void internet() {
        System.out.println("Internet");
    }

    @Override
    public void getOperationSystem() {
        System.out.println("I work on LinuxOS");

    }
}

