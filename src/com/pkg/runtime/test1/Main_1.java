package com.pkg.runtime.test1;

class Animal{

    void makeSound(){
        System.out.println("generic animal sound");
    }
}

class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Dog barks vow vow..");
    }

    void wagTail(){
        System.out.println("Dog wags tail....");
    }
}
public class Main_1 {

    public static void main(String[] args) {
        Animal myPet = new Dog();
        myPet.makeSound();
    }
}
