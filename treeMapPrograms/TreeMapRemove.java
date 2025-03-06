package treeMapPrograms;

import java.util.TreeMap;

public class TreeMapRemove {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        
        // Removing an element by key
        map.remove("Banana");
        
        // Displaying elements
        System.out.println("TreeMap after removal: " + map);
    }
}

