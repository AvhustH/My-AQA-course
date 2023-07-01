package com.course.syntax.Step5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add(1);
        a.add(2);
        ArrayList b = new ArrayList<>();
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        for (Object i : b
        ) {
            a.add(i);
        }
        System.out.println(a);

//        int[] mergeTwoArrays = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
//                .toArray();
//       System.out.println(Arrays.toString(mergeTwoArrays));
    }
}

