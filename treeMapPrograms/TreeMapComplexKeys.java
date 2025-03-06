package treeMapPrograms;

import java.util.TreeMap;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age; // Sorting by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class TreeMapComplexKeys {
    public static void main(String[] args) {
        TreeMap<Person, String> map = new TreeMap<>();
        
        map.put(new Person("Alice", 30), "Engineer");
        map.put(new Person("Bob", 25), "Designer");
        map.put(new Person("Charlie", 35), "Manager");
        
        // Displaying elements
        for (Person person : map.keySet()) {
            System.out.println(person + ": " + map.get(person));
        }
    }
}

