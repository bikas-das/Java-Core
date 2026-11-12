package com.pkg.ingeritence.bsics;


class Device {
    void powerOn() {
        System.out.println("device powered on...");
    }
}

interface FitnessTracker {
    void trackSteps();
}

interface NotificationAlert {
    void showAlert();
}

class SmartWatch extends Device implements FitnessTracker, NotificationAlert {

    @Override
    public void trackSteps() {
        System.out.println("tracking steps");

    }

    @Override
    public void showAlert() {
        System.out.println("new message received");
    }
}

public class Test_5 {

    public static void main(String[] args) {
        SmartWatch watch = new SmartWatch();
        watch.powerOn();
        watch.trackSteps();
        watch.showAlert();
    }
}
