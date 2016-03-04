package com.sumit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int result = 0;
            int bought = n / c;
            result += bought;

            int wrappers = bought;
            while (wrappers >= m) {
                int freeChoco = wrappers / m;
                result += freeChoco;
                wrappers = wrappers - freeChoco * m + freeChoco;
            }
            System.out.println(result);

        }
    }
}
