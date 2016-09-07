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
    public void display1()
    {
        System.out.println("display1");
    }
    public void display2()
    {
        System.out.println("display2");
    }
    public void display4()
    {
        System.out.println("display4");
    }
    public void display100()
    {
        System.out.println("display100");
    }
}
