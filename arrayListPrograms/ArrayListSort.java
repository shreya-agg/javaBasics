package arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        
        // Sorting the ArrayList
        Collections.sort(list);
        
        // Displaying sorted elements
        System.out.println("Sorted ArrayList: " + list);
    }
}
