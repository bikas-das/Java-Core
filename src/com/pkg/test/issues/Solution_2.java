package com.pkg.test.issues;

interface NewDevice{
    default void turnOn(){
        System.out.println("device is turning on....");
    }
}

interface NewPrinter extends NewDevice{
    @Override
    default void turnOn() {
        System.out.println("turn on the printer");
    }
}

interface NewScaanner extends NewDevice{
    @Override
    default void turnOn() {
        System.out.println("turn on the scanner");
    }
}

class AlInOneDevice implements NewPrinter, NewScaanner{
    @Override
    public void turnOn() {
        NewScaanner.super.turnOn();
    }
}


public class Solution_2 {
    public static void main(String[] args) {
       AlInOneDevice device = new AlInOneDevice();
       device.turnOn();
    }
}
