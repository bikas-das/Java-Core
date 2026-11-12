package com.pkg.ingeritence.bsics;


// Hierarchical Inheritance

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}
public class Test_3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited
        dog.bark(); // Specific to Dog

        Cat cat = new Cat();
        cat.eat();  // Inherited
        cat.meow(); // Specific to Cat
    }
}
