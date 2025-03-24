/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceempmanager;

/**
 *
 * @author pc planet
 */
    public class Manager extends Employee { //child class
    String department;

    public Manager(String name, int salary,String department)
    {
        super(name, salary);   //constructor of Employee class
        this.department=department;
    }
    public void display()
    {
        super.displaydetails();
        System.out.println("Department is : "+department);
    }
}

   
