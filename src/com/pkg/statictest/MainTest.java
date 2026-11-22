package com.pkg.statictest;

class Calculate{
    private static int count = 0;

    public void increamentCount(){
        count++;
        System.out.println(count);
    }
}

public class MainTest {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();
        c1.increamentCount();
        c1.increamentCount();
        Calculate c2 = new Calculate();
        c2.increamentCount();
    }

}
