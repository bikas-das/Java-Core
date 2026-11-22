package com.pkg.statictest;

class Employee{
    private int id;
    private String name;


     static {
         System.out.println("static is clled....");
     }

     public Employee(){
         System.out.println("defult constr is called....");}

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class StaticTest {
    public static void main(String[] args) {
        Employee emm = new Employee();
        Employee emp = new Employee(2, "Ajay");
        System.out.println(emp.toString());
    }
}
