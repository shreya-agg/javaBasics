package arrayListPrograms;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        // Removing an element by index
        list.remove(1); // Removes "Banana"
        
        // Removing an element by value
        list.remove("Cherry");
        
        // Displaying elements
        System.out.println("ArrayList after removal: " + list);
    }
}

