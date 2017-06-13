package com.company;

public class Main {

    public static void main(String[] args) {
	Array intlist = new Array(5);
        intlist.replace(0,0);
        intlist.replace(1,1);
        intlist.replace(2,2);
        intlist.replace(3,3);
        intlist.replace(4,4);

        System.out.println(intlist.get(6));

        intlist.add(6,4);
       System.out.println(intlist.toString());

    }


}
