package com.course.syntax.Step4;

import java.util.Scanner;

public class Task2 {
    public static int calculateFactorial() {
        System.out.print("Введіть число для визначення факторіала : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int result = 1;
        for (int x = 1; x <= number; x++) {
            result = result * x;
        }
        System.out.print("Факториал " + number + " = ");
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial());
    }
}

