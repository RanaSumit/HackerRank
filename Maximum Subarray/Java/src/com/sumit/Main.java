package com.sumit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for(int i = 0; i  < testCases; i++)
        {
            int size = scan.nextInt();
            int[] elements = new int[size];
            for(int j = 0; j < size; j++)
            {
                elements[j] = scan.nextInt();
            }
            contigous(elements, size);
            nonContigous(elements, size);
        }
    }
    public static void contigous(int[] elements, int size)
    {
        List<Integer> result = new ArrayList<Integer>();
        int maxEnd = 0, maxSoFar= 0;
        for(int i = 0; i < size; i++)
        {
            maxEnd = Math.max(0, maxEnd + elements[i]);
            maxSoFar = Math.max(maxSoFar, maxEnd);

        }

        System.out.print(maxSoFar+ " ");

    }
    public static void nonContigous(int[] a, int size)
    {


        int sum0=0; //will hold the sum till i-2
        int sum1=0;//will hold the sum till i-1
        for(int k : a){
            int x=Math.max(sum0+k, sum1);//max(sum till (i-2)+a[i], sum till (i-1))
            sum0=sum1;
            sum1=x;
        }

        /*List<Integer> result = new ArrayList<Integer>();
        int sum1 = elements[0];
        int maxSoFar = elements[0];
        int sum2 = 0;
        for(int i = 0; i < size; i++)
        {
            maxSoFar = Math.max(sum2 + elements[i], sum1);
            sum2 = sum1;
            sum1 = maxSoFar;
        }*/
        System.out.print(sum1);
        System.out.println();
    }
}
