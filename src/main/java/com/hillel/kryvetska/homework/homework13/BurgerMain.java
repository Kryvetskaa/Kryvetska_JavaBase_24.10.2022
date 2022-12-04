package com.hillel.kryvetska.homework.homework13;

public class BurgerMain {
    public static void main(String[] args) {

        Burger burger = new Burger ("bun", "meat", "cheese", "greens", "mayonnaise");
        System.out.println(burger.bun);
        System.out.println(burger.meat);
        System.out.println(burger.cheese);
        System.out.println(burger.greens);
        System.out.println(burger.mayonnaise);

        System.out.println();
        System.out.println();

        Burger burger2 = new Burger ("bun", "meat", "cheese", "greens");
        System.out.println(burger.bun);
        System.out.println(burger.meat);
        System.out.println(burger.cheese);
        System.out.println(burger.greens);

        System.out.println();
        System.out.println();

        Burger burger3 = new Burger ();
        System.out.println(burger.bun);
        System.out.println(burger.meat2);
        System.out.println(burger.cheese);
        System.out.println(burger.greens);
        System.out.println(burger.mayonnaise);

    }
}
