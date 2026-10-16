/*
Q2/5 — Method Overriding
Goal: Learn how a child class can provide its own implementation of an inherited method.
Task: Animal and Dog
Create a Java program with these requirements:
1. Create a parent class Animal with a method makeSound() that prints a generic animal sound.
2. Create a child class Dog that extends Animal.
3. Override makeSound() in Dog to print a dog-specific sound.
4. Use the @Override annotation above the child method.
5. In main(), create an Animal object and a Dog object, then call makeSound() on both.
*/
class Animal{
    void makeSound(){
        System.out.println("Animal is crying.");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog is barking.");
    }
}
public class Q2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.makeSound();
        d.makeSound();
    }
}
