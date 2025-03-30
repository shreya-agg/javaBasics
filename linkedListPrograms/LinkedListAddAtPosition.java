package linkedListPrograms;

import java.util.LinkedList;

public class LinkedListAddAtPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        
        // Adding an element at the first position
        list.addFirst("Mango");
        
        // Adding an element at the last position
        list.addLast("Cherry");
        
        // Displaying elements
        System.out.println("LinkedList: " + list);
    }
}

