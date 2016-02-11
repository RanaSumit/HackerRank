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
            contiguous(elements, size);
            nonContiguous(elements, size);
        }
    }
    public static void contiguous(int[] elements, int size)
    {

        int maxsum = 0;
        int sum = 0;
        for (int i = 0; i < elements.length; i++)
        {
            sum += elements[i];
            if (maxsum < sum)
            {
                maxsum = sum;
            }
            else if(sum < 0)
            {
                sum = 0;
            }

        }
        if(maxsum == 0)
        {
            for(int i = 0; i < size; i++)
            {
                if(elements[i] < 0)
                {
                    if(elements[i] > maxsum || maxsum == 0)
                    {
                        maxsum = elements[i];
                    }
                }
            }
        }
        System.out.print(maxsum+ " ");

    }
    public static void nonContiguous(int[] elements, int size)
    {
        int result = 0;
        for(int i = 0; i < size; i++)
        {
            if(elements[i] > 0)
                result = result + elements[i];
        }
        if(result == 0)
        {
            for(int i = 0; i < size; i++)
            {
                if(elements[i] < 0)
                {
                    if(elements[i] > result || result == 0)
                    {
                        result = elements[i];
                    }
                }
            }
        }
        System.out.print(result);
        System.out.println();
    }
}
