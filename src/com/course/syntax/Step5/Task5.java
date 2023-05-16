package com.course.syntax.Step5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] list = {11, 3, 7, 1, 25};

        boolean isSorted = false;
        int bufer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    isSorted = false;

                    bufer = list[i]; //11
                    list[i] = list[i + 1]; //3
                    list[i + 1] = bufer; //11
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}


