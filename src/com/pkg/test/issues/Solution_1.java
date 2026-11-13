package com.pkg.test.issues;

interface NewAnimal{
    default void makeSound(){
    }
}

interface NewDog extends NewAnimal{
    @Override
    default void makeSound() {
        System.out.println("dog is barking");
    }
}


interface NewCat extends NewAnimal{
    @Override
    default void makeSound() {
        System.out.println("cat is mewing");

    }
}

class DogOrCat implements NewDog, NewCat{

    @Override
    public void makeSound() {
        NewCat.super.makeSound();
    }
}

public class Solution_1 {
    public static void main(String[] args) {
        DogOrCat bird = new DogOrCat();
       bird.makeSound();
    }
}
