package com.course.syntax.Step2;

public class Task1 {
    public static void main (String[] args){
        double a = 3.30;
        double b = 3.30;
        double c = 3.30;
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(s);
    }
}
