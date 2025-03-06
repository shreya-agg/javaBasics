package treeMapPrograms;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCustomComparator {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // Sorting in descending order
            }
        });

        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        
        // Displaying elements
        System.out.println("TreeMap with custom comparator: " + map);
    }
}

