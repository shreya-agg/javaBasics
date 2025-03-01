package hashMapPrograms;

import java.util.HashMap;

public class HashMapUpdate {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        
        // Updating an element
        map.put("Banana", 5); // Banana now maps to 5
        
        // Displaying elements
        System.out.println("HashMap after update: " + map);
    }
}

