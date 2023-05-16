package com.course.syntax.Step5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 7, 7, 7, 7, 7, 7, 7, 7};
        int[] b = {4, 5, 6};
        int[] mergeTwoArrays = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .toArray();
        System.out.println(Arrays.toString(mergeTwoArrays));
    }
}

