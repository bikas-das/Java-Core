package com.pkg.runtime.test1;

interface GPS {
    void navigate();
}

interface Radio {
    void playFM();
}

class CarSystem implements GPS, Radio {

    @Override
    public void navigate() {
        System.out.println("navigating to destination");
    }

    @Override
    public void playFM() {
        System.out.println("playing 98.3 fm");
    }
}

public class Main_4 {
    public static void main(String[] args) {

           GPS gps = new CarSystem();
           gps.navigate();

           Radio rad = new CarSystem();
           rad.playFM();
    }
}
