package example_hash_map;

import java.util.HashMap;

// Link: https://www.w3schools.com/java/java_hashmap.asp
public class MainClass {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities.get("USA"));
        capitalCities.remove("England"); // xóa phần tử ra khỏi hash map

        // duyệt hash map
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}
