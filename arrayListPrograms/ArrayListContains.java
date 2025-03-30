package arrayListPrograms;

import java.util.ArrayList;

public class ArrayListContains {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        // Checking if "Banana" is in the list
        boolean containsBanana = list.contains("Banana");
        
        // Displaying the result
        System.out.println("Does the list contain 'Banana'? " + containsBanana);
    }
}

