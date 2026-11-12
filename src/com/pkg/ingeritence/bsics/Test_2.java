package com.pkg.ingeritence.bsics;

//multi levels inheritance

class Vehicles {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Cars extends Vehicle {
    void drive() {
        System.out.println("Car driving");
    }
}

class ElectricCars extends Cars {
    void charge() {
        System.out.println("Battery charging");
    }
}

public class Test_2 {
    public static void main(String[] args) {
        ElectricCars tesla = new ElectricCars();
        tesla.start();  // From Vehicle
        tesla.drive();  // From Car
        tesla.charge(); // From ElectricCar
    }
}
