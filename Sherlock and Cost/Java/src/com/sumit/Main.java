package com.sumit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int t = Integer.parseInt(s.nextLine());
            for(int i=0; i < t; i++){
                int n = Integer.parseInt(s.nextLine());
                int[] arr = new int[n];
                String[] input = (s.nextLine()).split(" ");
                for(int j=0; j < n; j++){
                    arr[j]=Integer.parseInt(input[j]);
                }
                int[][] dp= new int[n][2];
                dp[0][0] = 0;
                dp[0][1] = 0;
                int j=1;
                for(; j < n;j++){
                    int zeroCurrMax =
                            dp[j][0] = Math.max( dp[j-1][0] + Math.abs(arr[j]-arr[j-1]) ,
                                    dp[j-1][1] + Math.abs(arr[j] -1));
                    dp[j][1] = Math.max( dp[j-1][0] + Math.abs(1-arr[j-1]),
                            dp[j-1][1] + Math.abs(1-1));

                }
                int output = Math.max(dp[j-1][0],dp[j-1][1]);
                System.out.println(output);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
