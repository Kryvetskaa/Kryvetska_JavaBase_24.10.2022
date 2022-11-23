package com.hillel.kryvetska.homework.homework12;

public class Person {
    public static void main (String[] args) {

        String inf = personInfo("Will", "Smith", "New York", "2936729462846");
        System.out.println(inf);

        String inf2 = personInfo("Jacki", "Chan", "Shanghai", "12312412412");
        System.out.println(inf2);

        String inf3 = personInfo("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(inf3);

    }

    static String personInfo (String name, String lastName, String city, String phoneNumber) {
       String result = "Зателефонувати громадянину " + name + " " + lastName + " із міста " + city + " можна за номером: " + phoneNumber;
        return result;
    }
}
