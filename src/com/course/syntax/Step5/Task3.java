package com.course.syntax.Step5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        int[] listOfNumber = {56, 92, 3, 8, 15};
        int biggestNumberFromList = listOfNumber[0];

        for (Integer i : listOfNumber) {
            if (i > biggestNumberFromList) {
                biggestNumberFromList = i;
            }
        }
        System.out.println(biggestNumberFromList);
    }
}

