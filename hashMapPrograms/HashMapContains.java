package hashMapPrograms;

import java.util.HashMap;

public class HashMapContains {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        
        // Checking if the HashMap contains a specific key
        boolean containsBanana = map.containsKey("Banana");
        
        // Checking if the HashMap contains a specific value
        boolean containsValue2 = map.containsValue(2);
        
        // Displaying the results
        System.out.println("Does the HashMap contain key 'Banana'? " + containsBanana);
        System.out.println("Does the HashMap contain value '2'? " + containsValue2);
    }
}

