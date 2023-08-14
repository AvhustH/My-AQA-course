package com.course.syntax.Step5;

public class Task1 {
    public static void main(String[] args) {
        int[] test = {3, 6, 21};
        float sum2 = 0;
        for (int a = 0; a < test.length; a++) {
            sum2 = test[a] + sum2;
        }
        float calculateAverageValue = sum2 / test.length;
        System.out.println(calculateAverageValue);
    }
}

