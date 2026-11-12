package com.pkg.inheritence_2;

public class ReuseTest1 {
    public static void main(String[] args) {

        Vehicle1 v1 = new Vehicle1();
        v1.setElectric(true);
        v1.setMotorName("Toyota 2JZ");
        System.out.println(v1.getMotorName());
        System.out.println(v1.getElectric());

        System.out.println("_________________________");

        Car1 c1 = new Car1();
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
