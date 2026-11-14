package com.arrays.concepts;

public class PrintSumOfArray {

    public static void main(String args[])
    {

        int arr[]={2,5,3,9,6};
        int sum=0;
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            count=count+1;
        }

        System.out.println(sum);

        int avg=sum/count;
        System.out.println("AVG: "+avg);

        System.out.println(count);



    }
}
