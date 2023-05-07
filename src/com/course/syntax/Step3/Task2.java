package com.course.syntax.Step3;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args){
        System.out.print("Введіть ціле число від 1 до 100 ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int remainder = number%2;
        if (remainder==0){
            System.out.println (number + " це парне число");
        }
        else {
            System.out.println (number + " це НЕ парне число");
        }
    }
}
