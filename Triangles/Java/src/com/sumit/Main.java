package com.sumit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int length = new Scanner(System.in).nextInt();
        int x,y,z;
        String str;
        String arr[] = new String[length];
        String result[] = new String[length];
        for(int  i = 0; i < length; i++)
        {
            str = new Scanner(System.in).nextLine();
            arr = str.split(" ");
            x = Integer.parseInt(arr[0]);
            y = Integer.parseInt(arr[1]);
            z = Integer.parseInt(arr[2]);
            if(x + y > z && y + z > x && x + z > y)
            {
                if(x == y && x == z)
                {
                    result[i] = "Equilateral";
                }
                else
                if(x == y || x == z || y == z)
                {
                    result[i] = "Isosceles";
                }
                else
                {
                    result[i] = "Scalene";
                }
            }
            else
            {
                result[i] = "Not a Triangle";
            }
        }
        for(int i = 0; i < length; i++)
        {
            System.out.println(result[i]);
        }
    }
}
