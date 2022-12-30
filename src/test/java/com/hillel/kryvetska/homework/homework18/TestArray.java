package com.hillel.kryvetska.homework.homework18;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestArray {
    static int[] array;
    static int[] [] array2;


    @Test
    public void test1() {
        array = new int[] {1, 2, 3, 4, 5};
        double average = Main.averageArray(array);
        assertEquals(3, average);
    }


    @Test
    public void test2() {
        boolean squareArray1 = Main.squareArray(array2, 5, 5);
        assertEquals(true, squareArray1);
        }
    }


