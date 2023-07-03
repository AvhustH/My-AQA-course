package collections;

import java.util.*;

public class Task4 {
    public static Map<String, String> sortValuesFromLists(List<String> key, List<String> value) {
        Map<String, String> test = new TreeMap<>();
        int i;
        for (i = 0; i < key.size(); i++) {
            if (key.get(i).length() > 3) {
                test.put(String.valueOf(key.get(i).substring(0, 3)), value.get(i));
            } else {
                test.put(key.get(i), value.get(i));
            }
        }
        return test;
    }

    public static Map<String, String> sortValues(Map<String, String> test1) {
        Map<String, String> testMap = new TreeMap<>();
        for (Map.Entry<String, String> entry : test1.entrySet()) {
            if (entry.getKey().length() > 3) {
                testMap.put(entry.getKey().substring(0, 3), entry.getValue());
            } else {
                testMap.put(entry.getKey(), entry.getValue());
            }
        }
        return testMap;
    }


    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("12345", "aqwer");
        myMap.put("22345", "cqwer");
        myMap.put("32345", "bqwer");
        myMap.put("6", "tqwer");
        System.out.println(sortValues(myMap));


//        List<String> value = new ArrayList<>();
//        value.add("z");
//        value.add("a");
//        value.add("b");
//        List<String> kay = new ArrayList<>();
//        kay.add("19");
//        kay.add("23478");
//        kay.add("1");
//        System.out.println(sortValues(kay,value));
    }
}
