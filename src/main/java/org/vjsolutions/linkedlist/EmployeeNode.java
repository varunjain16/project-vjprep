package org.vjsolutions.linkedlist;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    EmployeeNode(Employee employee){
        this.employee = employee;
    }

    public String toString(){
        return employee.toString();
    }
}
