/*
Q4/5 — Abstraction
Goal: Understand how to define what an object must do without specifying exactly how it does it.
Task: Shape Abstraction
Create an abstract class named Shape with:
- An abstract method calculateArea().
- A concrete method display() that prints "Calculating shape area.".
Then create a Circle class that extends Shape and implements calculateArea() to print the area of a circle using a radius of 5.
In main():
1. Create a Circle object.
2. Call display().
3. Call calculateArea().
*/

abstract class Shape{
    int r;
    double area;
     abstract void calculateArea();
    
    void display(){
        System.out.println("Calculating shape area.");
    }
}
class Circle extends Shape{
     void calculateArea(){
        area = Math.PI * r * r;
        System.out.println(area);
    }
}
public class Abstract {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.r = 5;
        c.display();
        c.calculateArea();
    }
}
