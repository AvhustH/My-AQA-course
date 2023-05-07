package com.course.syntax.Step3;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args){
        System.out.print("Введіть число від 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number==0){
            System.out.println ("Ви ввели " + number);
        }
        else if (number>10){
            System.out.println ("Ви ввели більше 10");
        }
        else {
            System.out.println ("Ви ввели менше 10");
        }
    }
}
