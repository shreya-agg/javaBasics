package treeMapPrograms;

import java.util.TreeMap;

public class TreeMapSort {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Banana", 2);
        map.put("Apple", 1);
        map.put("Cherry", 3);
        
        // Displaying elements (TreeMap is always sorted by keys)
        System.out.println("Sorted TreeMap: " + map);
    }
}
