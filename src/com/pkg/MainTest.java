package com.pkg;

class Emloyee {
    private String empName;
    private int age;
    private long salary;

    public Emloyee() {
        this("bikash");
//        this("bikash", 32, 200000L);
        System.out.println("default constr");
    }

    public Emloyee(String name) {
        this(32);
        System.out.println("constr param 1");
        this.empName = name;
    }

    public Emloyee(int age) {
        this("bikash", 32, 200000L);
        System.out.println("constr param 2");
        this.age = age;
    }

    public Emloyee(String name, int age, long salary) {
        System.out.println("constr param all");
        this.empName = name;
        this.age = age;
        this.salary = salary;

    }


}

public class MainTest {
    public static void main(String[] args) {

        Emloyee emp = new Emloyee();

//        Emloyee emp1 = new Emloyee("bikash");
//        Emloyee emp2 = new Emloyee(32);
//        Emloyee emp3 = new Emloyee("bikash", 32, 200000L);


    }
}
