package com.arrays.concepts;

public class MergeArray {

    public static void main(String args[])
    {

        String str[]={"chai","coffee"};
        String str1[]={"milk","water","coke"};

        String st1="";
        String st2="";

        for(int i=0;i<str.length;i++)
        {
            //System.out.print(str[i]+" ");
            st1=st1+str[i];
        }
        for(int j=0;j<str1.length;j++)
        {
            st2=st2+str1[j];
        }

        System.out.println(st1+st2);
    }
}
