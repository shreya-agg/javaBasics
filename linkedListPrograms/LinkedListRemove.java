package linkedListPrograms;

import java.util.LinkedList;

public class LinkedListRemove {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        // Removing an element by index
        list.remove(1); // Removes "Banana"
        
        // Removing an element by value
        list.remove("Cherry");
        
        // Displaying elements
        System.out.println("LinkedList after removal: " + list);
    }
}

