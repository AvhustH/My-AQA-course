package com.course.syntax.Step5;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> firstArry = new ArrayList<>();
        firstArry.add(4);
        firstArry.add(2);
        firstArry.add(3);
        firstArry.add(1);
        ArrayList<Integer> newList = new ArrayList<>();
        int max = firstArry.get(0);
        int i;
        int k = 0;

        for (i = 0; i < firstArry.size(); i++) {
            if (firstArry.get(i) > max) {
                max = firstArry.get(i);//8
                k = i;
            }
            if (i == firstArry.size() - 1) {
                newList.add(max);
                firstArry.remove(k);
                if (firstArry.size() == 1) {
                    newList.add(firstArry.get(0));
                    break;
                }
                i = 0;
                k = 0;
                max = firstArry.get(0);
            }

        }
        System.out.println(newList);
    }
}


