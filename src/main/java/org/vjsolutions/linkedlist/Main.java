package org.vjsolutions.linkedlist;

import org.vjsolutions.linkedlist.Employee;

public class Main {

    public static void main(String[] args){

        Employee e1 = new Employee("varun","jain",30);
        Employee e2 = new Employee("mani","gupta",30);
        Employee e3 = new Employee("Ansh", "Jain", 1);

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.insertAtFront(e1);
        list.insertAtFront(e2);
        list.insertAtFront(e3);
        System.out.println(list.getSize());
        list.printLinkedList();

        list.removeNode();
        System.out.println(list.getSize());
        list.printLinkedList();

    }
}
