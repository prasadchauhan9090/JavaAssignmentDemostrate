package com.arrays.concepts;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

    public static void main(String args[])
    {

       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the size of the array: ");
       int sizeArr=scanner.nextInt();

       String arr[] =new String[sizeArr];
       scanner.nextLine();

       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<sizeArr;i++)
       {
           arr[i]= scanner.nextLine();
       }
       System.out.println(Arrays.toString(arr));



    }
}
