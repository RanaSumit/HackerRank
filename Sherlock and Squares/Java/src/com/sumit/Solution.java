package com.sumit;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++) {

            int lower = scan.nextInt();
            int upper = scan.nextInt();
            int count = 0;
            for(int j = lower; j <= upper; j++) {

                int x = (int)Math.sqrt(j);
                if(x*x == j) {
                    count++;
                }

            }
            System.out.println(count);

        }

    }
}
