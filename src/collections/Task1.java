package collections;

import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        Set<String> test = new TreeSet<>();
        test.add("Petro");
        test.add("Petro");
        test.add("Ivan");
        test.add("Kolya");
        test.add("Maks");

        System.out.println(test);

    }
}
