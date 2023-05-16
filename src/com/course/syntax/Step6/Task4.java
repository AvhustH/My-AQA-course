package com.course.syntax.Step6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть речення використовуєчи замість пробіла велику букву: ");
        String inputString = sc.nextLine();
        String newString = "";


        int i;
        for (i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputString.toUpperCase().charAt(i)) {
                newString = newString + " " + inputString.charAt(i);
            } else {
                newString = newString + inputString.charAt(i);
            }
        }
        System.out.println(newString);

    }
}


