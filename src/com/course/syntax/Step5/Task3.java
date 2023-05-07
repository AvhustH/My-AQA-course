package com.course.syntax.Step5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        int[] listOfNumber = {34, 125, 3,126, 7};
        int max = listOfNumber[0];
        int i;
        for (i = 1; i < listOfNumber.length; i++) {
            if (listOfNumber[i] > max) {
                max = listOfNumber[i];
            }
        }
        System.out.println(max);
    }
}

