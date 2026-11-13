package com.pkg.composition;

class Parent {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}

class Child extends Parent {
    private Parent parent;

    public Child(Parent parent) {
        this.parent = parent;
    }

    @Override
    public String getMessage() {
        return this.parent.getMessage();
    }

    public String getThatData() {
        return this.parent.getMessage();

    }

}

public class CompositionTest {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.setMessage("hi from parent...");

        Child c1 = new Child(p1);
//        System.out.println(c1.getMessage());
        var res = c1.getThatData();
        System.out.println(res);

    }
}

