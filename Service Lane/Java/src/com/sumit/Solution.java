package com.sumit;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            serviceLane(width, i, j);
        }
    }
    public static void serviceLane(int[] width, int start, int end) {
        int min = 3;
        for(int i = start; i <= end; i++) {
            if(width[i] < min) {
                min = width[i];
            }
        }
        System.out.println(min);
    }
}
