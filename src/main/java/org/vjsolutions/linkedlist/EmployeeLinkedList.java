package org.vjsolutions.linkedlist;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insertAtFront(Employee employee){

        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeNode(){

        if(isEmpty()){
            return null;
        }
        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    private boolean isEmpty(){
        return head==null;
    }

    public void printLinkedList(){
        EmployeeNode current = head;
        while(current!=null){
            System.out.print(current);
            System.out.print("->");
            current = current.getNext();
        }
        System.out.print("null\n");
    }
}
