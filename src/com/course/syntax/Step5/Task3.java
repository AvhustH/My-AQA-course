package com.course.syntax.Step5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        int[] listOfNumber = {56, 92, 3, 8, 15};
        int biggestNumberFromList = listOfNumber[0];
        int i;
        for (i = 1; i < listOfNumber.length; i++) {
            if (listOfNumber[i] > biggestNumberFromList) {
                biggestNumberFromList = listOfNumber[i];
            }
        }
        System.out.println(biggestNumberFromList);
    }
}

