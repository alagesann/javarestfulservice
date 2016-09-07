package com.javarestful;
/**
 * Created by apalani on 6/19/16.
 */
public class Employee {
    String Name;
    int EmpId;
    public Employee(String name, int empId){
        this.Name=name;
        this.EmpId=empId;
    }
    public void display()
    {
        System.out.println("Name: "+this.Name);
        System.out.println("EmpId: "+this.EmpId);
    }
    public void display2()
    {
        System.out.println("display2");
    }
    public void display3()
    {
        System.out.println("display3");
    }
}
