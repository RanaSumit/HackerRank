package com.sumit;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
	    Scanner scan = new Scanner(System.in);
        BigInteger first, second, result = null;
        first = scan.nextBigInteger();
        second = scan.nextBigInteger();
        n = scan.nextInt();
        for(int i = 1; i <= n - 2; i++)
        {
            result = (second.pow(2)).add(first);
            first = second;
            second = result;
        }

        System.out.println(result);
    }
}
