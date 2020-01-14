package org.vjsolutions.stack;

import java.util.EmptyStackException;

public class StackArray{

    private Employee[] stack = null;
    private int top = 0;
    private int size = 0;

    StackArray(int capacity){
        stack = new Employee[capacity];
    }

    public void pushStack(Employee e){
        if(size == stack.length){
            growStack();
        }

        stack[top++] = e;
        size++;
    }

    public Employee popStack() throws EmptyStackException{
        if(top==0){
            throw null;
        }
        Employee e = stack[top-1];
        stack[top-1] = null;
        top--;
        return e;
    }

    public Employee peekStack(){
        if(top<0){
            throw null;
        }

        return stack[top-1];
    }

    private void growStack(){
        if(size == stack.length){

            Employee[] temp = new Employee[2*size];
            System.arraycopy(temp, 0, stack,0, stack.length );
            stack = temp;
        }
    }
}
