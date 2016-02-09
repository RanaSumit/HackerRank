package com.sumit;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < N; i++)
        {
            list.add(arr[i]);
        }

        for(int i = 0; i < K; i++)
        {
            list.remove(i);

        }
        int sum = 0;
        for(int i = 0; i < list.size(); i++)
        {
            sum = sum + list.get(i);

        }
        System.out.print(sum);
    }
}
