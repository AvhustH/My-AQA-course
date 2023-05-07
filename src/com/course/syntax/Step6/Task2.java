package com.course.syntax.Step6;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

 int [] test = {10,15,10,100};
 float sum = Arrays.stream(test).sum();
 float length = test.length;
 float result = sum/length;
 System.out.println(result);
    }
}

