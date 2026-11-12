package com.pkg.runtime.test1;

class Employee{
    void work(){
        System.out.println("Employee working");
    }
}


interface ManagerRole{
    void conductMeeting();
}

class TeamLead extends Employee implements ManagerRole{

    @Override
    void work() {
        System.out.println("Team Lead Coding and Reviewing");
    }

    @Override
    public void conductMeeting() {
        System.out.println("Team Lead Leadding sprint Meeting");
    }
}
public class Main_5 {
    public static void main(String[] args) {
      Employee emp = new TeamLead();
      emp.work();

      ManagerRole mgr = new TeamLead();
      mgr.conductMeeting();

    }
}
