package com.course.syntax.Step6;

public class Task1 {
    public static void main(String[] args) {

        String testText = "Text1 test2 text3";
        String withoutSpase = testText.replace(" ", "");
        String toUpper = withoutSpase.toUpperCase();
        for (char k : toUpper.toCharArray()) {
            System.out.println(k);
        }
    }
}

