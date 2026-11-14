package com.arrays.concepts;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String args[])
    {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");



        LinkedList<String> ll=new LinkedList<>();
        ll.add("PK");
        ll.add("CK");
        ll.add("MK");
        ll.add(1,"S1");
        ll.add(0,"SL1");
        ll.addAll(0,arrayList);


        for(String s:ll)
        {
            System.out.print(s+" ");
        }


        System.out.println();

        System.out.println(ll);


    }
}
