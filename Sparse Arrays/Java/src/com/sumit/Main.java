package com.sumit;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        ArrayList<String> string = new ArrayList<String>();
        for(int i = 0; i < p; i++) {
            string.add(scan.next());
        }
        int q = scan.nextInt();
        ArrayList<String> queries = new ArrayList<String>();
        for(int i = 0; i < q; i++) {
            queries.add(scan.next());
        }
        for(int i = 0; i < q; i++) {
            Solution(string, queries.get(i));
        }


    }
    public static void Solution(ArrayList<String> string, String query) {
        int count = 0;
        for(int i = 0; i < string.size(); i++) {
            if(string.get(i).equals(query)) count++;
        }
        System.out.println(count);
    }
}