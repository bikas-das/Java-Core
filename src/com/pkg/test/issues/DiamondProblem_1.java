package com.pkg.test.issues;

class Animal{
    public void makeSound(){
        System.out.println("Some animal sound");
    }
}

class PetDog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("vow vow");
    }
}


class PetCat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("mew mew");
    }
}


// the multiple extension is restricted here..
// becaause of conflict of same mthod by compiler

//class Bird extends PetDog, PetCat{
//
//}



public class DiamondProblem_1 {
    public static void main(String[] args) {
        System.out.println("diamond problem");
    }
}
