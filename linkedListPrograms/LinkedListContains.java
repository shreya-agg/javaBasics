package linkedListPrograms;

import java.util.LinkedList;

public class LinkedListContains {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        // Checking if "Banana" is in the list
        boolean containsBanana = list.contains("Banana");
        
        // Displaying the result
        System.out.println("Does the list contain 'Banana'? " + containsBanana);
    }
}

