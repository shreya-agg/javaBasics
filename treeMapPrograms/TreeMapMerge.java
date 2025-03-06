package treeMapPrograms;

import java.util.TreeMap;

public class TreeMapMerge {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        
        // Merging values
        map.merge("Banana", 2, (oldValue, newValue) -> oldValue + newValue);
        map.merge("Date", 4, (oldValue, newValue) -> oldValue + newValue);
        
        // Displaying elements
        System.out.println("TreeMap after merging: " + map);
    }
}
