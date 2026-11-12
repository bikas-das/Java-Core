package com.pkg.ingeritence.bsics;

//single inheritances
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car honking");
    }
}

public class Test_1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Inherited from Vehicle
        myCar.honk();  // Defined in Car

    }
}
