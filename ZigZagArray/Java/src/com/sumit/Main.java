package com.sumit;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int[] zigzag(int[] intArr){
        ArrayList sort = new ArrayList();
        int[] returnInts = new int[intArr.length];
        for(int i = 0; i < intArr.length; ++i){
            sort.add(intArr[i]);
        }
        int even = 1;
        for(int i = 0; i < intArr.length; ++i){
            if (even == 1){
                int max = findMax(sort);
                returnInts[i] = max;
                even = 0;
                sort.remove(Integer.valueOf(max));
            } else {
                int min = findMin(sort);
                returnInts[i] = min;
                even = 1;
                sort.remove(Integer.valueOf(min));
            }
        }
        return returnInts;
    }

    static int findMax(ArrayList input){
        int max = (int)input.get(0);
        for(int i = 1; i < input.size(); ++i){
            if(max < (int)input.get(i)){
                max = (int)input.get(i);
            }
        }
        return max;
    }
    static int findMin(ArrayList input){
        int min = (int)input.get(0);
        for(int i = 1; i < input.size(); ++i){
            if(min > (int)input.get(i)){
                min = (int)input.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }
        int[] result = zigzag(arr);
        for(int i: result){ //for printing array

            System.out.println(i);

        }


    }
}
