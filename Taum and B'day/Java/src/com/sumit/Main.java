package com.sumit;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        //Parses the number of cases
        int numberOfCases = Integer.parseInt(stdin.nextLine());
        int B = 0;
        int W = 0;
        int X = 0;
        int Y = 0;
        int Z = 0;
        BigInteger bestBlackCost = new BigInteger("0");
        BigInteger bestWhiteCost = new BigInteger("0");
        BigInteger netBlackCost = new BigInteger("0");
        BigInteger netWhiteCost = new BigInteger("0");
        for(int a = 0; a < numberOfCases; a++){

            //Parse the value of B and W
            B = stdin.nextInt();
            W = stdin.nextInt();
            stdin.nextLine();

            //Parse the value of X, Y, and Z
            X = stdin.nextInt();
            Y = stdin.nextInt();
            Z = stdin.nextInt();
            //find best black and white cost
            bestBlackCost = new BigInteger("" + Math.min(X, Y+Z));
            bestWhiteCost = new BigInteger("" + Math.min(Y, X+Z));

            netBlackCost = bestBlackCost.multiply(new BigInteger(B + ""));
            netWhiteCost = bestWhiteCost.multiply(new BigInteger(W + ""));

            System.out.println(netBlackCost.add(netWhiteCost));
        }
    }
}
