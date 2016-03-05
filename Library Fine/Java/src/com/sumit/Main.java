package com.sumit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int day,month,year;
        day=in.nextInt();
        month=in.nextInt();
        year=in.nextInt();
        int daye, monthe,yeare;
        daye=in.nextInt();
        monthe=in.nextInt();
        yeare=in.nextInt();
        int fine=0;
        if((day>daye && month==monthe && year==yeare))
            fine=15*(day-daye);
        if((month>monthe && year==yeare))
            fine=500*(month-monthe);
        if(year>yeare)
            fine=10000;
        System.out.println(fine);

    }
}
