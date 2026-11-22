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

    void extraMethod() {
        System.out.println("inside extr method....");
//        draw();
        super.draw();
        System.out.println("call extra...");
    }
}

public class Main_3 {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.draw();
        s = new Square();         //    s.extraMethod() not accessble......
        s.draw();

        Square sq = new Square();
        sq.extraMethod();
    }
}
