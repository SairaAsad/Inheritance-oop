/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceempmanager;

/**
 *
 * @author pc planet
 */ 
   public class Employee //parent class
   {
   private String name;
   private int salary;
    
   public Employee(String name, int salary){
       this.name=name;
       this.salary=salary;
    }
    public void displaydetails(){
        System.out.println(name+" has salary: "+salary);
    }
}
