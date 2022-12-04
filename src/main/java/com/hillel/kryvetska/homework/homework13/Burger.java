package com.hillel.kryvetska.homework.homework13;

public class Burger {

    String bun;
    String meat;

    String meat2 = "double meat";
    String cheese;
    String greens;
    String mayonnaise;

    public Burger (String bun, String meat, String cheese, String greens, String mayonnaise) {
        System.out.println("regular burger:");
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

    }

    public Burger(String bun, String meat, String cheese, String greens) {
        System.out.println("diet burger:");
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

    }
    public Burger () {
        System.out.println("super burger:");
        String bun;
        String meat2;
//        if (meat == null) {
//            System.out.println("double meat");
//        }
        String cheese;
        String greens;
        String mayonnaise;
    }
    }


