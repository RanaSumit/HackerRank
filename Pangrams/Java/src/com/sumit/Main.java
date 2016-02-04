package com.sumit;

import java.util.Scanner;

public class Main {

    private static int count;
    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();
        str = str.trim().toLowerCase();
        int[] a = new int[28];
        char[] ch = str.toCharArray();
        for(int i = 0; i < str.length(); i++)
        {
            if(ch[i] >= 97 && ch[i] <= 122)
            {
                a[ch[i]-97]++;
            }

        }

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > 0)
            {
                count++;
            }
        }
        if(count == 26)

            System.out.println("pangram");
        else
            System.out.println("not pangram");

    }
}
