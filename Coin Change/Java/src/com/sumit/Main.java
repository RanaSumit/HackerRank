package com.sumit;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        BigInteger solution;
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[M];
        for(int i = 0; i < M; i++)
        {
            arr[i] = scan.nextInt();
        }
        solution = dynamic(arr, N);
        System.out.print(solution);

    }
    public static BigInteger dynamic(int[] v, int amount) {
        BigInteger[][] solution = new BigInteger[v.length + 1][amount + 1];

        // if amount=0 then just return empty set to make the change
        for (int i = 0; i <= v.length; i++) {
            solution[i][0] = new BigInteger("1");
        }

        // if no coins given, 0 ways to change the amount
        for (int i = 1; i <= amount; i++) {
            solution[0][i] = new BigInteger("0");
        }

        // now fill rest of the matrix.

        for (int i = 1; i <= v.length; i++) {
            for (int j = 1; j <= amount; j++) {
                // check if the coin value is less than the amount needed
                if (v[i - 1] <= j) {
                    // reduce the amount by coin value and
                    // use the subproblem solution (amount-v[i]) and
                    // add the solution from the top to it
                    solution[i][j] = solution[i - 1][j].add(solution[i][j - v[i - 1]]);
                } else {
                    // just copy the value from the top
                    solution[i][j] = solution[i - 1][j];
                }
            }
        }
        return solution[v.length][amount];
    }

}
