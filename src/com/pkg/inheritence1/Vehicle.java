package com.pkg.inheritence1;

public class Vehicle {

    private String motorName;
    private boolean isElectric;

    public boolean getElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String getMotorName() {
        return motorName;
    }

    public void setMotorName(String motorName) {
        this.motorName = motorName;
    }
}
