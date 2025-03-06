package treeMapPrograms;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapIteration {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        
        // Using for-each loop to iterate through the map
        System.out.println("Iterating through TreeMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

