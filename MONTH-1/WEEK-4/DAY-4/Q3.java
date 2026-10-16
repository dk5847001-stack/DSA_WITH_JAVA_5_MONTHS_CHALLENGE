/*
Q3/5 — Polymorphism
Goal: Understand how a parent-class reference can refer to a child-class object and invoke its overridden behavior.
Task: Animal Polymorphism
Build on your previous question:
1. Reuse the Animal class with makeSound().
2. Create Dog and Cat classes that extend Animal.
3. Override makeSound() in both child classes with different sounds.
4. In main(), create these references:
   - Animal a1 = new Dog();
   - Animal a2 = new Cat();
5. Call makeSound() on both references.
*/
class Animal {
    void makeSound() {
        System.out.println("Animal making sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat is mew mew");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.makeSound();
        a2.makeSound();
    }
}
