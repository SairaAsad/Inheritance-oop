/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritanceempmanager;

/**
 *
 * @author pc planet
 */
public class InheritanceEmpManager { //Main class

    public static void main(String[] args) {
        //parent class 
        System.out.println("Employee : ");   
       Employee e=new Employee("Zain",90000);
       e.displaydetails();  //employee class method
       System.out.println();
       
       //child class
       System.out.println("Manager : ");
       Manager m = new Manager("Tehreem", 100000, "Information Techology");
       m.display();   //manager class method.
    }
}
  
