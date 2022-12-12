package com.hillel.kryvetska.homework.homework14;

public class Main  {
    public static void main(String[] args) {


        Information Information = new Information ();
        Information.setWeight(96);
        Information.setSteps(3600);
        Information.printAccountInfo();

        Information Information2 = new Information ();
        Information2.printAccountInfo();

        Information Information3 = new Information ();
        Information3.setLastName("Smirnov");
        Information3.setPressure(160);
        Information3.printAccountInfo();

        Information Information4 = new Information ();
        Information4.printAccountInfo();



    }



}
