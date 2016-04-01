package com.sumit;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            String s = Integer.toString(n);
            int count = 0;
            for(int j=0;j<s.length();j++){
                int tmp = Character.getNumericValue(s.charAt(j));
                if(tmp!=0 && n % tmp == 0)
                    count++;
            }
            System.out.println(count);
        }
    }
}
