package org.vjsolutions.stack;

public class Main {

    public static void main(String args[]){

        Employee e1 = new Employee("varun","jain",30);
        Employee e2 = new Employee("mani","gupta",30);
        Employee e3 = new Employee("Ansh", "Jain", 1);

        StackArray stackArray = new StackArray(3);

        stackArray.pushStack(e1);
        stackArray.pushStack(e2);
        stackArray.pushStack(e3);

        Employee temp = stackArray.peekStack();
        temp.printEmployee();

        Employee temp1 = stackArray.popStack();
        temp1.printEmployee();

        temp = stackArray.peekStack();
        temp.printEmployee();

        stackArray.pushStack(new Employee("Sunita", "Gupta", 50));
        temp = stackArray.peekStack();
        temp.printEmployee();

    }
}
