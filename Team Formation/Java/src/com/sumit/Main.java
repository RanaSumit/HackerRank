package com.sumit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int testCases = new Scanner(System.in).nextInt();
        String str = new String();
        System.out.println(testCases);
        for(int i = 0; i < testCases; i++)
        {
            str = new Scanner(System.in).nextLine();
            solution(str);
        }
    }
    public static void solution(String string)
    {
        String[] arr = string.split(" ");
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < list.size(); i++)
        {
            list.add(Integer.parseInt(arr[i]));
        }
        System.out.println(list);

    }
}
