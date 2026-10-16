/*
Part 2 — Practice Question 1/5
Now it's your turn to code. I'll give you hints rather than the full solution.
Task: Vehicle and Car
Create a Java program with these requirements:
1. Create a parent class Vehicle with a String brand field.
2. Add a start() method that prints the vehicle brand and says that it has started.
3. Create a child class Car that extends Vehicle.
4. Add a drive() method in Car.
5. In main(), create a Car object, assign its brand to "Toyota", and call both start() and drive().
*/
class Vehicle {
    String brand;

    void start() {
        System.out.println(brand);
        System.out.println("it has started.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("I am driving the " + brand + " car.");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";
        c.start();
        c.drive();
    }
}
