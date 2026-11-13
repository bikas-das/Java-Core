package com.pkg.test.issues;

class Device {
    void turnOn() {
        System.out.println("Device is turning on...");
    }
}

class Printer extends Device {
    @Override
    void turnOn() {
        System.out.println("Printer is warming up...");
    }
}

class Scanner extends Device {

    @Override
    void turnOn() {
        System.out.println("Scanner lamp is heating up...");
    }
}

//class AllInOneMachine extends Printer, Scanner {
//}
public class DiamondProblem_2 {

    public static void main(String[] args) {
        System.out.println("diamond problem");
    }
}
