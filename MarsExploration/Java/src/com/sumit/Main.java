package com.sumit;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int length = S.length();
        int count = 0;
        String repeated = new String(new char[length/3]).replace("\0", "SOS");
        for(int  i = 0; i < length; i++)
        {


                char c1 = S.charAt(i);
                char c2 = repeated.charAt(i);
                if(c1 != c2)
                {
                    count++;
                }

        }
        System.out.println(count);
    }
}
