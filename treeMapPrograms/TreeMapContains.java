package treeMapPrograms;

import java.util.TreeMap;

public class TreeMapContains {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        
        // Checking if the TreeMap contains a specific key
        boolean containsBanana = map.containsKey("Banana");
        
        // Checking if the TreeMap contains a specific value
        boolean containsValue2 = map.containsValue(2);
        
        // Displaying the results
        System.out.println("Does the TreeMap contain key 'Banana'? " + containsBanana);
        System.out.println("Does the TreeMap contain value '2'? " + containsValue2);
    }
}

