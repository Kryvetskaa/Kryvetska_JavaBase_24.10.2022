package com.hillel.kryvetska.homework.homework14;

import java.util.Scanner;

public class Information {

        Scanner scanner = new Scanner(System.in);
        private String firstName = firstName(scanner);
        private String lastName = lastName(scanner);
        private int day = day(scanner);
        private int month = month(scanner);
        private int year = year(scanner);
        private String email = email(scanner);
        private int number = number(scanner);
        private int weight = weight(scanner);
        private int pressure = pressure(scanner);
        private int steps = steps(scanner);
        private int age = age();



        public void printAccountInfo() {
//                Information Information = new Information();
//                String firstName = Information.getFirstName();
                System.out.println("First name: " + firstName);
                System.out.println("Last name: " + lastName);
                System.out.println("Birth day: " + day);
                System.out.println("Birth month: " + month);
                System.out.println("Birth year: " + year);
                System.out.println("Age: " + age);
                System.out.println("Email: " + email);
                System.out.println("Phone number: " + number);
                System.out.println("Weight: " + weight);
                System.out.println("Blood pressure: " + pressure);
                System.out.println("Number of steps: " + steps);



        }

        public Information () {
                this.firstName = getFirstName();
                this.lastName = getLastName();
                this.day = getDay();
                this.month = getMonth();
                this.year = getYear();
                this.email = getEmail();
                this.number = getNumber();
                this.weight = getWeight();
                this.pressure = getPressure();
                this.steps = getSteps();
        }

        public Information (String firstName, String lastName,
                            int day, int month, int year,
                            String email, int number, int weight,
                            int pressure, int steps, int age) {
                this.firstName = firstName(scanner);
                this.lastName = lastName(scanner);
                this.day = day(scanner);
                this.month = month(scanner);
                this.year = year(scanner);
                this.email = email(scanner);
                this.number = number(scanner);
                this.weight = weight(scanner);
                this.pressure = pressure(scanner);
                this.steps = steps(scanner);
                this.age = getAge();

        }

        public String getFirstName(){
                return this.firstName;
        }
//        public void setFirstName (String name){
//                this.firstName = firstName;
//        }
        static String firstName (Scanner scanner) {
                String firstName;
                System.out.println("Please enter your first name");
                while (true) {
                        if (scanner.hasNextLine()) {
                                firstName = scanner.nextLine();
                                return firstName;

                        } else {
                                System.out.println("Wrong data, try again");
                                scanner.nextLine();
                        }
                }
        }

        public String getLastName(){
                return this.lastName;
        }
        public void setLastName (String name){
                this.lastName = lastName;
        }

        static String lastName (Scanner scanner) {
                String lastName;
                System.out.println("Please enter your last name");
                while (true) {
                        if (scanner.hasNextLine()) {
                                lastName = scanner.nextLine();
                                return lastName ;
                        } else {
                                System.out.println("Wrong data, try again");
                                scanner.nextLine();
                        }
                }
        }

        public int getDay(){
                return this.day;
        }
//        public void setDay (){
//                this.day = day;
//        }
        static int day (Scanner scanner) {
                int day = 0;
                System.out.println("Please enter your birth day");
                while (true) {
                        if (scanner.hasNextInt()) {
                                day = scanner.nextInt();
                                if (day < 0) {
                                        System.out.println("Please enter positive number");
                                } else {
                                        break;
                                }
                                scanner.nextLine();
                        } else {
                                System.out.println("Wrong data, try again");
                                scanner.nextLine();
                        }
                }
                return day;
        }

        public int getMonth(){
                return this.month;
        }
//        public void setMonth (){
//                this.month = month;
//        }
        static int month (Scanner scanner) {
                int month = 0;
                System.out.println("Please enter your birth month");
                while (true) {
                        if (scanner.hasNextInt()) {
                                month = scanner.nextInt();
                                if (month < 0) {
                                        System.out.println("Please enter positive number");
                                } else {
                                        break;
                                }
                                scanner.nextLine();
                        } else {
                                System.out.println("Wrong data, try again");
                                scanner.nextLine();
                        }
                }
                return month;
        }

        public int getYear(){
                return this.year;
        }
//        public void setYear (){
//                this.year = year;
//        }
        static int year (Scanner scanner) {
                int year = 0;
                System.out.println("Please enter your birth year");
                while (true) {
                        if (scanner.hasNextInt()) {
                                year = scanner.nextInt();
                                if (year < 0) {
                                        System.out.println("Please enter positive number");
                                } else {
                                        break;
                                }
                                scanner.nextLine();
                        } else {
                                System.out.println("Wrong data, try again");
                                scanner.nextLine();
                        }
                } scanner.nextLine();
                return year;

        }

        public int getAge(){
                return this.age;
        }
//        public void setAge (){
//                this.age = age;
//        }
        int age() {
                int age = 2020 - year;
                return age;
        }

        public String getEmail(){
                return this.email;
        }
//        public void setEmail (String name){
//                this.email = email;
//        }
        static String email (Scanner scanner) {
                String email;
                System.out.println("Please enter your email");
                while (true) {
                        if (scanner.hasNextLine()) {
                                email = scanner.nextLine();
                                return email ;
                        } else {
                                System.out.println("Wrong data, try again");
                                scanner.nextLine();
                        }
                }
        }

        public int getNumber(){
                return this.number;
        }
//        public void setNumber (){
//                this.number = number;
//        }
        static int number (Scanner scanner) {
                int number = 0;
                System.out.println("Please enter your phone number");
                while (true) {
                        if (scanner.hasNextInt()) {
                                number = scanner.nextInt();
                                if (number < 0) {
                                        System.out.println("Please enter positive number");
                                } else {
                                        break;
                                }
                                scanner.nextLine();
                        } else {
                                System.out.println("Wrong data, try again");
                                scanner.nextLine();
                        }
                }
                return number;
        }
        public int getWeight(){
                return this.weight;
        }
        public void setWeight (int weight){
                this.weight = weight;
        }
        static int weight(Scanner scanner) {
                int weight = 0;
                System.out.println("Please enter your weight");
                while (true) {
                        if (scanner.hasNextInt()) {
                                weight = scanner.nextInt();
                                if (weight < 0) {
                                        System.out.println("Please enter positive number");
                                } else {
                                        break;
                                }
                                scanner.nextLine();
                        } else {
                                System.out.println("Wrong data, try again");
                                scanner.nextLine();
                        }
                }
                return weight;
        }
        public int getPressure(){
                return this.pressure;
        }
        public void setPressure (int pressure){
                this.pressure = pressure;
        }
        static int pressure(Scanner scanner) {
                int pressure = 0;
                System.out.println("Please enter your blood pressure");
                while (true) {
                        if (scanner.hasNextInt()) {
                                pressure = scanner.nextInt();
                                if (pressure < 0) {
                                        System.out.println("Please enter positive number");
                                } else {
                                        break;
                                }
                                scanner.nextLine();
                        } else {
                                System.out.println("Wrong data, try again");
                                scanner.nextLine();
                        }
                }
                return pressure;
        }

        public int getSteps(){
                return this.steps;
        }
        public void setSteps (int steps){
                this.steps = steps;
        }
        static int steps(Scanner scanner) {
                int steps = 0;
                System.out.println("Please enter the number of steps");
                while (true) {
                        if (scanner.hasNextInt()) {
                                steps = scanner.nextInt();
                                if (steps < 0) {
                                        System.out.println("Please enter positive number");
                                } else {
                                        break;
                                }
                                scanner.nextLine();
                        } else {
                                System.out.println("Wrong data, try again");
                                scanner.nextLine();
                        }
                }
                return steps;
        }


}
