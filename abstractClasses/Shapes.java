package abstractClasses;

//Abstract class Shape
abstract class Shape {
 String color;

 // Abstract method
 abstract double area();

 // Concrete method
 public String getColor() {
     return color;
 }

 public void setColor(String color) {
     this.color = color;
 }
}

//Concrete class Circle
class Circle extends Shape {
 double radius;

 public Circle(double radius, String color) {
     this.radius = radius;
     this.color = color;
 }

 @Override
 double area() {
     return Math.PI * radius * radius;
 }
}

//Main class
public class Shapes {
 public static void main(String[] args) {
     Circle circle = new Circle(5.0, "red");
     System.out.println("Color: " + circle.getColor());
     System.out.println("Area: " + circle.area());
 }
}
