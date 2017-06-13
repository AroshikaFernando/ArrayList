package com.company;

/**
 * Created by Computers on 7/14/2016.
 */
public class Array {

    // creating fields
    private int size;
    private int[] newArray;

    // creating constructor
    public Array(int size) {

        this.size = size;
        newArray = new int[this.size];          //creating array of size
    }

    public Array(){}                            //empty constructor


    //creating add method to get integer
    public void add(int d){

        //try block
        try {
            newArray[this.size] = d;            //check whether if we able to assigning integer to size element
        }catch (Exception e) {                  //if not go to catch block
            int[] tempArr = newArray;           //creating temparray and copy all the elements of newArray to the temparray
            newArray = new int[size + 1];       //then create new array that size is size+1 and assigning it to the newarray
            this.size = this.size + 1;          //increase size by one
            newArray[this.size - 1] = d;        //assigning integer to size-1 element
            for (int i = 0; i < size - 1; i++) {//copy all the other elements to the newArray
                newArray[i] = tempArr[i];
            }
        }

    }


    //creating add method with index number
    public void add(int index , int d){

        //try block
        try {
            int[] tempArr = newArray;           //creating temparray and copy all the elements of newArray to the temparray
            newArray = new int[size + 1];       //then create new array that size is size+1 and assigning it to the newarray
            this.size = this.size + 1;
            newArray[index] = d;

            // copy elements to the newarray without index element
            for (int i = 0; i < index; i++) {
                newArray[i] = tempArr[i];
            }
            for (int i = index + 1; i < size; i++) {
                newArray[i] = tempArr[i-1];
            }

            //catch block for catck exception
        }catch (ArrayIndexOutOfBoundsException exp){
            System.out.println(exp.toString());
        }
    }


    //creating relacee method
    public void replace (int index , int d){

        try {
            newArray[index] = d;
        }catch (ArrayIndexOutOfBoundsException exp){
            System.out.println(exp.toString());
        }

    }


    //get method
    public int get(int index){
        try {
            return newArray[index];
        }catch (ArrayIndexOutOfBoundsException exp){
            System.out.println(exp.toString());
            System.exit(-1);
            return 0;
        }
    }

    //creating remove method
    public void remove(int index){

        try {
            int[] tempArr = new int[size - 1];
            for (int i = 0; i < index; i++) {
                tempArr[i] = newArray[i];
            }

            for (int i = index; i < size - 1; i++) {
                tempArr[i] = newArray[i + 1];
            }
            newArray = tempArr;
            this.size = this.size - 1;

        }catch (ArrayIndexOutOfBoundsException exp){
            System.out.println(exp.toString());
        }
    }


    //isEmpty method
    public boolean isEmpty(){

        if (this.size == 0){
            return true;
        }else{
            return false;
        }
    }

    //size method
    public int size(){

        return this.size;
    }


    //contains method
    public boolean contains(int d){
        int count = 0;

        for (int i = 0; i < size ; i++) {
            if (newArray[i] == d){
                count++;
            }
        }
        if(count>0){
            return true;
        }else
            return false;
    }


    //trimtosize method
    public void trimToSize(int size){

        try {
            int[] tempArr = new int[size];

            for (int i = 0; i < size; i++) {
                tempArr[i] = newArray[i];
            }
            newArray = tempArr;
            this.size = size;
        }catch (ArrayIndexOutOfBoundsException exp){
            System.out.println(exp.toString());
        }

    }

    //clear method
    public void clear(){
        this.size = 0;
    }


    //tostring method
    public String toString(){
        String str = "[";
        for (int i = 0; i < this.size; i++) {
            if(i == this.size-1){
                str = str + newArray[i];
            }else{
                str = str + newArray[i] + ",";
            }
        }

        str = str + "]";
        return str;
    }

}
