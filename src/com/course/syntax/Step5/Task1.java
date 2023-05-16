package com.course.syntax.Step5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] test = {3, 6, 21};
        float sum = Arrays.stream(test).sum();
        float length = test.length;
        float calculateAverageValue = sum / length;
        System.out.println(calculateAverageValue);
    }
}

