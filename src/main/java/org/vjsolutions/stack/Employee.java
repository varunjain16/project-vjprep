package org.vjsolutions.stack;

public class Employee {

    private String first_name;
    private String last_name;
    private int age;

    Employee(String first_name,String last_name, int age){
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public void printEmployee(){
        System.out.println(this.first_name+" "+this.last_name+" "+this.age);
    }
}
