package com.pkg.runtime.test1;

class Computer {

    void boot() {
        System.out.println("booting...");
    }

}

class Lapatop extends Computer {

    void fold() {
        System.out.println("Laptop folded");
    }
}


class GamingLaptop extends Lapatop {

    @Override
    void boot() {
        System.out.println("Gaming Laptop booting with rgb lights....");
    }

    void newBoot(){
        System.out.println("new boot.....");
    }
}

public class Main_2 {
    public static void main(String[] args) {

        Computer comp = new GamingLaptop();
        comp.boot();

        Lapatop lap = new GamingLaptop();
        lap.boot();
        lap.fold();
    }
}