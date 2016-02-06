package com.sumit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int length = new Scanner(System.in).nextInt();
        int x,y,z;
        String arr[] = new String[length];
        for(int  i = 0; i < length; i++)
        {
            x = new Scanner(System.in).nextInt();
            y =  new Scanner(System.in).nextInt();
            z = new Scanner(System.in).nextInt();
            if(x == y && x == z)
            {
                arr[i] = "Equilateral";
            }
            else if(x == y || x == z || y == z)
            {
                arr[i] = "Isosceles";
            }
            else
            {
                arr[i] = "None";
            }

        }
        for(int i = 0; i < length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
