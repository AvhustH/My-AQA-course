package collections;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Set<String> names1 = new HashSet<>();
        names1.add("Olya");
        names1.add("Natasha");
        names1.add("Polina");
        names1.add("Vlad ");

        List<String> names2 = new ArrayList<>();
        names2.add("Bohdan");
        names2.add("Oleksandr");
        names2.add("Vlad");
        names2.add("Natasha");

        names2.addAll(names1);
        System.out.println(names2);
    }
}
