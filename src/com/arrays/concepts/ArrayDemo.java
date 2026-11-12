package com.arrays.concepts;

public class ArrayDemo {

    public static void main(String args[])
    {

        int arr[]={1,2,3,4,5,6,8,9,0,12};
        int arr1=arr[0];

        for(int i=0;i<arr.length;i++) {

            if (arr[i] > arr1) {
                arr1 = arr[i];
            }

            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

            System.out.print("LARFER VALUES: "+arr1+",");

        }


    }
