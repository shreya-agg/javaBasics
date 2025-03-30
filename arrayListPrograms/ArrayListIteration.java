package arrayListPrograms;

import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        // Using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        // Using for-each loop
        System.out.println("Using for-each loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

