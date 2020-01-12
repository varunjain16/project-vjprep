package org.vjsolutions.prep;

public class DynamicArrayImplementation {

    private int[] array;
    private int count;
    private int size;

    DynamicArrayImplementation(){
        count=0;
        size=1;
        array = new int[1];
    }

    private void growSize(){


        int[] temp = null;
            System.out.println("Growing size of an array");
            temp = new int[size*2];
            for(int i=0; i<size ; i++){
                temp[i] = array[i];
            }

            array = temp;

            size = size*2;

    }

    private void addElement(int value){

        if(count+1==size){
            growSize();
        }
        array[count] = value;
        count++;
    }

    private void addElementAt(int index, int value){

        if(count+1==size){
            growSize();
        }

        for(int i=count-1; i>=index;i--) {

            array[i + 1] = array[i];
        }

        array[index] = value;
        count = count+1;
    }

    private void removeElement(){


        if(count>0){
            array[count-1]=0;
            count--;
        }
    }

    private void removeElementAt(int index){

        if(count>0) {
            for (int i = index; i <= count - 1; i++) {
                array[i] = array[i + 1];
            }
            array[count-1]=0;
            count = count - 1;
        }
    }

    public void printArray(){

        System.out.println("Array value is ------");
        for(int i = 0; i<count;i++){
            System.out.print(array[i]+",");
        }
        System.out.println("\n");

    }

    public static void main(String[] args){

        DynamicArrayImplementation da = new DynamicArrayImplementation();

        da.addElement(11);
        da.addElement(22);
        da.addElement(33);
        da.addElement(44);
        da.addElement(55);
        da.addElement(66);
        da.addElement(77);
        da.addElement(88);

        da.printArray();

        da.removeElement();

        da.printArray();

        da.addElementAt(3,43);
        da.printArray();

        da.removeElementAt(3);
        da.printArray();

        da.addElementAt(2,23);
        da.printArray();

        da.removeElement();
        da.removeElementAt(4);
        da.printArray();

    }
}
