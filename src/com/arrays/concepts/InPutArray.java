package com.arrays.concepts;

import java.util.Arrays;
import java.util.Scanner;

public class InPutArray {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arrSize = scanner.nextInt();

        int arr[] = new int[arrSize];

        int temp=0;

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        int sum=0;
        int avg=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/arr.length;
        System.out.println("SUM IS: "+sum);
        System.out.println("The average of the array is: "+avg);



        scanner.close();
    }
}
