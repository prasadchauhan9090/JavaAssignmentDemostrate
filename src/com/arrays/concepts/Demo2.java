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
           arr[i]= scanner.next();
       }
        System.out.println("Enter the size of the array: ");
        int sizeArr2=scanner.nextInt();

        String arr2[] =new String[sizeArr2];
        scanner.nextLine();

        System.out.println("Enter the elements of the array2: ");
        for(int i=0;i<sizeArr2;i++)
        {
            arr2[i]= scanner.next();
        }


        System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(arr2));


       String arr3[]=new String[arr.length + arr2.length];
       for(int i=0;i<arr.length;i++)
       {
           arr3[i]=arr[i];
       }
       for(int i=0;i<arr2.length;i++)
       {
           arr3[i+arr.length] = arr2[i];
       }

       System.out.println(Arrays.toString(arr3));

       scanner.close();

    }
}
