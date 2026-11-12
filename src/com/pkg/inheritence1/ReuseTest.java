package com.pkg.inheritence1;

public class ReuseTest {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.setElectric(true);
        v1.setMotorName("Toyota 2JZ");
        System.out.println(v1.getMotorName());
        System.out.println(v1.getElectric());

        System.out.println("_________________________");

        Car c1 = new Car();
        var motorName = c1.getMotorName();
        var isElectric = c1.getElectric();

        System.out.println(motorName);
        System.out.println(isElectric);

        System.out.println("_________________________");

        c1.setMotorName("Honda VTEC");
        c1.setElectric(true);
        System.out.println(c1.getMotorName());
        System.out.println(c1.getElectric());


    }
}
