package treeMapPrograms;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapThreadSafe {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(treeMap);
        
        synchronizedMap.put("Apple", 1);
        synchronizedMap.put("Banana", 2);
        synchronizedMap.put("Cherry", 3);
        
        // Displaying elements
        synchronized(synchronizedMap) {
            for (Map.Entry<String, Integer> entry : synchronizedMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }
}

