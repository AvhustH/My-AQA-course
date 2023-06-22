package com.course.syntax.Step5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] test = {3, 6, 21};
//        float sum1 = Arrays.stream(test).sum();
        float length = test.length;
//        float calculateAverageValue = sum1 / length;
//        System.out.println(calculateAverageValue);

        int a;
        float sum2 = 0;
        for (a = 0; a < length; a++) {
            sum2 = test[a] + sum2;
        }
        float calculateAverageValue = sum2 / length;
        System.out.println(calculateAverageValue);
    }
}

