package treeMapPrograms;

import java.util.TreeMap;

public class TreeMapNavigation {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);
        map.put("Elderberry", 5);
        
        // Using navigable methods
        System.out.println("Lowest key: " + map.firstKey());
        System.out.println("Highest key: " + map.lastKey());
        System.out.println("Key lower than 'Cherry': " + map.lowerKey("Cherry"));
        System.out.println("Key higher than 'Cherry': " + map.higherKey("Cherry"));
        System.out.println("Submap from 'Banana' to 'Elderberry': " + map.subMap("Banana", true, "Elderberry", true));
    }
}

