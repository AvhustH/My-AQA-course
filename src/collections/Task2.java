package collections;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> cartOfUsers = new HashMap<>();
        cartOfUsers.put(1, "Ivan");
        cartOfUsers.put(2, "Petro");
        cartOfUsers.put(3, "Kolya");
        cartOfUsers.put(4, "Vadim");
        cartOfUsers.put(5, "Dan");

        for (Integer k : cartOfUsers.keySet()) {
            if (k % 2 == 0) {
                System.out.println(cartOfUsers.get(k));
            }
        }
    }
}
