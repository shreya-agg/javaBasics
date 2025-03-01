package hashMapPrograms;

import java.util.HashMap;

public class HashMapRemove {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        
        // Removing an element by key
        map.remove("Banana");
        
        // Displaying elements
        System.out.println("HashMap after removal: " + map);
    }
}
