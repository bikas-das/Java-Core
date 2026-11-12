package com.pkg.runtime.test1;


class Shape {

    void draw() {
        System.out.println("Drawing a Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Squre");
    }
}

public class Main_3 {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.draw();
        s = new Square();
        s.draw();
    }
}
