package com.sumit;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int page = 1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i]; j++) {
                if (j + 1 == page) {
                    ans++;
                }
                if ((j + 1) % k == 0 || j == a[i] - 1) {
                    page++;
                }
            }
        }
        System.out.println(ans);

    }
}
