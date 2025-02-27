package abstractClasses;

//Abstract class Animal
abstract class Animal {
 String name;

 public Animal(String name) {
     this.name = name;
 }

 // Abstract method
 abstract void makeSound();

 public String getName() {
     return name;
 }
}

//Concrete class Dog
class Dog extends Animal {
 public Dog(String name) {
     super(name);
 }

 @Override
 void makeSound() {
     System.out.println(name + " says: Woof Woof");
 }
}

//Main class
public class Animals {
 public static void main(String[] args) {
     Dog dog = new Dog("Buddy");
     System.out.println("Animal: " + dog.getName());
     dog.makeSound();
 }
}
